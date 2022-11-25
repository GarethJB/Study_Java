package data;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class PersonMain {
	public static void main(String[] args) {
		String filename = "src/data/회원정보";
		ObjectOutputStream out = null;
		
		try {			
			out = new ObjectOutputStream(new FileOutputStream(filename));
			Person hong = new Person("홍길동", 25, "남");
			out.writeObject(hong);
			
			out.writeObject(new Person("심청", 18, "여"));
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {out.close();} catch (Exception e) {}
		}
		System.out.println("쓰기완료");
		
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream(filename));			
			while(true) {
				Person who = (Person)in.readObject();				
				System.out.printf("%s님 %d세 tjdquf : %c \n"
						,who.name
						,who.age
						,who.gender
						);
			}
		} catch (FileNotFoundException e) {
		} catch (EOFException e) {
		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
		} finally {
			try {in.close();} catch (Exception e2) {}
		}
		
		
	}//main()
}//class
