package OOPConceptsPart2;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar = new ArrayList();

		ar.add(100); // 0
		ar.add(200); // 1
		ar.add(300); // 2

		System.out.println(ar.size());

		ar.add(400); // 3
		ar.add(500); // 4

		System.out.println(ar.size());

		ar.add("Hello"); // 5
		ar.add("Heli"); // 6
		ar.add(12.33); // 7
		ar.add('H'); // 8
		ar.add(600); // 9

		System.out.println(ar.size());

		ar.remove(9);

		System.out.println(ar.size());

		System.out.println(ar.get(3));
		System.out.println(ar.get(6));
		// System.out.println(ar.get(9));

		// To print all the values of array list : For loop

		int i;
		for (i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		ArrayList<Integer> ar1 = new <Integer>ArrayList();

		ar1.add(100); // 0
		// ar1.add('H');

		System.out.println(ar1.get(0));

		ArrayList<String> ar2 = new <String>ArrayList();

		ar2.add("Heliiiiii"); // 0
		// ar2.add('H');
		// ar2.add(973);

		System.out.println(ar2.get(0));

	}
}
