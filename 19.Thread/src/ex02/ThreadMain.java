package ex02;

public class ThreadMain {
	public static void main(String[] args) {
		SMIThread smi = new SMIThread();
		VideoThread video = new VideoThread();
		
		smi.start();
		video.start();
		
	}//main()
}//class
