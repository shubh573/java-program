package stats;

public class StatsOperations {

	public static int average(int x, int y, int z) {
		int avg = (x + y + z) / 3;
		return avg;
	}

	public static int median(int a, int b, int c) {
		if ((b < a && a < c) || (c < a && a < b)) {
			return a;
		} else if ((a < b && b < c) || (c < b && b < a)) {
			return b;
		} else {
			return c;

		}
	}
}
