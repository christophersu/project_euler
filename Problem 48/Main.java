import java.util.*;
import java.math.*;

//Self powers
//Problem 48

public class Main {
	public static void main(String[] args) {
		BigInteger sum = new BigInteger("0");
		for (int i = 1; i < 1000; i++) {
			sum = sum.add((new BigInteger(i+"")).pow(i));
		}
		System.out.println(sum);
	}
}