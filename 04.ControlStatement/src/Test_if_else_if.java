public class Test_if_else_if {
	public static void main(String[] args) {
		//성별코드(code)가 1이면 '남자', 2이면 '여자', 3이면 '남자', 4이면 '여자'
		//그외에는 오류메세지('성별코드가 잘못 입력되었습니다!")
		
		int code = 5;
		System.out.println("성별코드 : " + code);
		
		if(code == 1 || code == 3) {
			System.out.println("남자");
		} else if(code == 2 || code == 4) {
			System.out.println("여자");
		} else {
			System.out.println("성별코드가 잘못 입력되었습니다!");
		}//if
	}//main()
}//class
