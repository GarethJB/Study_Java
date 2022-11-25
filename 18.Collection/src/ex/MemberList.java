package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberList {
	private ArrayList<MemberDTO> list;
	
	void display(MemberView view) {
		//DB에서 회원목록을 조회해온다
		MemberDAO dao = new MemberDAO(list);
		ArrayList<MemberDTO> members 
					= dao.member_list();
		
		System.out.println("번호 \t 성명 \t 성별 \t 전화번호");
		int no = 1;
		for(MemberDTO dto : members) {
			System.out.printf("%d %s \t %s \t %s \n"
					, no++
					, dto.getName()
					, dto.getGender()
					, dto.getPhone() );
		}		
		System.out.print("회원을 선택(번호): ");
		no = scan.nextInt();
//      1. 매번 보기화면 생성		
//		MemberView html = new MemberView(scan, list);
//		html.display(no);
//		2. 매번 보기화면 생성 
//		new MemberView(scan, list).display(no);
		view.display(no);
	}
	private Scanner scan;
	
	MemberList(Scanner scan, ArrayList<MemberDTO> list){
		this.list = list;	
		this.scan = scan;
	}
}

