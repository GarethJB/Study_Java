package data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Filename = "src/data/명단.txt";
		BufferedReader in = null;
		System.out.print("조회할 사람의 이름을 입력하시오 : ");
		String findName = sc.nextLine();
		
		try {
			in = new BufferedReader (new FileReader(Filename));
			while(true) {
				String line = in.readLine();
				if(line == null) break;
				System.out.println(line);
				if(line.substring(0,3).equals(findName)) {
					String[] find = line.split(",");
					System.out.println(find[0]);
				}//if
			}//while
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} finally { try {in.close();} catch(Exception e) {}}
		
//		FileReader in = null;
//		String findName = "임주빈";
//		
//		System.out.print("조회할 사람의 이름을 입력하시오 : ");
//		String searchName = sc.nextLine();
//		sc.close();
//		
//		try {
//			reader = new BufferedReader(new FileReader(readFilename));
//			while (findName == searchName) {
//				reader.readLine();
//			}
//			System.out.println();
//		} catch (FileNotFoundException e) {
//		} catch (IOException e) {
//		} finally {try {in.close();} catch(Exception e) {}}
		
		//BufferedReader 를 사용해
		//명단.txt 파일에서 데이터를 한 줄씩 읽어온다: readLine()
		//각 행에는 다음의 형태의 정보가 있다 : 홍길동, 남, 010-1237-5678
		//출력형태
		//성명 : 홍길동
		//성별 : 남
		//전화번호 : 010-1234-4765
		
	}//main()
}//class
