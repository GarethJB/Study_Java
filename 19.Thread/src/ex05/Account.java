package ex05;

public class Account {
	String accountNo, owner;
	int balance;
	
	Account(String accountNo, String owner, int balance) {
		this.accountNo =  accountNo;
		this.owner =  owner;
		this.balance =  balance;
		
	}
	
	void addMoney(int money) {
		balance += money;
	}
	
	int output(int money) throws Exception{
		if (balance < money) 
			throw new Exception("잔고부족으로 출금불가");
		balance -= money;
		return money;
	}
	
	
}
