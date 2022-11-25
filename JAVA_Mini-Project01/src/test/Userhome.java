package test;

import java.util.Scanner;

public class Userhome {
	Productlist list = new Productlist();
	Userinfo info = new Userinfo();
	Userselect select = new Userselect();
	Moneycharge charge = new Moneycharge();
	UserOrder order = new UserOrder();
	public void home(Scanner sc) {
		int selectNum = 0;
		System.out.println("\n------------------------------------");
		System.out.println("◇           사용자 모드          ◇ ");
		System.out.println("------------------------------------\n");
		list.display();
		do {
			selectNum = select.display(sc);
			if (selectNum == 1) {
				System.out.println("\n====================================");
				System.out.println("◆            금액 충전           ◆ ");
				System.out.println("====================================\n");
				charge.charge(sc);
			} else if (selectNum == 2) {
				System.out.println("\n====================================");
				System.out.println("◆            상품 주문           ◆ ");
				System.out.println("====================================\n");
				order.display(sc);
			} else if (selectNum == 3) {
				System.out.println("\n              ");				
				System.out.println("\n▶ 로그아웃 ◀");				
				System.out.println("\n              ");		
			} else {
				System.out.println("\n유효하지 않은 명령입니다.");
			}//do
		} while(selectNum != 3);
	}//home()
	
}//class
