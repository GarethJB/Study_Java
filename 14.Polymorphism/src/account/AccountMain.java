package account;

public class AccountMain {
	public static void main(String[] args) {
		// 상속관계가 있을 때
		// 생선한 sub클래스 객체는 super의 타입으로 표현 가능 : 다형성
		Account hong = new Account("111-22-333", "홍길동");
		Account park = new MinusAccount("222-33-4444", "박문수", 500000);
		Account sim = new CheckcardAccount("333-44-5555", "심청", "9964-4544-5462-4452");
		
		infoAccount(hong);
		infoAccount(park);
		infoAccount(sim);
		
	}//main()
	
	static void infoAccount(Account who) {
		System.out.println("통장 ------------------");
		System.out.println("예금주" + who.owner);
		System.out.println("계좌번호" + who.accountNo); 
		System.out.println("잔액" + who.balance);
		//실제 생성된 객체가 무엇인지에 따라
		//객체생성(생성된 객체가 메모리에 올라간다) : 인스턴스화
		if(who instanceof MinusAccount) {
			//서브의 메소드, 필드에 대해 접근가능
			//Account → MinusAccount로 변환 : cast
			// 변환된타입 변수명 = (변환될 타입)원래타입
			// int no1 = 10;
			// byte no2 = (byte) no1;
			MinusAccount minus = (MinusAccount)who;
			System.out.println("한도" + minus.minusLimit);
			//슈퍼클래스의 타입을 서브클래스타입으로 형변환 : downCast
			//서브클래스의 타입을 슈퍼클래스타입으로 형변환 : upCast
		}//if
	}//infoAccount()
	
	static void infoAccount(MinusAccount who) {
		System.out.println("통장 ------------------");
		System.out.println("예금주" + who.owner);
		System.out.println("계좌번호" + who.accountNo); 
		System.out.println("잔액" + who.balance);
		System.out.println("한도" + who.minusLimit);
	}//infoAccount()
	
	static void infoAccount(CheckcardAccount who) {
		System.out.println("통장 ------------------");
		System.out.println("예금주" + who.owner);
		System.out.println("계좌번호" + who.accountNo); 
		System.out.println("카드번호" + who.cardNo);
		System.out.println("잔액" + who.balance);
	}//infoAccount()
}//class
