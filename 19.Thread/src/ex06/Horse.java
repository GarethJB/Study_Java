package ex06;

import java.text.DecimalFormat;

public class Horse extends Thread {
	SharedHorse shared;
	String horsename;
	DecimalFormat df = new DecimalFormat("#");
	Horse(SharedHorse shared, String horsename) {
		this.shared = shared;
		this.horsename = horsename;
	}
	
	public void run() {
		for (double i = 1; i < 100; i++) {
//			if((i / 20) == (int)(i / 20)) {
			if(i % 20 == 0) {
				try {
					System.out.println(horsename+ df.format(i) +"m 통과" );
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}//try catch			
			}
		}//for
			shared.setRank(horsename);
			
			
	}//run()
}//class
				
