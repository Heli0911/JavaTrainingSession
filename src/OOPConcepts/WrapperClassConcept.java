package OOPConcepts;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "100";
		System.out.println(x + 20);

		// data conversion : string to int;
		int i = Integer.parseInt(x);
		System.out.println(i + 20);

		// string to double conversion;
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d + 10);

		// int to string conversion;
		int j = 200;
		System.out.println(j + 20);

	}

}
