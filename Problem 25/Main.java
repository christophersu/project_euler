import java.util.*;

//1000-digit Fibonacci number
//Problem 25

public class Main {
	public static void main(String[] args) {
		int twoBefore = 1;
		int oneBefore = 1;
		int next = twoBefore + oneBefore;
		while((next+"").length() < 1000) {
			twoBefore = oneBefore;
			oneBefore = next;
			next = twoBefore + oneBefore;
		}
		System.out.println(next);
	}
}