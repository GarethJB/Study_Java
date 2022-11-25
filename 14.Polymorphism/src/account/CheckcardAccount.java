package account;

public class CheckcardAccount extends Account{
	//계좌번호, 예금주, 잔액, 카드번호
	String cardNo;
	
//	CheckcardAccount() {
//		super();
//		System.out.println("CheckcardAccount 생성자");
//	}//CheckcardAccount
	
	CheckcardAccount(String accountNo, String owner, String cardNO) {
//		this.accountNo = accountNo;
//		this.owner = owner;
		super(accountNo, owner);
		this.cardNo = cardNO;
	}//CheckcardAccount
	
	CheckcardAccount(String accountNo, String owner, String cardNO, int balance) {
		this(accountNo,owner,cardNO);
		this.balance = balance;
	}//CheckcardAccount
	
	//입금한다
	//출금한다
	
	//지불한다
	int pay(int cost) throws Exception {
		//통장잔고보다 물품의 가격이 더 크면 결제불가
		if(balance < cost) throw new Exception("잔고부족으로 결제불가");
		//통장에서 구입한 물건의 금액만큼 balance가 감소
		balance -= cost;
		return cost;
	}
}//class
