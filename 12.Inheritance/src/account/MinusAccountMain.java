package account;

public class MinusAccountMain {
	public static void main(String[] args) {
		MinusAccount sim = new MinusAccount("546-54-4564", "심청", 50000);
		
		sim.deposit(100000);
		try {
			int out = sim.withdraw(500000);			
			System.out.println("출금액 : " + out);
			System.out.println("통장잔고 : " + sim.balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}//try
	}//main()
}//class
