public class Operator05 {
	public static void main(String[] args) {
		//대입(할당) 연산자 : =(equal)는 같다라는 의미가 아니라 대입(할당)을 의미
										// ↘ 같다는 의미는 ==
		//Left_Value = Right_Value ▶ R-Value의 값을 L_Value에 대입(할당)
		
		int num1 = 10;	//정수형 변수 num1을 선언하고, 값(10)을 할당(대입) ▶ 초기화
		System.out.println("변수 num1의 값 : " + num1);	//출력값 : 10
		
		int num2 = num1;	//정수형 변수 num2를 선언하고, 값(num1)을 할당(대입) ▶ 초기화
		System.out.println("변수 num2의 값 : " + num2);	//출력값  : 10
		
		num2 = num1 + num1;	//재할당
		System.out.println("변수 num2의 값 : " + num2);	//출력값  : 20
		
		num2 = num2 + num1;	//재할당
		System.out.println("변수 num2의 값 : " + num2);	//출력값  : 30
		
		//복합 대입 연산자 : R-Value에서 사용되는 변수와 L-Value에 대입되는 변수가 동일할 때 사용
		num2 += num1;	//num2 = num2 + num1;
		System.out.println("변수 num2의 값 : " + num2);	//출력값  : 40
		
		num2 -= num1;	//num2 = num2 - num1;
		System.out.println("변수 num2의 값 : " + num2);	//출력값  : 30
	}
}
