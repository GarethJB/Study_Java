package ex06;

public class SharedHorse {
	int rank;
	Horse a;
	Horse b;
	Horse c;
	Horse d;
	Horse e;

	public synchronized void setRank(String horsename) {
		++rank;
		System.out.println(horsename + " " + rank + "입니다.");
		
		
	}
	
	
}
