package access;

public class BankAccount {

	private int balance;
	
	// 입금 => public
	public void deposit(int amount) {
		if(isAmountValid(amount)) {
			balance += amount;
		}
		else {
			System.out.println("유효하지 않은 금액입니다");
		}
	}
	
	// 출금 => public
	public void withdraw(int amount) {
		if(isAmountValid(amount) && (balance-amount) >= 0) {
			balance -= amount;
		}else {
			System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다");
		}
	}
	
	// 잔액 확인 => public
	public int getBalance() {
		return balance;
	}
	
	// 입출금액 검증 => private
	private boolean isAmountValid(int amount) {
		// 금액이 0보다 커야 함
		return amount > 0;
	}
	
	
}
