public class Operator04 {
	public static void main(String[] args) {
		//논리 연산자 : 여러개의 조건을 판단 ▶ 조건식 작성에 사용
		//연산의 결과는 true, false로만 반환
		//조건A && 조건B : 모두 만족 → true 출력 ▶ AND 조건
		//조건A || 조건B : 하나라도 만족 → true 출력 ▶ OR 조건
		//논리 부정 연산자 : true → false, false → true ▶ !
		int num1 = 5, num2 =10;
		
		System.out.println(num1 > num2 && num1 < num2);		//출력값 : false → false && true
		System.out.println(num1 < num2 && num1 > num2);		//출력값 : false → true && false
		System.out.println(num1 == num2 && num1 > num2);	//출력값 : false → false && false
		System.out.println(num1 != num2 && num1 < num2);	//출력값 : true → true && true
		
		System.out.println();
		
		System.out.println(num1 > num2 || num1 < num2);		//출력값 : true → false || true
		System.out.println(num1 < num2 || num1 > num2);		//출력값 : true → true || false
		System.out.println(num1 == num2 || num1 > num2);	//출력값 : false → false || false
		System.out.println(num1 != num2 || num1 < num2);	//출력값 : true → true || true
		
		System.out.println();
		
		System.out.println(num1 > num2);	//출력값 : false
		System.out.println(!(num1 > num2));	//출력값 : true
		
	}
}
