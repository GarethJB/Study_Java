package data;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ReferenceMain {
	public static void main(String[] args) {
		String filename = "src/data/날짜정보";
		ObjectOutputStream out = null;
		
		try {
			//열기
			out = new ObjectOutputStream(new FileOutputStream(filename));
			
			//쓰기
			GregorianCalendar gc = new GregorianCalendar();
			out.writeObject(gc);
			
			gc = new GregorianCalendar(2021, 2,10);
			out.writeObject(gc);
			
			out.writeObject(new GregorianCalendar(2000, 11, 5));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			//닫기
			try {out.close();} catch (Exception e) {}
		}
		System.out.println("쓰기완료");
		
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream(filename));	
			while(true) {
				GregorianCalendar gc = (GregorianCalendar)in.readObject();
				System.out.printf("%d년 %d월 %d일 \n" 
						,gc.get(Calendar.YEAR)
						,gc.get(Calendar.MONTH)+1
						,gc.get(Calendar.DATE)
						);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (EOFException e) {
			System.out.println("읽기끝");
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			try{in.close();} catch(Exception e) {}
		}
		
		
		
	}//main()
}//class
