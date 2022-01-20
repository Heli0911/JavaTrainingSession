package OOPConcepts;

public class CallByValueAndCallByRef {
	int p;
	int q;

	public static void main(String[] args) {

		CallByValueAndCallByRef obj = new CallByValueAndCallByRef(); // call by value OR pass by value
		int x = 10;
		int y = 20;
		obj.testSum(x, y);

		obj.p = 50;
		obj.q = 60;

		obj.swap(obj);

		// after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
	}

	public int testSum(int a, int b) {
		int c = a + b;
		return c;
	}

	// Call by reference
	public void swap(CallByValueAndCallByRef t) {
		int temp;
		temp = t.p; // temp = 50
		t.p = t.q; // t.p = 60;
		t.q = temp; // temp = 50;
	}
}
