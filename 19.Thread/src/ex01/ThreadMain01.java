package ex01;

public class ThreadMain01 {
	public static void main(String[] args) {
		//알파벳 출력하기
		AlphabetThread alphabet =
		new AlphabetThread();
		alphabet.start();
		
		//숫자를 1~20까지 출력하기
		DigitThread digit = new DigitThread();
		digit.start();
		
		//쓰레드 객체를 여러개 생성하면
		//여러개의 쓰레드를 각각 실행할 수 있다.
		DigitThread digit2 = new DigitThread();
		digit2.start();
		
		
		System.out.println("메인쓰레드");
		
	}//main()
}//class
