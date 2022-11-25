package ex04;

public class PrintThread extends Thread {
	SharedArea shared;
	
	
	public void run() {
		try {
//			Thread.sleep(6000);
			if(!shared.finished) {
			synchronized (shared) {
				shared.wait();
			}
				System.out.println("원주율 출력 : " + shared.pi);			
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}//class
