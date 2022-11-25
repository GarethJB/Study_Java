public class Ex_Array03 {
	public static void main(String[] args) {
		
		//2행 3열의 정수형 2차원 배열 (intArray[][])을 선언 및 생성하고,
		//모든 요소에 10을 할당하고 출력하시오 ▶ 중첩 for문(이중 for문) 활용
		
		int[][] intArray = new int[2][3];	// 첫[] → 행값  두번째[] → 열값
		
		
		/*
		intArray[0][0] = 10;
		intArray[0][1] = 10;
		intArray[0][2] = 10;

		intArray[1][1] = 10;
		intArray[1][1] = 10;
		intArray[1][2] = 10;
	 	*/
		
		for (int i = 0; i < intArray.length; i++) {				//intArray.length : 2 ▶ row
			for (int j = 0; j < intArray[i].length; j++) {		//intArray[i].length : 3 ▶ col
				intArray[i][j] = 10;
				System.out.print("intArray[" + i + "][" + j + "]의 값 : " + intArray[i][j] + "\t");
			}//for j
			System.out.println();
		}//for i
		

		
		
		
	}//main()
}//class
