package CollectionsInJava;

public class ExceptionHandling {
	int j = 10;

	public static void main(String[] args) {

		// uncaught exception
		// int i = 9/0;
		// System.out.println(i);

		// caught exception
		// Thread.sleep(2000);

		// ExceptionHandling EH = new ExceptionHandling();
		// EH = null;
		// System.out.println(EH.j);

		// 1. Try-catch block :

		try {
			int i = 9 / 0; // this code will throw a exception
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("Heli");

	}

}
