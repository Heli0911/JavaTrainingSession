package OOPConcepts;

public class Car {

	// class variables;
	int mod;
	int wheel;

	public static void main(String[] args) {
		// new Car(): this is the object of car
		// new keyword is used to create the object
		// a,b,c --> object reference variable

		Car a = new Car();
		Car b = new Car();
		Car c = new Car();

		System.out.println("Before assigning the references");

		a.mod = 2015;
		a.wheel = 4;

		b.mod = 2015;
		b.wheel = 4;

		c.mod = 2015;
		c.wheel = 4;

		System.out.println(a.mod);
		System.out.println(a.wheel);

		System.out.println(b.mod);
		System.out.println(b.wheel);

		System.out.println("After shifting the references");

		a = b;
		b = c;
		c = a;

		a.mod = 10;
		System.out.println(a.mod);

		c.mod = 20;
		System.out.println(c.mod);

		c.mod = 20;
		System.out.println(a.mod);

		b.mod = 30;
		System.out.println(c.mod);
	}

	public void start() {
		int car = 0;
		int start = 0;
		// TODO Auto-generated method stub
		System.out.println(car-- - start);

	}

	public void stop() {
		int stop = 0;
		int car = 0;
		// TODO Auto-generated method stub
		System.out.println(car-- - stop);

	}

	public void refuel() {
		int refuel = 0;
		int car = 0;
		// TODO Auto-generated method stub
		System.out.println(car-- - refuel);

	}

	public void refuel1() {
		// TODO Auto-generated method stub

	}

}
