package label;

public interface Changeable extends Resizble, Colorable {
	//크기를 변경한다, 배경색을 변경한다, 전경색을 변경한다, 폰트를 변경한다
	void setFont(String font);
}//interface
