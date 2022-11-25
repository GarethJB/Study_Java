package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();

		MemberJoin join = new MemberJoin(scan, list);
		
		MemberList members = new MemberList(scan, list);		
		MemberView view = new MemberView(scan, list);
		int fnKey = 0;
		do {
			System.out.println("회원관리 프로그램");
			System.out.println("1.회원가입   2.회원목록  0.종료");
			fnKey = scan.nextInt();
			if( fnKey==1 ) {
				//화면에서 회원가입시 회원정보를 저장한다
				join.display();
			}else if( fnKey==2 ) {
				members.display(view);
			}
			
		}while(fnKey != 0 );
		System.out.println("프로그램 종료....");
		

		
		
	}
}
