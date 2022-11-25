import java.util.Scanner;

public class Test_Scanner {
	//키보드로부터 점수(score)를 입력 받은 후, 학점을 출력 ▶ Scanner(입력), if(학점)
	//단, 입력받은 점수의 범위는 0부터 100까지이며,
	//그외의 점수가 입력되면 오류메세지를 출력하고 ▶ if(점수의 입력범위를 설정)
	//재입력 받은 후 학점을 출력 ▶ while, break, continue (반복, but 반복횟수 정해지지 않음)
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("점수를 입력하세요 : ");
			int score = scanner.nextInt();
			
			System.out.println("입력하신 점수는 " + score +"점 입니다.");
			
			if(score >= 0 && score <= 100) {
				if(score >= 90) {
					System.out.println("학점은 A입니다.");
				} else if(score >= 80) {
					System.out.println("학점은 B입니다.");
				} else if(score >= 70) {
					System.out.println("학점은 C입니다.");
				} else if(score >= 60) {
					System.out.println("학점은 D입니다.");
				} else {
					System.out.println("학점은 F입니다.");
				}//if
				break;		//점수를 제대로 입력하면 멈춤
			} else {
				System.out.println("점수를 잘못 입력하셨습니다.");
				continue;	//잘못 입력하면 다시 실행
			}//if
		}//while
		scanner.close();	//while문이 끝나면 스캐너 종료
	
	
	
	
	

			
			


			
		
		
	}//main()
}//class
