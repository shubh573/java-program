package ass10;

class MyNumber implements IntOperations {

	private int num;

	public MyNumber() {
		num = 0;
	}

	public MyNumber(int number) {
		this.num = number;
	}

	public boolean isPositive() {
		return num > 0;
	}

	public boolean isNegative() {
		return num < 0;
	}

	public boolean isEven() {
		return num % 2 == 0;
	}

	public boolean isOdd() {
		return num % 2 != 0;
	}

	public boolean isPrime() {
		for(int i=2;i<num;i++) {
	        if(num%i==0)
	            return false;
	    }
	    return true;
	}

	public int factorial() {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public int sumOfDigit() {
		int digit, sum = 0;
		while (num > 0) {
			digit = num % 10;
			sum = sum + digit;
			num /= 10;
		}
		return sum;
	}

}