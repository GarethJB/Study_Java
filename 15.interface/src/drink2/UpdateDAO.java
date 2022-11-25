package drink2;

import java.util.Scanner;

import drink.DrinkDTO;

public class UpdateDAO extends SuperDAO implements DrinkDAO {
	
	UpdateDAO(DrinkDTO[] drinks, Scanner sc) {
	super(drinks,sc);
}

	@Override
	public void update() {
		list();
		System.out.print("음료선택 : ");
		int idx = sc.nextInt()-1;
		
		System.out.printf("음료명 : %s → ", drinks[idx].name);
		String name = sc.next();
		
		System.out.printf("가격 : %d → ", drinks[idx].price);
		int price = sc.nextInt();
		
		System.out.printf("수량 : %d → ", drinks[idx].quantity);
		int quantity = sc.nextInt();
		
		drinks[idx].name = name;
		drinks[idx].price = price;
		drinks[idx].quantity = quantity;
	}

	public void insert() {}
	public void list() {}
	public void delete() {}

}
