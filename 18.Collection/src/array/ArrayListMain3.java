package array;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ArrayListMain3 {
	public static void main(String[] args) {
		//13명의 정보가 있는 명단.txt 파일의 정보를 읽어서 자료구조에 담는다
		//BufferedReader 로 버퍼링하고 FileReader 를 사용한다
		String read = "D:\\미니프로젝트-제출\\실습과제\\명단.txt";
		
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader in = null;
		try {
			in
			= new BufferedReader( new FileReader( read ) );
			String line;
			while( (line=in.readLine()) != null ) {
				list.add(line);
			}
					
		}catch(FileNotFoundException e) {
		}catch(IOException e) {
		}finally {
			try{ in.close(); }catch(Exception e) {}
		}
		
		//d:/io/202호/student.html 로 다음의 형태로 출력되게 한다.
		//html 파일로의 출력은 PrintWriter 를 사용한다
		String path = "d:/io/202호";
		String filename = "student.html";
		File folder = new File( path );
		if( ! folder.exists() ) folder.mkdirs();
		
		PrintWriter out = null;		
		try {
			out = new PrintWriter( folder + "/" + filename );
			out.print("<html>");
			out.print("<body>");
			out.print("<style>");
			out.print("thead th:first-child{ width:160px} ");
			out.print("thead th:nth-child(2){ width:100px} ");
			out.print("thead th:last-child{ width:200px} ");
			out.print("table td{ text-align:center } ");
			out.print("</style>");
			out.print("<h3>스마트 웹&앱 202호</h3>");
			out.print("<table border='1'>");
			out.print("<thead>");
			out.print("<tr><th>이름</th><th>성별</th><th>전화번호</th></tr>");
			out.print("</thead>");	
			out.print("<tbody>");
			
			for(String line : list) {
				String info[] = line.split(",");
				out.printf("<tr><td>%s</td><td>%s</td><td>%s</td></tr>"
						, info[0], info[1], info[2]);
			}
			out.print("</tbody>");	
			out.print("</body>");
			out.print("</html>");
			
			
		}catch(IOException e) {
		}finally {
			out.close();
		}
	}
}
