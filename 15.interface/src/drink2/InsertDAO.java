package drink2;

import java.util.Scanner;

import drink.DrinkDTO;

public class InsertDAO extends SuperDAO implements DrinkDAO {
		
	InsertDAO(DrinkDTO[] drinks, Scanner sc) {
		super(drinks,sc);
	}
	
	int checkStorage() {			// 정보를 저장할 빈공간을 찾는 메소드
		int position = -1;			// 빈공간 없으면 -1 리턴
		for(int idx = 0; idx < drinks.length; idx++) {
			if(drinks[idx] == null) {
				position = idx;		// 빈공간 존재시 해당 인덱스 리턴
				break;
			}//if
		}//for
		return position;
	}//checkStorage()
	
	@Override
	public void insert() {
		int idx = checkStorage();
		if(idx == -1) {
			System.out.println("저장공간 부족으로 등록불가!");
			return;
		}
		
//		System.out.println("등록처리");
		System.out.print("음료명 : ");
		String name = sc.next();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("수량 : ");
		int quantity = sc.nextInt();
		
		drinks[idx] = new DrinkDTO(name, price, quantity);
		
	}

	public void list() {}
	public void update() {}
	public void delete() {}
	
}
