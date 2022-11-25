package ex02;

public class VideoThread extends Thread {
	public void run() {
		//비디오 프레임 번호 출력하기
		int no[] = { 1, 2, 3, 4, 5 };
//		int no[] = new int[] { 1, 2, 3, 4, 5 };
		
		for (int idx = 0; idx < no.length; idx++) {
			System.out.println("비디오프레임 : " + no[idx]);
			
		try {
			Thread.sleep(300);				
		} catch (InterruptedException e) {}}
		
		
	}
}
