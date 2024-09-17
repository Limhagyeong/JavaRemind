package access;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba=new BankAccount();
		
		System.out.println("현재 잔액: "+ba.getBalance());
		
		ba.deposit(5000);
		System.out.println("현재 잔액: "+ba.getBalance());
		
		ba.withdraw(6000);
		System.out.println("현재 잔액: "+ba.getBalance());
		
		ba.withdraw(4000);
		System.out.println("현재 잔액: "+ba.getBalance());

	}

}
