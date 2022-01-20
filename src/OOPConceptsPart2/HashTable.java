package OOPConceptsPart2;

import java.util.HashMap;

public class HashTable {

	public static void main(String[] args) {
	
		HashMap<String, String> h = new HashMap<String, String>();

		h.put("A", "Hello");
		h.put("B", "Heli");
		h.put("C", "How are you?");

		System.out.println(h.size());

		HashMap<Integer, String> h1 = new HashMap<Integer, String>();

		h1.put(1, "Astha"); // 1
		h1.put(2, "Avi"); // 2
		h1.put(3, "Heli"); // 3
		h1.put(4, "Himanshu"); // 4

		System.out.println(h1.get(1));
		System.out.println(h1.get(2));
		System.out.println(h1.get(3));
		System.out.println(h1.get(4));

	}

}
