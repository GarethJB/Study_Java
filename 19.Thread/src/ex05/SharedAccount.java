package ex05;

public class SharedAccount {
	Account hong, park;
	synchronized void balance() {
		int balance = hong.balance + park.balance;
		System.out.println("두 계좌잔고 합계 : " + balance);
	}
	synchronized void transfer(int money) {
//		synchronized (this) {
			
//		}
		try {
			money = hong.output(money);
			System.out.print("홍길동계좌에서 5만원 출금 → ");
			park.addMoney(money);
			System.out.println("박문수계좌로 5만원 입금");			
		} catch(Exception e) {
			
		}
	}
}
