package ex02;

public class SMIThread extends Thread {
	public void run() {
		//비디오 쓰레드가 먼저 실행되도록 일정시간 대기하기
		try {
			Thread.sleep(50);			
		} catch (InterruptedException e) {
		}
		
		//자막번호 하나~다섯 출력
		String subtitle[] = {"하나", "둘", "셋", "넷", "다섯"};
		for(String title : subtitle) {
			System.out.println("자막 : " + title);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			}
		}
		
		
	}
}
