import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		BigInteger x = new BigInteger("2");
		x = x.pow(1000);
		String number = x.toString();
		int sum = 0;
		for (int i = 0; i < number.length(); i++) {
			sum += Integer.parseInt(number.substring(i, i+1));
		}
		System.out.println(sum);
	}
}