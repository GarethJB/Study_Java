package test;

import java.util.Scanner;

import user.UserDAO;

public class Join {
	UserDAO dao = new UserDAO();
	public void joinAdd(Scanner sc) {
		System.out.println("\n▶ 회원 가입 ◀");
		System.out.printf("\nID : ");
		String id = sc.next() + sc.nextLine();
		
		System.out.printf("\nPASSWORD : ");
		String pw = sc.next() + sc.nextLine();
		
		System.out.printf("\nNAME : ");
		String name = sc.next() + sc.nextLine();
		
		System.out.printf("\nEMAIL : ");
		String email = sc.next() + sc.nextLine();
		System.out.printf("\nID : %s\nPASSWORD : %s\nNAME : %s\nEMAIL : %s\n", id, pw, name, email);
		dao.join(id, pw, name, email);
		System.out.println("\n● 가입 완료 ●");
	}//joinAdd()
}//class
