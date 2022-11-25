package drink;

import java.util.Scanner;import javax.swing.filechooser.FileNameExtensionFilter;

public class DrinkMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 변수 여러개를 담기 - 배열변수
		DrinkDTO[] drinks = new DrinkDTO[10];
		drinks[0] = new DrinkDTO("콜라", 1250, 10);
		drinks[1] = new DrinkDTO("캔커피", 1500, 5);
		drinks[2] = new DrinkDTO("코코팜", 1300, 3);
		drinks[3] = new DrinkDTO("코코팜", 1300, 3);
		drinks[4] = new DrinkDTO("코코팜", 1300, 3);
		drinks[5] = new DrinkDTO("코코팜", 1300, 3);
		drinks[6] = new DrinkDTO("코코팜", 1300, 3);
		drinks[7] = new DrinkDTO("코코팜", 1300, 3);
		drinks[8] = new DrinkDTO("코코팜", 1300, 3);
		drinks[9] = new DrinkDTO("코코팜", 1300, 3);
		
		DrinkDAO dao = new DrinkDAO(drinks, sc);
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
				dao.insert();			
			} else if (fnkey == 2) {
				dao.list();
			} else if (fnkey == 3) {
				dao.update();
			} else if (fnkey == 4) {
				dao.delete();
			}// else of
			System.out.println();
			System.out.println();
		} while(fnkey != 0);
		
	}//main()
}//class
