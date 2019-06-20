package com.edureka.secondpackage;

public class PackageFunctions {

	int num1 = 56;
	int num2 = 7;
	int num;
	double fact;
	int reverse;

	public void substract() {

		int num3 = (num1 - num2);
		System.out.println("Substraction of two numbers " + num1 + " and " + num2 + " is " + num3);
	}

	public void multiply() {

		int num3 = (num1 * num2);
		System.out.println("Multiplication of two numbers " + num1 + " and " + num2 + " is " + num3);
	}

	public void divide() {

		float num3 = (num1 / num2);
		System.out.println("Division of two numbers " + num1 + " and " + num2 + " is " + num3);
	}

	public void factorial(int n) {
		fact = 1;
		num = n;
		if (num > 0) {
			for (int i = 1; i <= n; i++)
				fact = fact * i;
			System.out.println("Factorial of " + num + " is " + fact);
		}

		else if (num == 0) {

			System.out.println("Factorial of " + num + " is 1");
		} else {
			System.out.println("Factorial of the given number not possible");
		}

	}

	public void reverse(int m) {

		num = m;
		reverse = 0;

		for (int i = num; i > 0; i = i / 10) {

			reverse = (reverse * 10) + (i % 10);

		}
		System.out.println("Reverse of the given number " + num + " is " + reverse);

	}

}
