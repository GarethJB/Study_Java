package ex05;

public class ThreadMain {
	public static void main(String[] args) {
//		Account hong = new Account("홍길동", "111-22-333", 1000000);
//		Account park = new Account("박문수", "222-22-333", 1500000);
		SharedAccount shared = new SharedAccount();
		shared.hong = new Account("홍길동", "111-22-333", 1000000);
		shared.park = new Account("박문수", "222-22-333", 1500000);
		
		TransferThread transfer = new TransferThread(shared);
		BalanceThread balance = new BalanceThread(shared);
		transfer.start();
		balance.start();
		System.out.println("메인쓰레드 끝");
		
	}//main()
}//class
