package CollectionsInJava;

public class FinallyConcept {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}

	public static void test1() {
		try {
			System.out.println("Inside a try block");
			throw new RuntimeException("Huhhhhh");
		} catch (Exception e) {
			System.out.println("Inside a catch block");
		}

		finally {
			System.out.println("Finally code in a test1 method");
		}
	}

	public static void test2() {
		try {
			System.out.println("Inside a test2 method");
		}

		finally {
			System.out.println("Finally code in a test2 method");
		}
	}

	public static void test3() {
		int i = 0;
		try {
			System.out.println("Inside a try block");
			int k = i / 0;
		}
		// catch(ArithmeticException e)
		catch (NullPointerException e) {
			System.out.println("Inside a catch block");
			System.out.println("Divide by zero error");
		} finally {
			System.out.println("Execute the code even after any exception");
		}
	}

}
