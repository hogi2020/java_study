package sec00.exam04;

public class IfDiceExample {

	public static void main(String[] args) {
		// 주사위의 번호 뽑기
		int num = (int) (Math.random() * 6) + 1;	// 주사위 번호 하나 뽑기
		
		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		}
	}
}
