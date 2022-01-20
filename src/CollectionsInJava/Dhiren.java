package CollectionsInJava;

public class Dhiren {

	public Dhiren() {
		System.out.println("Parent Class Constructor");
	}

	public Dhiren(int i) {
		System.out.println("Parent class constructor with the value i :" + i);
	}

	public Dhiren(int i, int j) {
		System.out.println("Parent class constructor with the value i :" + i);
		System.out.println("Parent class constructor with the value j :" + j);
	}

	public static void main(String[] args) {

		Dhiren obj = new Dhiren();
	}

}
