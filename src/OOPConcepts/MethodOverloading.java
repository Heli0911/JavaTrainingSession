package OOPConcepts;

public class MethodOverloading {

	// With method overloading, multiple methods can have the same name with
	// different parameters.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading obj = new MethodOverloading();

		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
	}

	public void sum() // 0 input parameter
	{
		System.out.println("sum method -- zero parameter");
	}

	public void sum(int i) // 1 input parameter
	{
		System.out.println("sum method -- one parameter");
		System.out.println(i);
	}

	public void sum(int k, int j) // 2 input parameter
	{
		System.out.println("sum method -- two parameter");
		System.out.println(k + j);
	}

}
