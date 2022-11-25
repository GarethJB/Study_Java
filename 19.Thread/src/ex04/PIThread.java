package ex04;

public class PIThread extends Thread {
	SharedArea shared;
	
	public void run() {
		//원주율 값 계산하기
		double total = 0;
		
		for(int i = 1;  i < 1000000000; i+=2) {
			if(i/2 % 2 == 0) {		
				total += 1.0 / i;				
			} else {
				total -= 1.0 / i;				
			}
		}
		total *= 4;
		shared.pi = total;
		shared.finished = true;
		//출력쓰레드가 일정시간 대기하는 것보다는
		//계산쓰레드가 계산완료되었음을 출력쓰레드에게 알려주는게(notify) 효율적
		//쓰레드간에 신호를 주고 받기 위한 메소드로
		//신호를 보내는 메소드 : notify,
		//신호를 받는 메소드 : wait
		synchronized (shared) {
			shared.notify();			
		}
		System.out.println("원주율 계산 : " + total);
	}
}//class
