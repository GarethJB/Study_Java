package test;

import java.util.Scanner;

public class Producthome {
	Productlist list = new Productlist();
	Productselect select = new Productselect();
	Productsearch search = new Productsearch();
	Productadd add = new Productadd();
	Productdelete delete = new Productdelete();
	Productupdate update = new Productupdate();
	
	public void home(Scanner sc) {
		int selectNum = 0;
		System.out.println("\n------------------------------------");
		System.out.println("◇           관리자 모드          ◇ ");
		System.out.println("------------------------------------\n");
		list.display();
		do {
			selectNum = select.display(sc);
			if (selectNum == 1) {
				System.out.println("\n====================================");
				System.out.println("◆            상품 검색           ◆ ");
				System.out.println("====================================\n");
				search.search(sc);
			} else if (selectNum == 2) {
				System.out.println("\n====================================");
				System.out.println("◆            상품 추가           ◆ ");
				System.out.println("====================================\n");
				add.Add(sc);
			} else if (selectNum == 3) {
				System.out.println("\n====================================");
				System.out.println("◆            상품 삭제           ◆ ");
				System.out.println("====================================\n");
				delete.Delete(sc);
			} else if (selectNum == 4) {
				System.out.println("\n====================================");
				System.out.println("◆            재고 관리           ◆ ");
				System.out.println("====================================\n");
				update.update(sc);
			} else if (selectNum == 5) {
				System.out.println("\n              ");				
				System.out.println("\n▶ 로그아웃 ◀");				
				System.out.println("\n              ");				
			} else {
				System.out.println("\n유효하지 않은 명령입니다.");
			}//if
		} while(selectNum != 5);
	}//home()
}//class
