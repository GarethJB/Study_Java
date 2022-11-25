package test;

import java.util.ArrayList;
import java.util.Scanner;

import product.ProductDAO;
import product.ProductDTO;

public class Productupdate {
	Productlist p_list = new Productlist();
	ProductDAO dao = new ProductDAO();
	
	public void update(Scanner sc) {
		ArrayList<ProductDTO> list = dao.product_list();
		System.out.println("\n◆                                                                     ◆");
		System.out.println("                               상품 목록                               ");
		System.out.println("\n========================================================================");
		System.out.printf(" %-1s \t %-15s \t %-10s \t %-5s \t %s \n", "번호", "이름", "출판사", "가격", "수량");
		System.out.println("------------------------------------------------------------------------");
		for(ProductDTO dto : list) {
			System.out.printf("\n %-1d \t %-10s \t %-10s %-10d \t %d", dto.getNum(), dto.getName(), dto.getCompany(), dto.getPrice(), dto.getQty());
		}//for
		System.out.println("\n\n========================================================================");
		System.out.println("\n\n◆                                                                     ◆\n");
		System.out.println("\n1.상품 입고 \t 2.상품 출고 \n");
		System.out.print("선택 : ");
		int select = sc.nextInt();
		if (select == 1) {
			System.out.print("\n입고할 상품의 번호 : ");
			int num = sc.nextInt();
			list = dao.product_list();
			for(ProductDTO dto : list) {
				dto.getNum();
				if (num == dto.getNum()) {
					System.out.print("\n입고량 : ");
					int qty = sc.nextInt();
					dao.productipgo(num, qty);
					p_list.display();
					break;
				} else if (num != dto.getNum()) {
					System.out.println("\n일치하는 상품이 없습니다.");
					break;
				}//if
			}//for
		} else if (select == 2) {
			System.out.print("\n출고할 상품의 번호 : ");
			int num = sc.nextInt();
			list = dao.product_list();
			for(ProductDTO dto : list) {
				dto.getNum();
				if (num == dto.getNum()) {
					System.out.print("\n출고량 : ");
					int qty = sc.nextInt();
					dao.productchulgo(num, qty);
					p_list.display();
					break;
				} else if (num != dto.getNum()) {
					System.out.println("\n일치하는 상품이 없습니다.");
					break;
				}//if
			}//for
//			System.out.print("\n출고할 상품의 번호 : ");
//			int num = sc.nextInt();
//			System.out.print("\n출고량 : ");
//			int qty = sc.nextInt();
//			dao.productchulgo(num, qty);
//			p_list.display();
		} else {
			System.out.println("\n잘못 입력하셨습니다.");
		}//else
	}//update()
	
}//class
