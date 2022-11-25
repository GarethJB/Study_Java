import java.util.Arrays;

//행위정보(기능, 동작, 함수)를 저장하는 Class → 메소드의 집합

public class PersonDAO {
	//출력 메소드 : Getters Method
	public void display(PersonDTO[] person) {
		//System.out.println(Arrays.toString(person)); //객체배열(person[])을 참조하는 메모리(Heap 메모리) 주소값
		
		//단순 for문을 이용한 출력
		for (int i = 0; i < person.length; i++) {
			System.out.print(person[i].getName() + "\t");
			System.out.print(person[i].getAge() + "\t");
			System.out.print(person[i].getGender() + "\t");
			System.out.print(person[i].getTel() + "\t");
			System.out.print(person[i].getAddr() + "\n");
		}//for
		
		System.out.println("==============================================================");
		
		//향상된 for문을 이용한 출력
		for (PersonDTO dto : person) {
			System.out.print(dto.getName() + "\t");
			System.out.print(dto.getAge() + "\t");
			System.out.print(dto.getGender() + "\t");
			System.out.print(dto.getTel() + "\t");
			System.out.print(dto.getAddr() + "\n");
		}
	}//display()
}//class
