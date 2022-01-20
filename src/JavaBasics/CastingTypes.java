package JavaBasics;

public class CastingTypes {

	public static void main(String[] args) {
		
		//byte < short < char < int < long < float < double
		// widening casting : converting a smaller type to a larger type size
		int i = 9;
		double d = i; // Automatic casting: int to double

		System.out.println(i);
		System.out.println(d);

		// narrowing casting : converting a larger type to a smaller size type
		double d1 = 9.78d;
		int i1 = (int) d1; // Manual casting: double to int

		System.out.println(d1);
		System.out.println(i1);

	}

}
