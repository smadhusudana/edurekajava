package com.edureka.assignment;

interface Queue {

	void insert(String[] a);

	void delete(String[] a);
}

class QueueExample implements Queue {
	QueueExample(String[] a) {
	}

	@Override
	public void insert(String[] a) {
		int index = 1;
		String value = "kamil";

		for (int i = a.length - 1; i > index; i--) {
			a[i] = a[i - 1];
		}

		a[index] = value;
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}
	}

	@Override
	public void delete(String[] a) {
		String value = "Sunil";
		for (int i = 0; i < a.length; i++) {
			if ("Sunil" == a[i]) {
				for (int j = i; j < a.length - 1; j++) {
					a[j] = a[j + 1];
				}
				break;
			}

		}
		for (int i = 0; i < a.length - 1; i++) {
			System.out.println(a[i]);
		}
	}

}

public class QueueAssignment {

	public static void main(String[] args) {

		String[] a = { "Anil", "Sunil", "Jamil" };

		Queue q1 = new QueueExample(a);
		q1.insert(a);
		System.out.println("-------------------------");
		q1.delete(a);

	}

}
