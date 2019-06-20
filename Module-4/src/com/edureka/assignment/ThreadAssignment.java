package com.edureka.assignment;

class TableFive implements Runnable {

	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("5 *" + i + " = " + 5 * i);
		}
	}
}

public class ThreadAssignment {

	public static void main(String[] args) throws Exception {

		Runnable obj1 = new TableFive();
		Thread t1 = new Thread(obj1);
		t1.start();
		t1.join();
		System.out.println("----------------------");
		System.out.println("Twenty even numbers are: ");
		for (int i = 1; i <= 40; i++) {

			if (i % 2 == 0) {
				System.out.printf("%s ", i);
			}
		}

	}

}
