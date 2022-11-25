public class Operator07 {
	public static void main(String[] args) {
		//2진수 : 숫자 앞에 '0b'를 붙인다 ▶ 0, 1
		//8진수 : 숫자 앞에 '0'을 붙인다 ▶ 0 ~ 7
		//10진수 : 일반적으로 활용하는 방식 ▶ 0 ~ 9
		//16진수 : 숫자 앞에 '0x'를 붙인다 ▶ 0 ~ 9, A ~ F
		
		int num1 = 0b11;	//2진수
		int num2 = 011;		//8진수
		int num3 = 11;		//10진수
		int num4 = 0x11;	//16진수
		int num5 = 0b11001;
		
		System.out.println("변수 num1의 값 : " + num1);	//출력값 : 3
		System.out.println("변수 num2의 값 : " + num2);	//출력값 : 9
		System.out.println("변수 num3의 값 : " + num3);	//출력값 : 11
		System.out.println("변수 num4의 값 : " + num4);	//출력값 : 17
		System.out.println(num5);
		
		
	}//main()
}//class
