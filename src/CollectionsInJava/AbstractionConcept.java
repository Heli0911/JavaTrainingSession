package CollectionsInJava;

public abstract class AbstractionConcept {

	// can use any variables
	int i = 50;
	final int i1 = 40;
	static String s1 = "Helloo";

	// partial abstraction --- can have abstract method and non abstract method
	// abstraction means hiding the implementation logic
	// it cannot be used to create the objects

	public abstract void Animal(); // abstract method --- no method body

	// non abstract methods
	public void sleep() {
		System.out.println("zzzzzzz");
	}

	public void animalsound() {
		System.out.println("bhow bhow bhow");
	}
}
