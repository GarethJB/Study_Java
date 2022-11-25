package drink2;

import java.util.Scanner;

import drink.DrinkDTO;

public class DeleteDAO extends SuperDAO implements DrinkDAO {
	
	DeleteDAO(DrinkDTO[] drinks, Scanner sc) {
	super(drinks,sc);
}

	@Override
	public void delete() {
		list();
		System.out.print("음료선택 : ");
		int idx = checkRange(sc.nextInt()-1);
		if (idx == -1) {
			System.out.println("번호를 잘못 입력했습니다");
		} else if (idx == -2) {
			System.out.println("삭제할 음료가 없습니다");
		} else {
			drinks[idx] = null;
		}
	}

	int checkRange(int no) {
		if(no >= drinks.length) return -1;
		if(drinks[no] == null) {
			return -2;
		} else {
			return no;
		}
	}
	
	public void insert() {}
	public void list() {}
	public void update() {}
	
}
