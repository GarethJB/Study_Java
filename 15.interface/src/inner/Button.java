package inner;


public class Button {
	static interface onClickListener {
		void onClick();
	}
	public onClickListener listener;
	
	void click() {
		listener.onClick();
//		System.out.println("버튼클래스 클릭");
	}
	
	public onClickListener getListener() {
		return listener;
	}
	

}//class
