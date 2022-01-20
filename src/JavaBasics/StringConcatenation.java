package JavaBasics;

public class StringConcatenation {

	private static final String Hello = null;

	public static void main(String[] args) {

		int i = 100;
		int j = 200;
		String s1 = "Hello";
		String s2 = "World";

		System.out.println(i + s1);
		System.out.println(s1 + s2);
		System.out.println(i + j + s1 + s2);
		System.out.println(s1 + s2 + i + j);

	}

}