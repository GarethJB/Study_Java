	//상태정보 (멤버변수, 필드, 속성) 를 저장하는 Class : DTO, VO, Java Beans
	//서로 다른 타입의 데이터를 하나로 묶기 위해서 설계
public class PersonDTO {	
	
	//① 멤버변수(필드, 속성) 선언 ▶ 접근제어자 : private → 외부로부터 접근 제한
	//정보은닉 (Information Hiding), 캡슐화(Encapsulation)
	private String name;
	private int age;
	private String gender;
	private String tel;
	private String addr;
	
	//② 기본 생성자 메소드 : Default Constructor Method
	//객체를 생성할 때 호출되는 메소드 : new PersonDTO();
	//생략하면 JVM이 자동으로 생성 : DTO Class 설계 시 반드시 구현
	//클래스의 이름과 메소드의 이름이 동일, 리턴타입이 존재하지 않는다
	//전달되는 매개변수 리스트와 구현부(body{})에 코드가 없다 : 빈깡통
	//만약에 구현부(body{})에 코드를 작성하면, 객체가 생성될 때 구현부의 코드가 무조건 실행
	public PersonDTO() {}	//void → 리턴타입

	//③ 생성자 메소드 초기화 : 멤버변수들이 하나로 묶어진다.
	//Source Menu(Source) → Generate Constructor using Fields... 	
	public PersonDTO(String name, int age, String gender, String tel, String addr) {
		super();				//상위클래스 : JAVA의 모든 클래스는 Object Class를 무조건 상속
		this.name = name;		//매개변수와(전달되는 값)와 멤버변수(클래스 안에서 선언된 변수)를
		this.age = age;			//구분하기 위해서 멤버변수 앞에 this 키워드를 사용
		this.gender = gender;
		this.tel = tel;
		this.addr = addr;
	}
	
	//④ 입력(Setters), 출력(Getters) 메소드를 정의 : 멤버변수에 접근
	//Source Menu(Source) → 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}


	
}//class