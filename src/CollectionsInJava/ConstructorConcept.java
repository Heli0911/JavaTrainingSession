package CollectionsInJava;

public class ConstructorConcept {

	// constructor name should same as class name
	// can overload
	// it is used to initialize the class properties
	public ConstructorConcept() {
		System.out.println("Default Constant");
	}

	public ConstructorConcept(int i) {
		System.out.println("Single Parameter Constructor");
		System.out.println("the value of i is : " + i);
	}

	public ConstructorConcept(int i, int j) {
		System.out.println("Two Parameter Constructor");
		System.out.println("the value of i is : " + i);
		System.out.println("the value of j is : " + j);
	}

	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(100);
		ConstructorConcept obj2 = new ConstructorConcept(100, 200);
	}

}
