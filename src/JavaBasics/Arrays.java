package JavaBasics;

public class Arrays {

	public static void main(String[] args) {

		String[] Names = { "Astha", "Avi", "Heli", "Himanshu" };
		System.out.println(Names[2]);
		System.out.println(Names.length);

		int[] numbers = { 1, 2, 3, 4 };
		System.out.println(numbers[0]);
		System.out.println(numbers.length);

		// multidimentional arrays :
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		int x = matrix[1][2];
		System.out.println(x);

	}

}
