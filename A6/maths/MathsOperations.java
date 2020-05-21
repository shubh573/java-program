package maths;

public class MathsOperations {

	public static int maximum(int x, int y, int z) {
		if (x > y && x > z) {
			return x;
		} else if (y > x && y > z) {
			return y;
		} else {
			return z;
		}
	}

	public static int minimum(int x, int y, int z) {
		if (x < y && x < z) {
			return x;
		} else if (y < x && y < z) {
			return y;
		} else {
			return z;
		}
	}
}
