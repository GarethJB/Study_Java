package test;

import java.util.Scanner;

import user.UserDAO;

public class Moneycharge {
	UserDAO dao = new UserDAO();
	public void charge(Scanner sc) {
		String id = Logininfo.logininfo.getId();
		System.out.print("\n충전할 금액 : ");
		int money = sc.nextInt();
		dao.money_charge(money, id);
		System.out.println("\n               ");
		System.out.println("▶ 충전 완료 ◀");
		System.out.println("               \n");
	}//charge()
}//class
