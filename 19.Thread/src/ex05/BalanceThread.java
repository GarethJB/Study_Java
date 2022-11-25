package ex05;

public class BalanceThread extends Thread {
	SharedAccount shared;
	public BalanceThread(SharedAccount shared) {
		this.shared = shared;
	}
	
	
	public void run() {
		//두 통장 잔고 합계 출력
		for(int i = 0; i < 5; i++) {
			synchronized (shared) {
				int balance =
						shared.hong.balance + shared.park.balance;
				System.out.println("두 계좌잔고 합계 : " + balance);				
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
	}
	
	
}//class
