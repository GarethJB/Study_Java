package ex03;

public class RunnableMain {
	public static void main(String[] args) {
		AlphabetRunnable alphabet = new AlphabetRunnable();
		DigitRunnable digit = new DigitRunnable();
		
		//Thread 객체를 생성해야만 한다 → 인터페이스로 구현할 경우
		Thread thread1 =  new Thread(alphabet);
		Thread thread2 =  new Thread(digit);
		Thread third =  new Thread(new DigitRunnable());
		thread1.start();
		thread2.start();
		third.start();
	}//main()
}//class
