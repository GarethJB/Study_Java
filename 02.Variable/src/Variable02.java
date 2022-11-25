public class Variable02 {
	public static void main(String[] args) {
		
		//정수형 변수 num1과 num2를 선언하고, 동시에 num1 = 10, num2 = 20 값을 할당하시오.
		int num1 = 10, num2 = 20; //변수의 선언과 동시에 값을 할당 ▶ 초기화
		
		//변수 num1과 num2의 값을 출력
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		System.out.println(); //빈줄 삽입
		
		//변수 num1의 값을 30으로, num2의 값을 40으로 변경한 후 출력하시오 ▶ 재할당
		num1 = 30; //변수 num1의 값이 10에서 30으로 변경(재할당)
		num2 = 40; //변수 num2의 값이 20에서 40으로 변경(재할당)
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}
