package monday;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAcct = new BankAccount(1000,"raju",5000, "hyd","9604568705");
		System.out.println(BankAcct);
		bankAcct.deposit(5000);
		bankAcct.checkBalance();
		bankAcct.withdraw(4000);
		bankAcct.checkBalance();

	}

}
