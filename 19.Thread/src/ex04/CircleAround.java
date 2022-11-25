package ex04;

public class CircleAround extends Thread{
	SharedArea shared;
	int radius;
	
	CircleAround(SharedArea shared, int radius) {
		this.shared = shared;
		this.radius = radius;
	}
	
	
	public void run() {
		//원의 둘레를 출력
		if(!shared.finished) {
			try {
				synchronized (shared) {
					shared.wait();					
				}
			} catch(InterruptedException e) {
				
			}
		}
		double around = shared.pi * 2 * radius;
		System.out.printf("반지름 %d인 원둘레: %.3f \n", radius, around);
	}
}
