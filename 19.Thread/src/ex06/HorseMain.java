package ex06;

public class HorseMain {
	public static void main(String[] args) {
		//경주마 5마리가 100미터 달리기를 하는 멀티쓰레드 프로그램
		//20미터 간격으로 현재 달리고 있는 지점과 경무자 이름을 출력한다
		//시간을 1초정도 간격 sleep 처리를 한다
		
		//100미터 지점(finish line)에 도착하면
		//어떤 경주마가 몇 등 했는지출력
		//공유영역에는 순위를 저장한다 : rank
		SharedHorse shared = new SharedHorse();
		
		Horse a = new Horse(shared, "홀란드");
		Horse b = new Horse(shared, "손흥민");
		Horse c = new Horse(shared, "해리 케인");
		Horse d = new Horse(shared, "살라");
		Horse e = new Horse(shared, "누녜즈");
		
		
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}//main()
}//class
