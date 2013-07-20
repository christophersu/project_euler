import java.util.*;

public class Main {
	public static void main(String[] args) {
		int end = 2000000;
		boolean[] primeSieve = new boolean[end + 1];
		for (int i = 2; i <= end; i++)
			primeSieve[i] = true;
		for (long i = 2; i*i <= end; i++) {
            if (primeSieve[(int)i])
                for (long j = i; i*j <= end; j++)
                    primeSieve[(int)(i*j)] = false;
        }
        long sum = 0;
        for (int i = 0; i < end; i++)
        	if(primeSieve[i]) sum += i;
        System.out.println(sum);
	}
}