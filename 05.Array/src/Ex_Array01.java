public class Ex_Array01 {
	public static void main(String[] args) {
		
		//정수를 저장할 배열(intArray[])을 선언하고,
		//저장할 배열의 크기(길이)를 3으로 생성하고,
		//모든 요소에 값(10)을 할당하고 출력하시오.
		
		int[] intArray;			//정수형 배열 intArray을 선언 ▶ int intArray[];
		intArray = new int[3];			//배열의 생성 ▶ new 키워드 사용 : 배열의 크기(길이)가 결정
		//int[] inArray = new int[3];		//배열의 선언 및 생성
		
		intArray[0] = 10;	//배열(intArray[])의 0번지(index)에 값(10)을 할당
		intArray[1] = 10;	//배열(intArray[])의 1번지(index)에 값(10)을 할당
		intArray[2] = 10;	//배열(intArray[])의 2번지(index)에 값(10)을 할당
		
		System.out.println("intArray[0]의 값 : " + intArray[0]);
		System.out.println("intArray[1]의 값 : " + intArray[1]);
		System.out.println("intArray[2]의 값 : " + intArray[2]);
		
	}//main()
}//class
