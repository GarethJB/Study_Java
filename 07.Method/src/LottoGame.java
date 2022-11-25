import java.util.Arrays;
import java.util.Random;

public class LottoGame {
	public static void main(String[] args) {
		LottoGame game = new LottoGame();	//LottoGame 객체 생성
		int[] lotto = game.getNumber();		//메소드 호출
		System.out.println(Arrays.toString(lotto));
	}//main()
	
	//번호를 생성하고 리턴하는 메소드
	public int[] getNumber() {
		Random random = new Random();	//무작위로 번호를 생성하기 위한 Random 객체 생성
		int[] lotto = new int[6];		//번호가 저장될 배열을 선언 및 생성
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i = i - 1;
					break;
				}//if
			}//for j
		}//for i
		
		Arrays.sort(lotto);
		return lotto;
	}//getNumber
	
}//class
