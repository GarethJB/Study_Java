package account;

public class AccountMain {
	public static void main(String[] args) {
		
		CheckcardAccount check1 = new CheckcardAccount("5468-4214-431", "조인성", "4564-4354-1324");
		
		check1.deposit(100000);
		
		try {
			int cost = check1.pay(50000);
			paidDisplay(cost, check1);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			int cost = check1.pay(70000);
			paidDisplay(cost, check1);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		Account account1 = new Account("1254-45646-123","원빈");
		
		account1.deposit(50000);
		
		try {
			int money = account1.withdraw(2000);
			System.out.println("출금된 금액 : " + money);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			int money = account1.withdraw(60000);
			System.out.println("출금된 금액 : " + money);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}//main()
	
	static void paidDisplay(int cost,CheckcardAccount who) {
		System.out.println(	who.owner + "통장 -------");
		System.out.println("결제금액 : " + cost);
		System.out.println("계좌잔액 : " + who.balance);		
	}//paidDisplay()
}//class
