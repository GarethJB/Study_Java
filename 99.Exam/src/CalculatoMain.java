import java.util.Scanner;

public class CalculatoMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		Calculator sm = new Calculator();	
		sm.getAdd(num1, num2);
		sm.getSub(num1, num2);
		sm.getMul(num1, num2);
		sm.getDiv(num1, num2);
		sm.display(num1, num2, num2, num2, num1, num2);
	}//main()
}//class
