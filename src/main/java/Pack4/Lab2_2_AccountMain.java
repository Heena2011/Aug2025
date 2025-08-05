package Pack4;

public class Lab2_2_AccountMain {

	public static void main(String[] args) {
		
	
	Lab2_2_Account checkBalance = new Lab2_2_SavingAccount();
	
	checkBalance.setBalance(3000);
	checkBalance.withdraw(1000);
	
	System.out.println(checkBalance.getBalance());
	
	System.out.println("------------------");
	
	
	}
	
}
