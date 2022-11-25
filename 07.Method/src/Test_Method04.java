import java.util.Scanner;

public class Test_Method04 {
	//Test_Method03.java의 코드를 간소화
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = getNumber(scanner);
		int num2 = getNumber(scanner);
		scanner.close();
		display(num1, num2);
				
	}//main()
	
	//입력 메소드
	public static int getNumber(Scanner scanner) {
		int num;
			while(true) {
				try {
					System.out.print("정수를 입력하세요 : ");
					num = Integer.parseInt(scanner.nextLine());
					break;
				} catch (Exception e) {
					//e.printStackTrace(); ▶ 예외메세지를 상세하게 출력
					System.out.println("입력값이 잘못 되었습니다!");
					continue;
				}//try
			}//while
			return num;
	}//getNumber
	
	//출력 메소드
	public static void display(int num1, int num2) {
		System.out.println("두 정수의 덧셈 : " + add(num1, num2));
		System.out.println("두 정수의 덧셈 : " + sub(num1, num2));
		System.out.println("두 정수의 덧셈 : " + mul(num1, num2));
		System.out.println("두 정수의 덧셈 : " + div(num1, num2));	
	}//display()
	
	public static int add(int num1, int num2) {	
		return num1 + num2;
	}//add()
	
	public static int sub(int num1, int num2) {	
		return num1 - num2;
	}//sub()
	
	public static int mul(int num1, int num2) {	
		return num1 * num2;	
	}//mul()
	
	public static double div(int num1, int num2) {	
		return num1 / num2;	
	}//div
}//class
