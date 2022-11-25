//은행계좌 클래스
public class Account {
	//계좌번호(123-45-6789), 예금주, 잔액
	String accountNo, owner;
	int balance;
	
	//생성자: 필드의 초기화
	Account(String accountNo, String owner) {
		this.accountNo = accountNo;
		this.owner = owner;
	}
	
	Account(String accountNo, String owner, int balance) throws Exception {
		// 생성자선언문에서 생성자를 호출시
		// : this로 호출한다
		// 생성자 호출문이 가장 먼저 선언되어야 한다

		this(accountNo, owner);	//this.accountNo = accountNo; / this.owner = owner;
		this.balance = balance;
		if (balance < 0) {
			throw new Exception("\n 계좌를 생성할 수 없습니다. \n");
		}//if
	}//Account()
	
	//입금 - 기능
	void deposit(int money) {
		this.balance += money;
		//this - Account() 안에 있는 것을 의미
	}//doposit()
	
	//출금 - 기능
	//잔액이 출금요청액보다 부족하면 오류
	int withdraw(int money) throws Exception {
		if(balance < money) {
			throw new Exception("잔고 부족으로 출금이 불가능 합니다.");
			}
			balance -= money;
			return money;
	}//withdraw()
}//class
