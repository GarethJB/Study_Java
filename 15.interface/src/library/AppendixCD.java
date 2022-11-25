//package library;
//
//abstract public class AppendixCD extends CD implements Lendable {
//	String borrower, checkOutDate;
//	int cdState;
//	AppendixCD(String registeredNo, String title) {
//		super(registeredNo, title);
//	}//AppendixCD
//	
//	public void checkOut(String borrower, String checkOutDate) throws Exception {
//		//if(cdState == 1) return;
//		if(cdState == 1) throw new Exception(title + " : 대출중으로 대출불가");
//		this.borrower = borrower;
//		this.checkOutDate = checkOutDate;
//		cdState = 1;
//		System.out.printf("[%s] CD가 대출되었습니다 \n", title);
//		System.out.println("대출자 : " + borrower);
//		System.out.println("대출일자 : " + checkOutDate);
//	}//checkOut()
//	public void checkIn() {
//		//대출관련정보를 초기화
//		this.borrower = null;
//		this.checkOutDate = null;
//		this.cdState = STATE_NORMAL;
//		System.out.printf("[%s] CD가 반납되었습니다 \n", title);
//	}//checkIn
//}//class
