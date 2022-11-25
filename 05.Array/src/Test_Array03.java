public class Test_Array03 {
	public static void main(String[] args) {
		//2행 3열의 정수형 2차원 배열(intArray[][])을 선언 및 생성하고,
		//각각의 요소에 10, 20, 30, 40, 50, 60을 할당하고 출력하시오 ▶ 중첩 for문(이중 for문) 활용
		
		int[][] intArray = new int[2][3];
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = (i * 30) + ((j + 1) * 10);
				System.out.println("intArray[" + i + "][" + j + "]의 값 : " + intArray[i][j] + "\t");
			}//for j
			System.out.println();
		}//for i
		
		
		
		
	}//main()
}//class
