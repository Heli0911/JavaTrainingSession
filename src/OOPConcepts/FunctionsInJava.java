package OOPConcepts;

public class FunctionsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionsInJava obj = new FunctionsInJava();

		obj.test();

		int i = obj.abc();
		System.out.println(i);

		String s1 = obj.pqr();
		System.out.println(s1);

		int div = obj.division(30, 10);
		System.out.println(div);

	}
	// non static methods
	// void -- does not return any value
	// return type = void

	public void test() // no input no output
	{
		System.out.println("test method");
	}

	// return type = int

	public int abc() // no input some output
	{
		System.out.println("abc method");
		int a = 10;
		int b = 20;
		int c = a + b;

		return c;
	}

	// return type = string

	public String pqr() // no input some output
	{
		System.out.println("pqr method");
		String s1 = "selenium";

		return s1;
	}

	public int division(int x, int y) // no input some output
	{
		System.out.println("division method");
		int d = x / y;

		return d;
	}

}
