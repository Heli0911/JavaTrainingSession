package OOPConcepts;

public class LocalAndGlobalVariables {
	// Global variables -- Class variables

	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {
		int i = 10; // local variable for main method
		System.out.println(i);

		LocalAndGlobalVariables obj = new LocalAndGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

	public void sum() {
		int i = 15;
		int j = 20;
		int age = 25;
	}
}