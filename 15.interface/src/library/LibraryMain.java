//package library;
//
//public class LibraryMain {
//	public static void main(String[] args) {
//		Book story = new Book("종 833.6-다192산-1", "산에 얽힌 기묘한 이야기", "다나카 야스히로");
//		
//		AppendixCD story_cd = new AppendixCD("2022-09-011", "기묘한 이야기 CD");
//		
//		story_cd.checkOut("홍길동", "2022-09-26");
//		
//		story_cd
//	}//main()
//	
//	static void printState(Book book) {
//		System.out.println("도서 : " + book.title);
//		if(book.bookState == Lendable.STATE_NORMAL) {
//			System.out.println("대출상태 : 대출가능");
//		} else {
//			System.out.println("대출상태 : 대출불가");
//		}//if
//		System.out.println("대출상태 : " + book.bookState);
//	}//printState()
//	
//	static void printState(AppendixCD cd) {
//		System.out.println("CD : " + cd.title);
//		if(cd.cdState == Lendable.STATE_NORMAL) {
//			System.out.println("대출상태 : 대출가능");
//		} else {
//			System.out.println("대출상태 : 대출불가");
//		}//if
//		System.out.println("대출상태 : " + cd.cdState);
//	}//printState()
//}//class
