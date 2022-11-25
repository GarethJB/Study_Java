package animal;

abstract public class Animal {
	String kind;
	Animal(String kind) {
		this.kind = kind;
	}
	abstract void sound(); //{
		//상속받을 sub클래스마다 sound 메소드 내부의 처리가
		//각각 다르기 때문에
		//메소드의 처리내용을 구체적으로 쓸수가 없다
		//System.out.println(kind + "소리를 낸다");
		
	//}//sound()
}//class
