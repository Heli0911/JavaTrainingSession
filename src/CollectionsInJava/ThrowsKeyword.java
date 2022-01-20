package CollectionsInJava;

public class ThrowsKeyword {

	public static void main(String[] args) throws ArithmeticException {

		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		System.out.println("Heliii");
	}

	public void sum() throws ArithmeticException {
		div();
	}

	public void div() throws ArithmeticException {
		int i = 9 / 0; // exception line
	}

}
