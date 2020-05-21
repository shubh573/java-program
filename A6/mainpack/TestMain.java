package mainpack;

import maths.*;
import stats.*;

public class TestMain {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		System.out.println("Maximum Number" + MathsOperations.maximum(a, b, c));
		System.out.println("Minimum Number:" + MathsOperations.minimum(a, b, c));
		System.out.println("Average of Numbers:" + StatsOperations.average(a, b, c));
		System.out.println("Median of Numbers:" + StatsOperations.median(a, b, c));
	}

}
