package mypackage;

public class Encapsulation_ex1 {
	public static void main(String[] args) {
		Bank B= new Bank();
		B.setAcc_no(7894561239632587L);
		B.setAmount(5000);
		B.setName("Taufik");
		B.setE_mail("Taufik9191");
		
		System.out.println(B.getAmount());
		System.out.println(B.getAcc_no());
		System.out.println(B.getName());
		System.out.println(B.getE_mail());
	}

}