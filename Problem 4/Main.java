public class Main {
	public static void main(String[] args) {
		int palindromic = 12321;
		for (int a = 111; a < 1000; a++) {
			for (int b = 111; b < 1000; b++) {
				if ((((a*b)+"").equals(reverseString(((a*b)+"")))) && (a*b >palindromic)) palindromic = a*b;
			}
		}
		System.out.println(palindromic);
	}
	
	public static String reverseString(String x) {
		char[] word = x.toCharArray();
		int y = 0;
		int z = word.length - 1;
		while (y < z) {
			char t = word[y];
			word[y] = word[z];
			word[z] = t;
			y++; z--;
		}
		String reversed = "";
		for (char a : word) reversed += a;
		return reversed;
	}
}