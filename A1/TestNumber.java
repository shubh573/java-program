package ass1;

import java.util.Scanner;

class MyNumber {

	private int data;

	public MyNumber(int data) {
		this.data = data;
	}

	public boolean isNagative(int data) {
		return data < 0;
	}

	public boolean isPositive(int data) {
		return data > 0;
	}

	public boolean isZero(int data) {
		return data == 0;
	}

	public boolean isOdd(int data) {
		return data % 2 != 0;
	}

	public boolean isEven(int data) {
		return data % 2 == 0;

	}
}

public class TestNumber {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number");
		int n = s.nextInt();

		MyNumber t1 = new MyNumber(n);

		boolean a = t1.isNagative(n);
		if (a == true)
			System.out.print("Number:" + n + " is Nagative\n");

		boolean b = t1.isPositive(n);
		if (b == true)
			System.out.print("Number:" + n + " is Positive\n");

		boolean c = t1.isZero(n);
		if (c == true)
			System.out.print("Number:" + n + " is Zero\n");

		boolean d = t1.isOdd(n);
		if (d == true)
			System.out.print("Number:" + n + " is Odd\n");

		boolean e = t1.isEven(n);
		if (e == true)
			System.out.print("Number:" + n + " is Even\n");

		s.close();

	}
}
