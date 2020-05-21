package ass10;

import java.util.Scanner;

public class NumTest {

	public static void main(String[] args) {
		
		int con;
		Scanner sc = new Scanner(System.in);
		
		int number = Integer.parseInt(args[0]);
		
		IntOperations op = new MyNumber(number);
		
		do {
		int ch = 0;
		System.out.println("\nEnter your choise\n:1.isPositive\n2.isNegative\n3.isOdd\n4.isEven\n5.isPrime\n6.Factorial\n7.Sum of digit\n8.Exit\t");
		ch = sc.nextInt();

		switch (ch) {
		case 1:
			if (op.isPositive()) {
				System.out.println("Number is positive");
			} else {
				System.out.println("Number is not positive");
			}
			break;
		case 2:
			if (op.isNegative()) {
				System.out.println("Number is negative");
			} else {
				System.out.println("Number is not negative");
			}
			break;
		case 3:
			if (op.isOdd()) {
				System.out.println("Number is odd");
			} else {
				System.out.println("Number is not");
			}
			break;
		case 4:
			if (op.isEven()) {
				System.out.println("Number is even");
			} else {
				System.out.println("Number is not even");
			}
			break;
		case 5:
			if (op.isPrime()) {
				System.out.println(number + " is prime");
			} else {
				System.out.println(number + " Number is not prime");
			}
			break;
		case 6:
			System.out.println("Factorial of " + number + " is:" + op.factorial());
			break;
		case 7:
			System.out.println("Sum of digit:" + op.sumOfDigit());
			break;
		case 8: break;	
		
		default:
			System.out.println("Please enter valid choice");
		}
		
		System.out.println("Do you want to continue?1.Yes 2.No");
		con=sc.nextInt();
		}while(con==1);

		sc.close();
	}
}
