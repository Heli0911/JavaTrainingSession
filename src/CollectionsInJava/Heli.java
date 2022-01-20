package CollectionsInJava;

public class Heli extends Dhiren {

	public Heli() {
		super();
		// System.out.println("Child Class Constructor");
	}

	public Heli(int i) {
		super(10, i);
	}

	public Heli(int i, int j) {
		super(10, 20);
	}

	public static void main(String[] args) {

		Heli obj = new Heli();
		Heli obj1 = new Heli(10);
		Heli obj2 = new Heli(10, 20);
	}

}
