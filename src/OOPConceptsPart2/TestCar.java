package OOPConceptsPart2;

import OOPConcepts.Car;

public class TestCar {

	public static void main(String[] args) {
		// static polymorphism --- compile time polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();

		System.out.println("*********");

		Cars z = new Cars();
		z.start();
		z.stop();
		z.refuel();

		System.out.println("*********");

		// top casting
		Cars c1 = new BMW(); // child class object can be referred by parent class reference variable ---
								// dynamic polymorphism
		c1.start();

		// down casting
		BMW d1 = (BMW) new Cars(); // classcastexception

	}

}
