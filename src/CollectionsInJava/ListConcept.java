package CollectionsInJava;
//import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ListConcept {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[3]; // static method : size is fixed

		// dynamic array --- Array list
		// 1.can contain duplicate values/elements
		// 2.maintain insertion order
		// 3.synchronized
		// 4.allow random access to fetch the elements because it stores the values on
		// the basis to indexes

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
		System.out.println(ar.get(3));
		System.out.println(ar.get(6));

		// To print all the values of array list :
		// 1.For loop
		// 2.using Iterator

		int i;
		for (i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// non generic vs. generic

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100); // 0

		ArrayList<String> ar2 = new ArrayList();
		ar2.add("Hiiiiii"); // 0
		ar2.add("Heliiiiii"); // 1 System.out.println(ar2.get(0));
		System.out.println(ar2.get(1));

		ArrayList<E> ar3 = new ArrayList<E>();

		// employee class objects:

		Employee e1 = new Employee("Heli", 22, "QA");
		Employee e2 = new Employee("Astha", 22, "QA");
		Employee e3 = new Employee("Shailly", 22, "Dev");

		// create ArrayList :

		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);

		// iterator to transverse the values :

		Iterator<Employee> it = ar4.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println("emp.Name");
			System.out.println("emp.Age");
			System.out.println("emp.Department");
		}

		System.out.println("****************");

		// addAll

		ArrayList<String> ar5 = new ArrayList<String>();

		ar5.add("Hiii");
		ar5.add("Heli");
		ar5.add("How are you?");

		ArrayList<String> ar6 = new ArrayList<String>();

		ar5.add("Heli");
		ar5.add("Kem 6o?");
		ar5.add("Majama?");

		ar5.addAll(ar6);

		for (i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}

		System.out.println("****************");

		// removeAll

		ar5.removeAll(ar6);

		for (i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}

		System.out.println("****************");

		// retainAll

		ar5.retainAll(ar6);

		for (i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}

	}

}
