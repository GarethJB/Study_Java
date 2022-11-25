import java.util.Random;
import java.util.Scanner;

public class HighLowGame {
	public static void main(String[] args) {
		
		//1 ~ 100 사이의 임의의 정수값을 할당하여 comNumber 변수에 저장 ▶ Random 객체
		Random random = new Random();					//Random 객체 생성
		int comNumber = random.nextInt(100) + 1;		//1 ~ 100 사이의 임의의 정수값을 할당
		
		//사용자로부터 숫자를 입력(userNumber)받기 위한 준비단계 ▶ Scanner 객체
		Scanner scanner = new Scanner(System.in);
		int userNumber = 0;								//사용자가 입력한 값을 저장할 변수를 초기화
		int count = 0;									//시도횟수를 저장할 변수를 초기화
		
		//게임시작 : comNumber와 userNumber를 비교하여 안내메세지 및 결과를 출력
		do {
			System.out.println("1부터 100 사이의 정수값을 입력하세요 : ");
			userNumber = Integer.parseInt(scanner.nextLine());
			count++;
			
			if(userNumber > comNumber) {
				System.out.println("더 작은 수를 입력하세요!");
				System.out.println("시도횟수는" + count + "번 입니다.\n");
				continue;
			}else if(userNumber < comNumber) {
				System.out.println("더 큰 수를 입력하세요!");
				System.out.println("시도횟수는" + count + "번 입니다.\n");
				continue;
			}else {
				System.out.println("맞췄습니다!");
				System.out.println("시도횟수는" + count + "번 입니다.");
				break;
			}//if
		}while(true);
		scanner.close();
		
		/*
		System.out.print("1부터 100 사이의 정수값을 입력하세요");
		int userNumber = scanner.nextInt();
		while(true) {
			if(comNumber > userNumber) {
				System.out.println("더 큰 수를 입력하세요!");
			}else if(comNumber < userNumber) {
				System.out.println("더 작은 수를 입력하세요!");
			}else {
				System.out.println("맞췄습니다!");
				break;
			}//if
		}//while
		*/
		
		
	}//main()
}//class

/*
 [출력예시]
 comNumber : 1 ~ 100 사이의 임의의 정수값 할당 → 70	//Random
 														//while, break, continue
 1부터 100 사이의 정수값을 입력하세요 : 50				//Scanner
 더 큰수를 입력하세요!
 시도횟수 : 1번
 
 1부터 100 사이의 정수값을 입력하세요 : 80
 더 작은수를 입력하세요!
 시도횟수 : 2번
 
 1부터 100 사이의 정수값을 입력하세요 : 70
 맞췃습니다!
 시도횟수 : 3번
 */
