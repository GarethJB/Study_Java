package account;

//final class : 상속 금지
public class MinusAccount extends Account{
	//계좌번호, 예금주, 잔액, 한도금액
	int minusLimit;
	
	MinusAccount(String accountNo, String owner, int minusLimit) {
		super(accountNo, owner);
		this.minusLimit = minusLimit;
	}//MinusAccount
	
	MinusAccount(String accountNo, String owner, int balance, int minusLimit) {
		super(accountNo, owner, balance);
		this.minusLimit = minusLimit;
	}//MinusAccount
	
	//입금한다
	
	//출금한다
	//super 메소드를 override 된 상태
	//메소드 오버라이딩 주의:
	//시그니처(파라미터갯수, 데이터타입), 리턴타입 이 모두 동일
	//접근제어자는 suoer의 메소드의 접근제어자와 같거나 더 넓어야한다
	
	//final 메소드 : override 불가
	public int withdraw(int money) throws Exception {
		if (balance + minusLimit < money) throw new Exception("잔고부족으로 출금불가");
		balance -= money;
		return money;
	}//withdraw
}//class
