public class PersonMain {
	//3명의 회원정보(이름, 나이, 성별, 전화번호, 주소 : PersonDTO.java)를 저장 할
	//객체배열(person[])을 선언 및 생성하고 값을 할당하고 출력메소드를 호출
	public static void main(String[] args) {
		PersonDTO[] person = new PersonDTO[3];		//PersonDTO 타입을 갖는 배열을 선언 및 생성
		
		//초기화된 생성자 메소드(DTO 설계 3단계)를 이용한 값을 할당
		person[0] = new PersonDTO("홍길동", 33, "남", "010-1111-1111", "광주광역시 서구 농성동");
		person[1] = new PersonDTO("박문수", 30, "남", "010-2222-2222", "광주광역시 남구 봉선동");
		
		//디폴트 생성자 메소드(DTO 클래스 설계 2단계)를 이용한 값을 할당 ▶ 
		PersonDTO dto = new PersonDTO();
		dto.setName("성춘향");
		dto.setAge(28);
		dto.setGender("여");
		dto.setTel("010-3333-3333");
		dto.setAddr("광주광역시 북구 용봉동");
		person[2] = dto;
		
		//메소드 호출 : DAO Class
		PersonDAO dao = new PersonDAO();
		dao.display(person);
	
	}//main()
}//class
