import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		System.out.println(route(0, 0,0));
	}

	public static int route(int count, int x, int y) {
		// 0, 0 is upper left corner
		if (x >= 20 && y >= 20) {
			return count;
		}
		else {
			if (x < 20) {
				count = route(count, x+1, y);
				count++;
			}
			if (y < 20) {
				count = route(count, x, y+1);
				count++;
			}
			return count;
		}
	}
}