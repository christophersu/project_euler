import java.util.*;

public class Main {
	public static void main(String[] args) {
		//int triangleCounter = 7;
		int triangleNumber = 28;
		while (numberOfDivisors(triangleNumber) < 501) {
			//triangleCounter++;
			//triangleNumber = triangleNumber + triangleCounter;
			triangleNumber++;
		}
		System.out.println(triangleNumber);
	}
	
	public static int numberOfDivisors(int x) {
		int divisors = 0;
		int inc = 1;
		if (x % 2 != 0) inc = 2;
		for (int c = 1; c <= x / 2; c = c+inc) {
			if (x % c == 0) divisors++;
		}
		return divisors;
	}
}