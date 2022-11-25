import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception03 {
	public static void main(String[] args) {
		try {
			int result = 10 / 0;	//ArithmeticException : 미확인 예외(실행 예외)
			System.out.println("Result : " + result);
			
			//FileInputStream fis = new FileinputStream("abc.txt");	//확인예외 반드시 예외처리 할 것
			//fis.close();
		} catch (ArithmeticException e) {
			System.out.println("입력값이 잘못되었습니다.");
		//} catch (FileNotFoundException e) {
			System.out.println("해당 파일이 존재하지 않습니다.");
		//} catch (IOException e) {
			System.out.println("입출력 예외발생!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//main()
}//class
