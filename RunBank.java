package abstraction;

public class RunBank {
	public static void main(String[] args) {
		Bank b = new PrabhuBank(); // Bank();
		System.out.println("Name = " + b.getName());
		System.out.println("Name = " + b.getRate());
		b.moneyEx();

		UserCare uc = new UserCareimpl();
		uc.addUser();
		uc.deleteUser();
	}
}
