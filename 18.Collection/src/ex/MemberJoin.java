package ex;

import java.util.ArrayList;
import java.util.Scanner;

//회원가입화면
public class MemberJoin {
	private Scanner scan;
	private ArrayList<MemberDTO> list;
	
	void display() {
		System.out.println("회원가입 ---------");
		System.out.print("이름: ");
		String name = scan.next();
		System.out.print("성별: ");
		String gender = scan.next();
		System.out.print("전화번호: ");
		String phone = scan.next();
		System.out.println("회원가입버튼: 1    취소:0");
		if( scan.nextInt() == 1 ) {
			MemberDTO dto = new MemberDTO(name, gender, phone);	
			//DB에 저장한다-배열에 저장한다
			MemberDAO dao = new MemberDAO(list);
			dao.member_insert(dto);
		}
		
	}
	
	MemberJoin(Scanner scan, ArrayList<MemberDTO> list){
		this.list = list;
		this.scan = scan;
	}
	
}
