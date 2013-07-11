import java.util.*;

public class Failed {
	static boolean[] primes = new boolean[2000000]; 
	public static void main(String[] args) {
		sieve();
		int sum = 2;
		for (int i = 3; i < 2000000; i = i+2) {
			if (primes[i]) sum += i;
		}
		System.out.println(sum);
	}

	public static void sieve() {
	    Arrays.fill(primes, true);
	    primes[0] = primes[1] = false;
	    for (int i = 2; i < primes.length; i++) {
	        if(primes[i]) {
	            for (int j = 2; i*j < primes.length; j++) {
	                primes[i*j] = false;
	            }
	        }
	    }
	}
}