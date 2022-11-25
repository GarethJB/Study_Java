package drink2;

import java.util.Scanner;

import drink.DrinkDTO;

public class DrinkMain {
	public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
		
	DrinkDTO[] drinks = new DrinkDTO[5];
	DataControl data = new DataControl(drinks, sc);

		int fnkey = 0;
		do {
			System.out.println("음료관리 프로그램");
			System.out.println("---------------------------------------------------");
			System.out.println("1.음료등록  2.음료목록보기  3.음료변경  4.음료삭제");
			System.out.println("---------------------------------------------------");	
			System.out.println("0.프로그램 종료");
			System.out.println("---------------------------------------------------");
			System.out.print("기능번호 선택 : ");
			fnkey = sc.nextInt();
			if(fnkey == 1) {
				data.insert();			
			} else if (fnkey == 2) {
				data.list();
			} else if (fnkey == 3) {
				data.update();
			} else if (fnkey == 4) {
				data.delete();
			}// else of
			System.out.println();
			System.out.println();
		} while(fnkey != 0);
		
	}//main()
}//class
