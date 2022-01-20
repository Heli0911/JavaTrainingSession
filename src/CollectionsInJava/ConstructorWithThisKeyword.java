package CollectionsInJava;

public class ConstructorWithThisKeyword {
	// class variables
	String name;
	int age;

	// it is used to eliminate the confusion between class vars and parameters with
	// the same name.
	public ConstructorWithThisKeyword(String name, int age) {
		this.name = name; // this.classvar = localvar
		this.age = age;

		// name = name1
		// age = age1

		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Heli", 22);

	}

}
