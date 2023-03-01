package Feb28;
interface BankAccount1{
	void deposite();               //by default abstract method
	void withdraw();               //by default abstract method
}
public class Interfaceeg3 implements BankAccount1 {
	public void deposite() {   //implementation
		
		int balance=100000;
		int deposite=1000+balance;
		
		System.out.println("deposite balance is:"+deposite);    // print deposite balance
	}
	
	public void withdraw() {    //implementation
		
		int balance=1000;
		int deposite=balance-100;
		
		System.out.println("withdraw balance is:"+deposite);    // print withdraw balance
	}
	public static void main(String[] args) {   // main method
		BankAccount1 b1= new Interfaceeg3();   // create interface
		b1.deposite();
		b1.withdraw();
	}
	}
