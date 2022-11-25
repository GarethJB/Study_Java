package account;

abstract public class Account {
	//계좌번호, 예금주
	String accountNo, owner;
	//잔액
	int balance;
	
//	Account() {
//		System.out.println("Account 생성자");
//	}//Account
	
	Account(String accountNo, String owner) {
		this.accountNo = accountNo;
		this.owner = owner;
	}//Account
	
	Account(String accountNo, String owner, int balance) {
		this(accountNo,owner);
		this.balance = balance;
	}//Account
	
	//입금한다 - 기능
	void deposit(int money) {
		balance += money;
	}//deposit
	
	//출근한다 - 기능
	int withdraw(int money) throws Exception {
		if (balance < money) throw new Exception("잔고부족으로 출금불가");
		balance -= money;
		return money;
	}//withdraw
}//class
