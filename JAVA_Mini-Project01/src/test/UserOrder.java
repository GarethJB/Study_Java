package test;

import java.util.ArrayList;
import java.util.Scanner;

import product.ProductDAO;
import product.ProductDTO;
import user.UserDAO;


public class UserOrder {
	Productlist list = new Productlist();
	ProductDAO p_dao = new ProductDAO();
	UserDAO u_dao = new UserDAO();
	public void display(Scanner sc) {
		list.display();
		System.out.print("\n주문할 상품 번호 : ");
		int orderNum = sc.nextInt();
		Productinfo.productInfo = u_dao.productInfo(orderNum);
		ArrayList<ProductDTO> list = p_dao.product_list();
		for(ProductDTO dto : list) {
			dto.getNum();
			if (orderNum == dto.getNum()) {
				System.out.print("\n주문갯수 : ");
				int orderQty = sc.nextInt();
				int decreaseMoney = Productinfo.productInfo.getPrice() * orderQty;
				System.out.println("===========================================");
				System.out.println("                 주문 정보                 \n");
				System.out.printf("주문 상품 \t%s \n\n상품 가격 \t%d원 \n\n주문 수량 \t%d \n\n결제 금액 \t%d원", Productinfo.productInfo.getName(), Productinfo.productInfo.getPrice(), orderQty, decreaseMoney);
				System.out.println("\n\n===========================================\n");
				System.out.println("위 내용으로 결제를 진행하시겠습니까?\n");
				System.out.println("1.결제 \t 2.취소\n");
				System.out.print("선택 : ");
				int selectNum = sc.nextInt();
				if (selectNum == 1) {
					if (orderQty > Productinfo.productInfo.getQty()) {
						System.out.println("\n상품의 재고가 부족합니다.");
					} else if (decreaseMoney > Logininfo.logininfo.getMoney()) {
						System.out.println("\n잔액이 부족합니다.");
					} else {
						u_dao.productOrder(orderQty, orderNum);
						String userId = Logininfo.logininfo.getId();
						u_dao.payment(decreaseMoney, userId);
						System.out.println("\n              ");
						System.out.println("▶ 주문완료 ◀");
						System.out.println("              \n");
						break;
					}//if
				} else {
					System.out.println("취소되었습니다.");
				}//if
			} else if (orderNum != dto.getNum()) {
				System.out.println("\n일치하는 상품이 없습니다.");
				break;
			}//if
		}//for
		
	}//display()
}//class
