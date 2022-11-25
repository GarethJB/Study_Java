package ex01;

public class AlphabetThread extends Thread {
	public void run() {
		//알파벳 출력하기
		for(char alphabet='A'; alphabet<='Z'; alphabet++) {
			System.out.println(alphabet);
			
			try {
				Thread.sleep(100);	//1000 → 1초		
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}//class
