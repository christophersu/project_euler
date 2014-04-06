import java.util.*;
import java.math.*;

//Self powers
//Problem 48

public class Main {
	public static void main(String[] args) {
		Queue<Integer> tri = new LinkedList<Integer>();
		Queue<Integer> pent = new LinkedList<Integer>();
		Queue<Integer> hex = new LinkedList<Integer>();

		for(int n = 144; n < 10000; n++) {
			tri.add(n*(n+1)*(1/2));
			pent.add(n*(3*n-1)*(1/2));
			hex.add(n*(2*n-1));
		}

		while(!tri.isEmpty()) {
			int current = tri.remove();
			if (pent.contains(current) && hex.contains(current)) {
				System.out.println(current);
				break;
			}
		}
	}
}