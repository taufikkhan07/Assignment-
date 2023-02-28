package Feb27;
abstract class BankAccount{
	int account_number=545665;
	int balance=30000;
	abstract void deposit();
	abstract void withdraw();
}
 class CheckingAccount extends BankAccount{
	 void deposit() {
		 int deposit=1000;
		 System.out.println("Amount deposit"+" "+(balance+deposit));
		 	 }
	 void withdraw() {
		 int withdraw=500;
		 System.out.println("Amount withdraw"+" "+(balance-withdraw));
	 }
	}

public class AbstractMethodEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj=new CheckingAccount();
		obj.deposit();
		obj.withdraw();

	}

}
