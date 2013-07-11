public class Main {
	public static void main(String[] args) {
		int sumOfTheSquares = 0;
		int squareOfTheSums = 0;
		for (int i = 1; i <= 100; i++) sumOfTheSquares += i*i;
		for (int i = 1; i <= 100; i++) squareOfTheSums += i;
		squareOfTheSums = squareOfTheSums*squareOfTheSums;
		System.out.println(sumOfTheSquares-squareOfTheSums);
	}
}