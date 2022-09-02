package com.test;

public class Testing {

	public static void main(String[] args) {

		int num = 54748;
		int num1 = num;
		int res = 0;
		while (num > 0) {

			int sum = num % 10;
			res = res + sum * sum * sum * sum * sum;
			num = num / 10;

		}
		if (num1 == res) {

			System.out.println("Given no is Armstrong number");

		} else {

			System.out.println("Given no is not Armstrong number");

		}

	}

}
