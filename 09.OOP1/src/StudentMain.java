public class StudentMain {
	//Student Class를 이용하여 객체를 생성
	//값(이름, 국어, 영어, 수학)을 할당 : 멤버변수
	//총점계산, 평균계산, 출력하는 메소드를 호출 : 멤버메소드
	public static void main(String[] args) {
		Student s1 = new Student();		//Studnet 객체 생성 : s1 ▶ 인스턴스 변수 (실체화 된 변수)
		s1.name = "홍길동";				//인스턴스변수명.멤버변수=값;
		s1.kor = 90;
		s1.eng = 65;
		s1.mat = 100;
		s1.getSum();					//인스턴스변수명.멤버메소드();
		s1.getAvg();
		s1.display();
		
		System.out.println();
		
		Student s2 = new Student();		
		s2.name = "박문수";				
		s2.kor = 100;
		s2.eng = 95;
		s2.mat = 80;
		s2.getSum();					
		s2.getAvg();
		s2.display();
	}//main()
}//class