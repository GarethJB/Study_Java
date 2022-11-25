import java.util.Scanner;

public class Ex_Scanner_Login {
		//사용자로부터 아이디(id)와 비밀번호(pw)를 입력받는다. ▶ Scanner
		//입력받은 아이디 값이 'admin' 이고, 비밀번호 값이 'java1234^^'이면 '로그인 성공' 메세지를 출력하고,
		//아이디 값 또는 비밀번호 값이 다른 값이 입력되면
		//'로그인 실패' 메세지를 출력하고 재입력 받아 로그인을 실행하시오.
		//★ 문자열의 입력은 nextLine() 메소드를 사용, 문자열에서 비교연산자를 사용할 수 없다.
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디를 입력하시오 : ");
			String id = scanner.nextLine();
			System.out.print("비밀번호를 입력하시오 : ");
			String pw = scanner.nextLine();
			
			if(id.equals("admin") && pw.equals("java1234^^")) {
				System.out.println("로그인 성공!!");
				break;
			}else {
				System.out.println("로그인 실패!!");
				continue;
			}//if
		}//while
		scanner.close();
	}//main()
}//class
/*
 [출력예시] 
 아이디를 입력하시오 : xxx
 비밀번호를 입력하시오 : xxx
 로그인 실패!!
 
 아이디를 입력하시오 : admin
 비밀번호를 입력하시오 : java1234^^
 로그인 성공!!
  */
 