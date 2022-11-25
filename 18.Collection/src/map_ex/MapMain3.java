package map_ex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class MapMain3 {
	public static void main(String[] args) {
		//명단.txt 파일을 BufferedReader를 사용해 읽는다
		String filename= "src/명단.txt";
		BufferedReader in = null;
		HashMap<String, StudentDTO> map =
				new HashMap<String, StudentDTO>(); 
		
		
		try {
			in = new BufferedReader( new FileReader(filename));
			String line = in.readLine();
			while ((line = in.readLine()) != null) {
				//홍길동, 남, 010
				//HashMap에 13명의 데이터를
				//key: 이름 String, 데이터: StudentDTO로 담는다
				String info[] = line.split(",");
				StudentDTO dto =
						new StudentDTO(info[0], info[1], info[2]);
				map.put(info[0], dto);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			//파일 닫기
			try {in.close();}catch(Exception e) {}
		}
		
		//누구의 정보를 확인할 것인지 묻는다
		//키보드로 이름을 입력한다
		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 사람 : ");
		String name = sc.next();
		sc.close();
		//해당 학생정보를 출력한다
		StudentDTO student = map.get(name);
		if (student != null) {
			System.out.println("성명 : " + student.getName());
			System.out.println("성별 : " + student.getGender());
			System.out.println("전화번호 : " + student.getPhone());			
		} else {
			//해당 학생이 없으면 해당 학생이 없음을 출력한다
			System.out.println("해당 학생이 없습니다.");
		}
		
		
		
		
		/*
		 * Scanner scan = new Scanner(System.in); BufferedReader in = null; String
		 * Filename = "src/명단.txt"; StudentDTO dto = null; HashMap<String, StudentDTO>
		 * student = new HashMap<String, StudentDTO>(); String[] stra;
		 * 
		 * try { in = new BufferedReader (new FileReader(Filename)); String line;
		 * while((line= in.readLine()) != null) { stra = line.split(","); dto = new
		 * StudentDTO(stra[0], stra[1], stra[2]); student.put(stra[0], dto); }//while }
		 * catch (FileNotFoundException e) { } catch (IOException e) { } finally { try
		 * {in.close();} catch(Exception e) {}} System.out.println("조회할 사람 : "); String
		 * name = scan.next(); if(student.get(name) != null) {
		 * System.out.println(student.get(name).getName());
		 * System.out.println(student.get(name).getGender());
		 * System.out.println(student.get(name).getPhone()); } else {
		 * System.out.println("해당 학생이 없습니다."); }
		 */
		
	}//main()
}//class
