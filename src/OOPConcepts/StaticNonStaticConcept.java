package OOPConcepts;

public class StaticNonStaticConcept {
	String name = "Tom"; // non static global variable
	static int age = 25; // static global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// how to call static methods and variables?

		// 1. direct calling :
		sum();

		// 2. Calling by classname :
		StaticNonStaticConcept.sum();

		System.out.println(age);
		System.out.println(StaticNonStaticConcept.age);

		// how to call non static methods and variables? :

		StaticNonStaticConcept obj = new StaticNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);

		// can I access static methods by using object reference? Yes.

		obj.sum(); // warning will be given

	}

	public void sendMail() // non static method
	{
		System.out.println("Send mail method");
	}

	public static void sum() // static method
	{
		System.out.println("Sum method");
	}

}
