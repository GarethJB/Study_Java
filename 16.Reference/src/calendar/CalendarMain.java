package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class CalendarMain {
	public static void main(String[] args) {
		
		GregorianCalendar today = new GregorianCalendar();
		int year = today.get(Calendar.YEAR)+1;	//0~11(1~12)
		int month = today.get(Calendar.MONTH);
		int date = today.get(Calendar.DATE);
		System.out.printf("%d년 %d월 %d일 \n", year, month, date);
		
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat df = new SimpleDateFormat("YYYY년 MM월 DD일 E a hh:mm:ss");
//		SimpleDateFormat df = new SimpleDateFormat("YYYY년 MM월 DD일 E HH:MM:SS"); - 24시간 기준
//		SimpleDateFormat df = new SimpleDateFormat("YYYY년 MM월 DD일 E a HH:MM:SS"); - 12시간 기준
		String now2 = df.format(now);
		System.out.println(now2);
		
	}//main()
}//class
 