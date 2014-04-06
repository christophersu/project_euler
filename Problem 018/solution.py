#!/usr/bin/env python

rows = []
with open('triangle.txt') as f:
	for line in f:
		row = []
		for i in line.rstrip('\n').split(" "):
			row.append(int(i))
		rows.append(row)

def sumUp(currentRow, rowData):
	# print currentRow
	# print rowData
	for i in range(len(rowData)):
		rows[currentRow][i] += max([rows[currentRow+1][i], rows[currentRow+1][i+1]])
	# print rows[currentRow]
	if currentRow == 0:
		return rows[0][0]
	else:
		return sumUp(currentRow-1, rows[currentRow-1])

print sumUp(len(rows)-2, rows[len(rows)-2])