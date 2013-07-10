import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int primeChecker = 2;
		while(primes.size() < 10000) {
			if (isPrime(primeChecker)) primes.add(primeChecker);
			primeChecker++;
		}
		System.out.println(primes.get(9999));
	}
	
	public static boolean isPrime(int n) {
		if ((n <= 1) || (n % 2 == 0)) return false;
		if (n == 2)return true;
		for (int i = 3; i <= Math.sqrt(n) + 1; i = i + 2) {
		    if (n % i == 0) {
		        return false;
			}
		}
		return true;
	}
}