package drink2;

import java.util.Scanner;

import drink.DrinkDTO;

public class ListDAO extends SuperDAO implements DrinkDAO {
	
	ListDAO(DrinkDTO[] drinks, Scanner sc) {
	super(drinks,sc);
}

	@Override
	public void list() {
//			System.out.println("목록처리");	
			System.out.println("------------------------------");
			System.out.println("번호  음료명    가격      수량");
			System.out.println("------------------------------");
			
			int no = 0;
			for(DrinkDTO dto : drinks) {
				if(dto != null) {
					System.out.printf("%d. %s \t %d \t %d \n", ++no, dto.name, dto.price, dto.quantity);
				}//if
			}//for
			if(no == 0) System.out.println("등록된 음료가 없습니다");
		}

	public void insert() {}
	public void update() {}
	public void delete() {}

}
