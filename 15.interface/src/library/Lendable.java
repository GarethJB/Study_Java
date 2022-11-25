package library;

public interface Lendable {
	//대출한다, 반납한다
	void checkOut(String borrower, String CheckOutDate);
	void checkIn();
	
	//public static final
	//대출중, 대출가능
	int STATE_BORROWED = 1;
	int STATE_NORMAL = 0;
}//interface
