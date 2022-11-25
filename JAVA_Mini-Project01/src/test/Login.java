package test;

import java.util.Scanner;

import user.UserDAO;


public class Login {
	UserDAO dao = new UserDAO();
	public int login(Scanner sc) {
			while (true) {
				System.out.println("\n====================================");
				System.out.println("◆           로그인 메뉴          ◆ ");
				System.out.println("====================================\n");
				System.out.print("ID : ");
				String id = sc.next();			
				System.out.print("\nPASSWORD : ");
				String pw = sc.next();
				Logininfo.logininfo = dao.login(id, pw);
				if (Logininfo.logininfo != null) {
					if (Logininfo.logininfo.getAdmin().equals("y")) {
						return 1;
					} else {
						return 2;
					}//if					
				} else {
					System.out.println("\n아이디 혹은 비밀번호가 틀렸습니다.");
					return 3;
				}//if
			}//while
	}//Login()
}//class
