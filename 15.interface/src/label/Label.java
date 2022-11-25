package label;

import java.io.IOException;
import java.nio.CharBuffer;

public class Label implements Colorable {
	int width, height;
	String background, foreground, text;
	
	Label( String text, int width, int height, String background, String foreground) {
		this.text = text;
			this.width = width;
			this.height = height;
			this.background = background;
			this.foreground = foreground;
	}//Label
	
	
	@Override
	public void setBackground(String color) {
		// TODO Auto-generated method stub
		background = color;
	}//setBackground()

	@Override
	public void setForeground(String color) {
		// TODO Auto-generated method stub
		foreground = color;
	}//setForeground
	
}//class
