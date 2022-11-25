import java.util.Arrays;

public class Test_Array02 {
	public static void main(String[] args) {
		//초기화된 배열(intArray[])에서 홀수의 합(oddSum)과 짝수의 합(evenSum)을 구하여 출력
			
		int[] intArray = {3, 6, 1, 8, 4, 2, 5, 7, 9};
		int oddSum = 0, evenSum = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i] % 2 == 0) {
				evenSum = evenSum + intArray[i];	
			}else {
				oddSum = oddSum + intArray[i];
			}//if
		}//for
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("intArray[" + i +"]의 값 : " + intArray[i]);
		}//fpr
		System.out.println("배열의 원소값 : " +  Arrays.toString(intArray));
		System.out.println("홀수의 합 : " + oddSum);
		System.out.println("짝수의 합 : " + evenSum);
		
	}//main()
}//class
