package ex04;

public class ThreadMain {
	public static void main(String[] args) {
		int radius = 5;
		SharedArea shared = new SharedArea();
		PIThread first = new PIThread();
		PrintThread second = new PrintThread();
		CircleArea area = new CircleArea(shared, radius);
		CircleAround around = new CircleAround(shared, radius);
		first.shared = shared;
		second.shared = shared;
		area.shared = shared;
		around.shared = shared;
		around.start();
		area.start();
		first.start();
		second.start();
	}//main()
}//class
