package OOPConceptsPart2;

public class HSBCBank implements USBank, BrazilBank // we are achieving multiple inheritance
//Is-a relationship
{
	public static void main(String[] args) {
		HSBCBank i = new HSBCBank();
		i.credit();
		i.debit();
		i.transferMoney();
		i.educationLoan();
		i.carLoan();
		i.MutualFund();
	}

	// if a class is implementing any interface then its mandatory to
	// define/override all the methods of interface

	// overriding from USBank
	@Override
	public void credit() {
		System.out.println("USBank--credit");

	}

	@Override
	public void debit() {
		System.out.println("USBank--debit");

	}

	@Override
	public void transferMoney() {
		System.out.println("USBank--transferMoney");

	}

	// seperate method of HSBCBank
	public void educationLoan() {
		System.out.println("HSBC--educationLoan");
	}

	public void carLoan() {
		System.out.println("HSBC--carLoan");
	}

	// overriding from BrazilBank
	@Override
	public void MutualFund() {
		System.out.println("BrazilBank--mutualfund");
	}

}
