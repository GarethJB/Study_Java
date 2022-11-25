public class Operator08 {
	public static void main(String[] args) {
		//Escape Sequence : 프로그램에서 사용되는 특수기호 연산자 ▶ 출력문
		//역슬래쉬(\)를 먼저 입력하고 사용
		//코딩 후 실행할 때 가급적이면 CMD에서 실행
		//① *.class 파일이 있는 위치(폴더) 주소를 복사
		//② CMD(명령 프롬프트) 창을 실행 ▶ window Key + R
		//③ 드라이브 경로 변경 ▶ d:
		//④ 디렉토리(폴더) 변경 ▶ cd + 복사한 주소
		//⑤ *.class 실행 ▶ java 실행할 파일 이름
		System.out.println("1. HelloWorld");
		System.out.println("2. Hello" + "\t" + "World");	// \t : TAB → 일정간격 띄어쓰기
		System.out.println("3. Hello\tWorld");	//문자열 출력문 안에서 연결하여 사용
		System.out.println("4. Hello" + "\b" + "World");	// \b : Back Space 
		System.out.println("5. Hello" + "\r" + "World");	// \r : Carriage Return (행의 처음으로 커서를 이동)
		System.out.println("6. Hello" + "\n" + "world");	// \n : New Line (줄바꿈)
		System.out.println("7. Hello" + "\'" + "world");	// /' : 홑따옴표를 그대로 표시
		System.out.println("8. Hello" + "\"" + "world");	// /" : 쌍따옴표를 그대로 표시
		System.out.println("9. Hello" + "\\" + "world");	// /\ : 역슬래쉬를 그대로 표시
		
		System.out.println("\n번호" + "\t" + "이름" + "\t" + "주소");
		System.out.println("1" + "\t" + "홍길동" + "\t" + "광주광역시 서구 농성동");
		System.out.println("100" + "\t" + "허준" + "\t" + "광주광역시 서구 경열로 3");
		
		System.out.println("\n나는 자바를 공부하고 있습니다!");
		System.out.println("나는 '자바'를 공부하고 있습니다!");
		System.out.println("나는 \"자바\"를 공부하고 있습니다!");
		System.out.println("나는" + "\"" + "자바" + "\"" + "를 공부하고 있습니다!");
	}//main()
}//class
