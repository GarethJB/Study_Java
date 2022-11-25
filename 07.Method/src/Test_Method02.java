import java.util.Scanner;

public class Test_Method02 {
	//임의의 정수 2개를 입력(num1, num2)받아 ▶ Scanner(입력)
	//두 정수의 합을 구하여 리턴하는 메소드(getSum())를 호출
	//리턴받은 결과를 출력
	public static void main(String[] args) {
		//두 개의 정수(num1, num2)를 입력받는다
		//getSum() 메소드를 호출하고 결과를 리턴 받는다
		//결과를 출력
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		/*
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = Integer.parseInt(scanner.nextInt());
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = Integer.parseInt(scanner.nextInt());
		*/
		
		//입력값이 잘못되어 예외처리를 한 코드
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
		
		int sum = getSum(num1, num2);
		System.out.println("첫 번째 정수 : " + num1);
		System.out.println("두 번째 정수 : " + num2);
		System.out.println("두 정수의 합 : " + sum);	
	}//main()
		public static int getSum(int num1, int num2) {	
			int sum = num1 + num2;
			return sum;	
			//return num1 + num2; ▶ 간략한 식일 때
			//System.out.println("두 정수의 합 : " + getSum(num1, num2));
	}//getSum
}//class
