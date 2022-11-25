public class AccountMain {
	public static void main(String[] args) {
		int money;
		
		Account hong = new Account("111-22-333", "홍길동");
		accountConfirm(hong); 
		try {
			Account sim = new Account("999-55-444", "심청", 50000);
			accountConfirm(sim); 			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Account park = new Account("555-66-444", "박문수", -50000);
			accountConfirm(park); 			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
			
		hong.deposit(20000);
		accountConfirm(hong); 
		
		hong.deposit(30000);
		accountConfirm(hong); 
		
		try {
			money = hong.withdraw(10000);
			accountConfirm(hong); 
			System.out.printf("내손에 %d \n", money);		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			money = hong.withdraw(50000);
			accountConfirm(hong); 
			System.out.println();
			System.out.printf("\n 내손에 %d \n \n", money);			
			System.out.println();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}//main()
	
	static void accountConfirm(Account hong) {
		System.out.println("======================");
		System.out.printf("예금주 : %s \n", hong.owner);
		System.out.printf("계좌번호 : %s \n", hong.accountNo);
		System.out.printf("잔액 : %d \n", hong.balance);
		System.out.println("======================");
		System.out.println();
		
	}
	
}//class
