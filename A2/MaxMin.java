package ass2;

class FindMaxMin {

	private int a, b, c;

	public FindMaxMin(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int max() {
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else {
			return c;
		}
	}

	public int min() {
		if (a < b && a < b) {
			return a;
		} else if (b < a && b < c) {
			return b;
		} else {
			return c;
		}
	}
}

public class MaxMin{
	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = Integer.parseInt(args[2]);
		
		FindMaxMin obj = new FindMaxMin(n1, n2, n3);
		
		System.out.println("Maximum number is :" + obj.max());
		System.out.println("Minimum number is :" + obj.min());
	}

}
