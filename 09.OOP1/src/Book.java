import java.text.DecimalFormat;

public class Book {
	//도서명(title), 저자(name), 출판사(company), 단가(cost), 수량(qty), 가격(price) 
	// ▶ 멤버변수(필드, 속성)
	// 가격을 계산하는 메소드 정의 : getPrice() → 단가 * 수량
	// 출력 메소드 정의 : display()
	
	String title, name, company;
	int cost, qty, price;
	
	//가격 계산하는 메소드
	public void getPrice() {
		price = cost * qty; 
	}//getPrice
	
	//출력 메소드
	public void display() {
		DecimalFormat df = new DecimalFormat("￦#,##0");		//통화기호 : ㄹ → 한자
		System.out.println("도서명 : " + title);
		System.out.println("저자 : " + name);
		System.out.println("출판사 : " + company);
		System.out.println("단가 : " + df.format(cost));
		System.out.println("수량 : " + qty + "권");
		System.out.println("가격 : " + df.format(price));
	}
	

}//class

/*
○ 입력값
- Java, 신용권, 한빛미디어, 24000원, 14
- View, 김은옥, 삼양미디어, 28000원, 13
- SQL, 개발팀, 한울, 15000, 20 
 
[출력예시]
도서명 : 
저자 : 
출판사 : 
단가 : 
수량 : 
가격 : 
 */
