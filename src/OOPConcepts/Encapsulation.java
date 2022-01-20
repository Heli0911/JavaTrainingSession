package OOPConcepts;

public class Encapsulation {

	private String name; // private = restricted access

	// Getter
	public String getName() {
		return name;
	}

	// Setter
	public void setName(String newName) {
		this.name = newName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation myObj = new Encapsulation();
		myObj.name = "John";
		System.out.println(myObj.name);
	}
}