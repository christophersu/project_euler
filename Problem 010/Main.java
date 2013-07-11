import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int x = 3;
		int y;
		boolean isPrime;
		primes.add(2);
		while (x <= 2000000) {
			y = 0;
			isPrime = true;
			while (primes.get(y)*primes.get(y) <= x) {
				if (x % primes.get(y) == 0) {
					isPrime = false;
					break;
				}
				y++;
			}
			if (isPrime) primes.add(x);
			x += 2;
		}
		int sum = 0;
		for (int z : primes) sum += z;
		System.out.println(sum);
	}
}