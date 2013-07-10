public class Main {
	public static void main(String[] args) {
		int n = 0;
		int twoBefore = 1;
		int oneBefore = 2;
		int evenSum = 2;
		while (n <= 4000000) {
			n = twoBefore + oneBefore;
			twoBefore = oneBefore;
			oneBefore = n;
			if (n % 2 == 0) evenSum += n;
		}
		System.out.println(evenSum);
	}
}