package ex03;

public class AlphabetRunnable implements Runnable {

	@Override
	public void run() {
		for(char alphabet='A'; alphabet<='Z'; alphabet++) {
			System.out.print(alphabet);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
