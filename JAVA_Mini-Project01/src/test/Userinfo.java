package test;

import user.UserDAO;

public class Userinfo {
	UserDAO dao = new UserDAO();
	public void display() {
		System.out.println("\n============    사용자 정보    ============\n");
			dao.infoUpdate();
			System.out.printf("이름 \t %-10s \n\nEmail \t %s\n\n잔액 \t %d원", Logininfo.logininfo.getName(), Logininfo.logininfo.getEmail(), Logininfo.logininfo.getMoney());
			System.out.println("\n\n===========================================");
//			System.out.print(Logininfo.logininfo.getName() + "\t");
//			System.out.print(Logininfo.logininfo.getEmail() + "\t");
//			System.out.println(Logininfo.logininfo.getMoney());
			System.out.println();			
	}//display()
}//class
