import java.util.Arrays;

public class Ex_Sort {
	//정수형 배열(arr[])의 원소값을 오름차순으로 정렬하고 결과를 리턴받는 매소드를 호출 : getAscSort()
	//정수형 배열(arr[])의 원소값을 내림차순으로 정렬하고 결과를 리턴받는 매소드를 호출 : getDescSort()
	public static void main(String[] args) {
		int[] arr = {3, 2, 4, 1, 5};			//정수형 배열(arr[])을 선언하고 값을 할당 : 초기화
		System.out.println("배열의 원소값 : " + Arrays.toString(arr));
		
		Ex_Sort ex = new Ex_Sort();
		arr = ex.getAscSort(arr);
		System.out.println("오름차순 정렬 : " + Arrays.toString(arr));
		
		arr = ex.getDescSort(arr);
		System.out.println("내림차순 정렬 : " + Arrays.toString(arr));
		
		Arrays.sort(arr);								//오름차순 정렬 메소드
		System.out.println("배열의 원소값 : " + Arrays.toString(arr));
	}//main()
	
	//오름차순 정렬
	public int[] getAscSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {			//i가 기준
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j])	{					//오름차순
					int temp = arr[i];					//i와 j의 값을 교환
					arr[i] = arr[j];
					arr[j] = temp;
				}//if
			}//for j
		}//for i
		return arr;
	}//getAscSort
	
	//내림차순 정렬
	public int[] getDescSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {			//i가 기준
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j])	{					//내림차순
					int temp = arr[i];					//i와 j의 값을 교환
					arr[i] = arr[j];
					arr[j] = temp;
				}//if
			}//for j
		}//for i
		return arr;
	}//getDescSort 
}//class
