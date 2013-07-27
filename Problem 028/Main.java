public class Main {
	public static void main(String[] args) {
		int current = 1;
		int increment = 2;
		int sum = 1;
		for (int x = 0; x < 500; x++) {
			for (int y = 0; y < 4; y++) {
				current += increment;
				sum += current;
			}
			increment += 2;
		}
		System.out.println(sum);
	}
}