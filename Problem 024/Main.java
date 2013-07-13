import java.util.*;

// Lexicographic permutations
// Problem 24
// What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?

public class Main {
	public static void main(String[] args) {
		System.out.println(findPermutationAt(1000000));
	}

	public static String findPermutationAt(int end) {
		int counter = 1;
		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				if (a == b) {}
				else {
					for (int c = 0; c < 10; c++) {
						if ((""+a+b).contains(c+"")) {}
						else {
							for (int d = 0; d < 10; d++) {
								if ((""+a+b+c).contains(d+"")) {}
								else {
									for (int e = 0; e < 10; e++) {
										if ((""+a+b+c+d).contains(e+"")) {}
										else {
											for (int f = 0; f < 10; f++) {
												if ((""+a+b+c+d+e).contains(f+"")) {}
												else {
													for (int g = 0; g < 10; g++) {
														if ((""+a+b+c+d+e+f).contains(g+"")) {}
														else {
															for (int h = 0; h < 10; h++) {
																if ((""+a+b+c+d+e+f+g).contains(h+"")) {}
																else {
																	for (int i = 0; i < 10; i++) {
																		if ((""+a+b+c+d+e+f+g+h).contains(i+"")) {}
																		else {
																			for (int j = 0; j < 10; j++) {
																				if ((""+a+b+c+d+e+f+g+h+i).contains(j+"")) {}
																				else {
																					counter++;
																					if (counter == end+1) return (""+a+b+c+d+e+f+g+h+i+j);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	return "";
	}
}