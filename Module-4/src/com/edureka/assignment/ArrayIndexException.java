package com.edureka.assignment;

public class ArrayIndexException {

	public static void main(String[] args) throws Exception {

		String[] name = { "Madhuri", "Nagma", "Rinka", "Jyothi" };

		int n = 6;
		System.out.print("{ ");
		try {
			for (int index = 0; index < n; index++) {
				System.out.printf(" %s ", name[index]);

			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print(" }");
			System.out.println();
			System.out.println("Error: " + e);
		}

		;

	}

}
