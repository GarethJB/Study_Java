package test;

import java.util.Scanner;

public class Userselect {
	Userinfo info = new Userinfo();
	public int display(Scanner sc) {
		info.display();
		System.out.println("\n1.캐쉬 충전 \t 2.상품 주문 \t 3.로그아웃 \n");
		System.out.print("명령 선택 : ");
		int selectNum = sc.nextInt();
		if (selectNum == 1) {
			return 1;
		} else if (selectNum == 2) {
			return 2;
		} else if (selectNum == 3) {
			return 3;
		} else {
			return 4;
		}//if
	}//display()
}//class
