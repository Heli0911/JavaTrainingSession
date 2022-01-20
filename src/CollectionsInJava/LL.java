package CollectionsInJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<String>();

		// add
		ll.add("1");
		ll.add("Heluu");
		ll.add("2");
		ll.add("Krima");
		ll.add("3");
		ll.add("Krisha");

		// print
		System.out.println("Contents of LinkedList :" + ll);

		// addfirst
		ll.addFirst("Start");
		System.out.println("Contents of LinkedList :" + ll);

		// addlast
		ll.addLast("End");
		System.out.println("Contents of LinkedList :" + ll);

		// get
		System.out.println(ll.get(2));

		// set
		ll.set(4, "Krisha");
		System.out.println(ll.get(4));

		// removefirst
		ll.removeFirst();

		// removelast
		ll.removeLast();

		System.out.println("Contents of LinkedList :" + ll);

		ll.remove(3);
		System.out.println("Contents of LinkedList :" + ll);

		// how to print all the values of Linked list :
		// using for loop

		System.out.println("Using For Loop :");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		System.out.println("Using Advance For Loop :");
		for (String str : ll) {
			System.out.println(str);
		}

		System.out.println("Using Iterator :");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("Using While Loop :");
		int n = 0;
		while (ll.size() > n) {
			System.out.println(ll.get(n));
			n++;
		}
	}

}
