package OOPConceptsPart2;

public interface USBank {
	int min_bal = 100;

	public void credit();

	public void debit();

	public void transferMoney();

	// only method declaration
	// no method body - only method prototype
	// in interface, we can declare the variables, variables are by default static
	// in nature
	// variables values will not be changed. it's final/constant in nature
	// no static method in interface
	// we can not create object of interface
	// interface is abstract in nature

}
