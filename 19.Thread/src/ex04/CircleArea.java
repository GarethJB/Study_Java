package ex04;

public class CircleArea extends Thread {
	SharedArea shared;
	int radius;
	CircleArea(SharedArea shared, int radius) {
		this.shared = shared;
		this.radius = radius;
	}
	public void run() {
		//원의 넓이를 출력
		if(!shared.finished) {
			try {
				synchronized (shared) {
					shared.wait();					
				}
			} catch(InterruptedException e) {
				
			}
		}
		double area = shared.pi * radius * radius;
		System.out.printf("반지름 %d인 원넓이: %.3f \n", radius, area);
	}
}
