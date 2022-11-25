package ex;

public class PersonMain {
	public static void main(String[] args) {
		//나그네인 사람 생성
		Person who = new Person();
		who.name = "나그네";
		who.age = 30;
		who.eat();
		who.sleep();
		System.out.println();
		
		Student hong =  new Student();
		hong.name = "홍길동";
		hong.age = 24;
		hong.studentNo = "22005";
		hong.eat();
		hong.sleep();
		hong.gotoSchool();
		System.out.println();
		
		Worker park = new Worker();
		park.name = "박문수";
		park.age = 43;
		park.workerNo = "12455213";
		park.eat();
		park.sleep();
		park.gotoCompany();
	}//main()
}//class
