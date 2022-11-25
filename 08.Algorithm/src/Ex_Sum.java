import java.util.Arrays;

public class Ex_Sum {
	//초기화된 배열의(arr) 원소값의 누적합(sum)을 구하여 리턴하는 메소드를 호출 : getSum()
	//배열의 원소값과 누적합의 결과를 출력하는 메소드를 호출 : display()
	
	public static void main(String[] args) {
		int[] arr = {3, 2, 4, 1, 5};		// 정수형 배열(arr[])을 선언하고 값을 할당 : 초기화
		
		Ex_Sum ex = new Ex_Sum();			// Ex_Sum 객체 생성 : 클래스 안에 있는 메소드를 호출하기 위함
		int sum = ex.getSum(arr);			// 배열의 원소값의 누적합을 구하고 리턴하는 메소드를 호출
		ex.display(arr, sum);									
 	}//main()	
	
	//배열의 원소값의 누적합을 구하고 리턴하는 메소드를 정의
	public int getSum(int[] arr) {
		int sum = 0;						// 결과가 저장될 변수(sum)를 선언하고 값을 할당 : 초기화
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];				// 누적합 계산
		}//for
		return sum;
	}//getSum()
	
	public void display(int[] arr, int sum) {
		System.out.println("배열의 원소값 : " + Arrays.toString(arr));	//Arrays → class, toString → method
		System.out.println("원소의 누적합 : " + sum);
	}//display
}//class
