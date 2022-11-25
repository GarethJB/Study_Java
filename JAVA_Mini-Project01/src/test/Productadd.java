package test;

import java.util.Scanner;

import product.ProductDAO;

public class Productadd {
	ProductDAO dao = new ProductDAO();
	Productlist p_list = new Productlist();
	private int num;
	public void Add(Scanner sc) {
		System.out.printf("제목 : ");
		String name = sc.next() + sc.nextLine();
		
		System.out.printf("\n출판사 : ");
		String company = sc.next() + sc.nextLine();
		
		System.out.printf("\n가격 : ");
		int price = sc.nextInt();
		
		System.out.printf("\n수량 : ");
		int qty = sc.nextInt();
		System.out.println("\n" + num + "\t" + name + "\t" + company + "\t" + price + "\t" + qty);
		dao.productAdd(num, name, company, price, qty);
		System.out.println("\n               ");
		System.out.println("\n▶ 추가 완료 ◀");
		System.out.println("\n               ");
		p_list.display();
	}//Add()
}//Productadd
