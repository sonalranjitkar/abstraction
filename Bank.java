package abstraction;

public abstract class Bank {
	protected abstract String getName();

	protected abstract int getRate();

	public void moneyEx() {
		System.out.println("$1 = 112");
		System.out.println("IC 1 = 1.6");
		System.out.println("Yen 10 = 10");
	}

}
