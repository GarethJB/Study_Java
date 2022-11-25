package test;

import java.util.Scanner;


public class Test_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Login login = new Login();
		Join join = new Join();
		Producthome productMenu = new Producthome();
		Userhome userMenu = new Userhome();
		int mode = 0;
		int selectNum = 0;
		System.out.println("\n★                                    ★");
		System.out.println("                                        ");
		System.out.println("        구글 임직원 복지 쇼핑몰         ");
		System.out.println("                                        ");
		System.out.println("★                                    ★\n");
		do {
			System.out.printf("\n%-12s%-12s%-12s", "1.로그인", "2.회원가입", "3.종료");
			System.out.print("\n\n선택 : ");
			selectNum = sc.nextInt();
			if (selectNum == 1) {
				do {
				mode = login.login(sc);
					if(mode == 1) {
						productMenu.home(sc);
						break;
					} else if (mode == 2) {
						userMenu.home(sc);
						break;
					}//if
				} while(mode != 3);
			} else if (selectNum == 2) {
				join.joinAdd(sc);
			} else if (selectNum == 3) {
				System.out.println("\n프로그램을 종료합니다.");
			} else {
				System.out.println("\n잘못입력하셨습니다.");
			}//if
		} while (selectNum != 3);
	}//main()
}//class
