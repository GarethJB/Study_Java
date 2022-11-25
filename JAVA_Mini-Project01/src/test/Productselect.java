package test;

import java.util.Scanner;

public class Productselect {
	public int display(Scanner sc) {
		System.out.println("\n1.상품 검색 \t 2.상품 추가 \t 3.상품 삭제 \t 4.재고 관리 \t 5.로그아웃 \n");
		System.out.print("명령 선택 : ");
		int selectNum = sc.nextInt();
		if (selectNum == 1) {
			return 1;
		} else if (selectNum == 2) {
			return 2;
		} else if (selectNum == 3) {
			return 3;
		} else if (selectNum == 4) {
			return 4;
		} else if (selectNum == 5){
			return 5;
		} else {
			return 6;
		}//if
	}//Productselect()
}//class
