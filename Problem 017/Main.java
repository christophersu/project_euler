import java.util.*;

//Number letter counts
//Problem 17
//PROTIP: 40 IS SPELLED FORTY NOT FOURTY. Q_Q

public class Main {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++)
			sum += spellNumber(i).replaceAll("\\s","").length();
		System.out.println(sum);
	}
	
	public static String spellNumber(int x) {
		String[] ones = {"","one","two","three","four","five","six","seven","eight","nine"};
		String[] tens = {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		String[] special = {"","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String word = "";
		if (x == 1000) word = "one thousand";
		else if (x == 10) word = "ten";
		else if (x > 10 && x < 20) word = special[Integer.parseInt((x+"").substring(1,2))];
		else if (x >= 100) {
			word = ones[Integer.parseInt((x+"").substring(0,1))] + " hundred";
			if (Integer.parseInt((x+"").substring(1,2)) != 0) {
				if (Integer.parseInt((x+"").substring(1,3)) > 10 && Integer.parseInt((x+"").substring(1,3)) < 20)
					word = word + " and " + special[Integer.parseInt((x+"").substring(2,3))];
				else
					word = word + " and " + tens[Integer.parseInt((x+"").substring(1,2))];
				if (Integer.parseInt((x+"").substring(2,3)) != 0 && !(Integer.parseInt((x+"").substring(1,3)) > 10 && Integer.parseInt((x+"").substring(1,3)) < 20))
					word = word + " " + ones[Integer.parseInt((x+"").substring(2,3))];
			}
			else if (Integer.parseInt((x+"").substring(2,3)) != 0)
				word = word + " and " + ones[Integer.parseInt((x+"").substring(2,3))];
		}
		else if (x > 10 && x < 100) {
			word = tens[Integer.parseInt((x+"").substring(0,1))];
			if (Integer.parseInt((x+"").substring(1,2)) != 0)
				word = word + " " + ones[Integer.parseInt((x+"").substring(1,2))];
		}
		else if (x < 10)
			word = ones[Integer.parseInt((x+"").substring(0,1))];
		return word;
	}
}