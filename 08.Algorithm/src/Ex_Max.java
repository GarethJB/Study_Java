import java.util.Arrays;

public class Ex_Max {
		//초기화된 배열의(arr) 원소값의 최대값(max)을 구하여 리턴하는 메소드를 호출 : getMax()
		//배열의 원소값과 최대값의 결과를 출력하는 메소드를 호출 : display
	public static void main(String[] args) {
		int[] arr = {3, 2, 4, 1, 5};
		
		Ex_Max ex = new Ex_Max();
		int max = ex.getMax(arr);
		ex.display(arr, max);
	}//main()
	
	// 최대값을 구한 후 결과를 리턴하는 메소드를 정의
	public int getMax(int[] arr) {
		int max = arr[0];			//최대값이 저장될 변수를 초기화 ▶ 배열의 첫 번째 index로 할당
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {		//현재의 최대값(max)과 각각의 배열 원소값(arr[i])을 비교
				max = arr[i];		//배열의 원소값이 더 크면, 최대값을 변경(arr[i])의 값으로 재할당
			}//if
		}//for
		return max;
	}//getMax()
	
	//출력메소드
	public void display(int[] arr, int max) {
		System.out.println("배열의 원소값 : " + Arrays.toString(arr));
		System.out.println("원소의 최대값 : " + max);
	}//display()
}//class
