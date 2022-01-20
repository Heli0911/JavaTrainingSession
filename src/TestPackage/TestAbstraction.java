package TestPackage;

import CollectionsInJava.AbstractionConcept;
import CollectionsInJava.Dog;

public class TestAbstraction {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.AnimalType();
		d.Animal();
		d.animalsound();
		d.sleep();

		// dynamic polymorphism/top casting - child class object can be reffer by parent
		// class
		AbstractionConcept ac = new Dog();
		ac.Animal();
		ac.animalsound();
		ac.sleep();
		// ac.AnimalType();
	}

}
