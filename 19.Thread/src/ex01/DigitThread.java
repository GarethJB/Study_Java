package ex01;

public class DigitThread extends Thread {
	public void run() {
		//숫자를 1~20까지 출력하기
		for(int no = 1; no<= 20; no++) {
			System.out.println(no);
			
			try {
				Thread.sleep(500);	//1000 → 1초		
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}//class