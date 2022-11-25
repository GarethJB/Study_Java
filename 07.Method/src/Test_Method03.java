import java.text.DecimalFormat;
import java.util.Scanner;

public class Test_Method03 {
	//임의의 정수 2개를 입력받아(num1, num2) ▶ Scanner(입력)
	//사칙연산을 수행하는 메소드를 호출 : add(), sub(), mul(), div()
	//결과값은 리턴받아 출력하시오
	//단, 나눗셈의 결과는 실수 형태로 출력 ▶ double
	//단, 나눗셈의 결과는 소수 둘째자리까지 표시 ▶ DecimalFormat Class(표시형식)
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		
		while(true) {
			try {
				System.out.print("첫 번째 정수를 입력하세요 : ");
				num1 = Integer.parseInt(scanner.nextLine());
				System.out.print("두 번째 정수를 입력하세요 : ");
				num2 = Integer.parseInt(scanner.nextLine());
				break;
			} catch (Exception e) {
				//e.printStackTrace(); ▶ 예외메세지를 상세하게 출력
				System.out.println("입력값이 잘못 되었습니다!");
				continue;
			}//try
		}//while
		scanner.close();
		
		int addResult = add(num1, num2);
		int subResult = sub(num1, num2);
		int mulResult = mul(num1, num2);
		double divResult = div(num1,num2);
		System.out.println("두 정수의 덧셈 : " + addResult);
		System.out.println("두 정수의 뺄셈 : " + subResult);
		System.out.println("두 정수의 곱셈 : " + mulResult);
		System.out.println("두 정수의 나눗셈 : " + divResult);
		System.out.println("두 정수의 나눗셈 : " + divFormat(num1, num2));
		
	}//main()
	
	public static int add(int num1, int num2) {	
		int addResult = num1 + num2;
		return addResult;	
	}//add()
	
	public static int sub(int num1, int num2) {	
		int subResult = num1 - num2;
		return subResult;	
	}//sub()
	
	public static int mul(int num1, int num2) {	
		int mulResult = num1 * num2;
		return mulResult;	
	}//mul()
	
	public static double div(int num1, int num2) {	
		double divResult = (double)num1 / (double)num2;
		return divResult;	
	}//div
	
	//메소드 정의 : add(), sub(), mul(), div()

	//출력되는 표시형식을 변경하는 메소드
	public static String divFormat(int num1, int num2) {
		DecimalFormat df = new DecimalFormat("0.00");
		double result = (double) num1 / num2;
		return df.format(result);
	}//divFormat()
}//class

/*
 
 DecimalFormat Class : 출력되는 표시형식을 변경
 
 # : 의미없는 0값은 표시하지 않는다.
 0 : 0의 개수만큼 화면에 표시
 ===================================
 3.14	##.###	3.14
 3.14	00.000	03.140
 
 0.45	#.#		.5
 0.45	0.0		0.5
 ===================================
 0.00	▶ 소수 둘 째 자리까지 표시 : 3.40
 #,##0	▶ 천단위 구분기호 표시 : 1,234
 ￦#,##0	▶ 통화기호를 표시 : \1,000,000 (※ 통화기호 : ㄹ → 한자)
 
 */









