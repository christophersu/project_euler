import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> primeFactors = findPrimeFactors(600851475143L);
		System.out.println(primeFactors.get(primeFactors.size() - 1)+"");
	}

	public static ArrayList<Integer> findPrimeFactors(long x) {
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		for (int n = 2; n <= Math.ceil(Math.sqrt(x)); n++) {
			if (x % n == 0) {
				if (isPrime(n)) primeFactors.add(n);
				if (isPrime((int)(x/n))) primeFactors.add((int)(x/n));
			}
		}
		return primeFactors;
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