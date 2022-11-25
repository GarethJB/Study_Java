package label;

public class LabelMain {
	public static void main(String[] args) {
		Label java = new Label("혼자 공부하는 자바", 200, 50, "white", "black");
		
		print(java);
				
		java.setBackground("yellow");
		print(java);
		
	}//main()
	static void print(Label what) {
		System.out.printf("%s : %d * %d 크기로 %s 배경색에 %s 텍스트로 출력"
				, what.text, what.width, what.height, what.background, what.foreground);		
		System.out.println();
	}//print()
	
}//class
