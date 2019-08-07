package abstraction;

public abstract class CentralBank {

	abstract String getName();

	abstract int getRate();

	public void moneyEX() {

		System.out.println("$1 = 110");
		System.out.println("yen 10 = 10");
		System.out.println("IC 100 = 160");
	}

}
