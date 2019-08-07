package abstraction;

public class TestBank {
	public static void main(String[] args) {

		CentralBank b = new LaxmiBank();

		System.out.println("Name = " + b.getName());
		System.out.println("Rate = " + b.getRate());
		b.moneyEX();

		UserService us = new UserServiceImpl();
		us.addUser();
		us.deleteUser();
	}
}
