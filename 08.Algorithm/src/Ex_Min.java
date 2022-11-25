import java.util.Arrays;

public class Ex_Min {
	//초기화된 배열의(arr) 원소값의 최소0값(min)을 구하여 리턴하는 메소드를 호출 : getMin()
	//배열의 원소값과 최소값의 결과를 출력하는 메소드를 호출 : display
	public static void main(String[] args) {
		int[] arr = {3, 2, 4, 1, 5};		// 정수형 배열(arr[])을 선언하고 값을 할당 :  초기화
		
		Ex_Min ex = new Ex_Min();
		int min = ex.getMin(arr);
		ex.display(arr, min);
	}//main()
	
	// 최소값(min)을 구한 후 결과를 리턴하는 메소드를 정의
	public int getMin(int[] arr) {
		int min = arr[0];					// 최소값이 저장될 변수를 초기화 ▶ 배열의 첫 번째 index로 할당
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i])	{			// 현재의 최소값(min)과 각각의 배열 원소값(arr[i]을 비교
				min = arr[i];				// 배열의 원소값이 더 작으면, 최소값을 변경(arr[i]의 값으로 재할당
			}//if
		}//for
		return min;
	}//getMin	
	
	//출력메소드
	public void display(int[] arr, int min) {
		System.out.println("배열의 원소값 : " + Arrays.toString(arr));
		System.out.println("원소의 최소값 : " + min);
	}//display
	
}//class
