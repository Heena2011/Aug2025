package Pack4;

public class AccountMain {

	public static void main(String[] args) {

		Person Smith = new Person();
		Person Kathy = new Person();

		Smith.setBalance(2000);
		Kathy.setBalance(3000);

		System.out.println("Smith balance: " + Smith.getBalance());
		System.out.println("Kathy balance: " + Kathy.getBalance());

		System.out.println("Smith Deposite: ");
		Smith.deposite(3000);
		System.out.println("Kathy Deposite: ");
		Kathy.withdraw(2000);

		System.out.println("Balance after deposite of Smith");
		System.out.println(Smith.getDepositedBalance());
		System.out.println("Balance after withdraw of Kathy");
		System.out.println(Kathy.getBalance());

	}
}
