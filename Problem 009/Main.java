import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		for (int z = 3; z < 1000; z++) {
			for (int y = 3; y < z; y++) {
				for (int x = 3; x < y; x++) {
					if (((x*x)+(y*y))==(z*z)) {
						a.add(x);
						b.add(y);
						c.add(z);
					}
				}
			}
		}
		for(int i = 0; i < a.size(); i++) {
			if ((a.get(i)+b.get(i)+c.get(i)) == 1000)
				System.out.println(a.get(i)*b.get(i)*c.get(i));
		}
	}
}