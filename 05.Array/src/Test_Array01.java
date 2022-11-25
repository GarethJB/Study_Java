public class Test_Array01 {
	public static void main(String[] args) {
		//정수 5개를 저장할 배열(intArray1[])을 선언 및 생성하고
		//모든 요소(index)에 10을 할당하고 출력하시오 ▶
		
		int[] intArray1 = new int[5];	//정수형 배열(intArray1[])을 선언하고 생성
		
		for (int i = 0; i < intArray1.length; i++) {
			intArray1[i] = 10; 			//배열 intArray1[1] 번지(index)에 값(10)을 할당
			System.out.println("intArray1[" + i + "]의 값 : " + intArray1[i]);	//배열 intArray1[]의 값을 출력
		}//for
		
		System.out.println();
		
		//정수 5개를 저장할 배열(intArray2[])을 선언 및 생성하고,
		//각각의 요소에(int)에 10, 20, 30, 40, 50을 할당하고 출력하시오 ▶ for문 활용
		
		int[] intArray2 = new int[5];	//정수형 배열(intArray2[])을 선언하고 생성
		
		for (int i = 0; i < intArray2.length; i++) {
			intArray2[i] = (i + 1) * 10;
			System.out.println("intArray2[" + i + "]의 값 : " + intArray2[i]);
			
		}//for
	
			

		
		
		
	}//main()
}//class
