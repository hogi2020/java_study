package sec00.exam04;

public class IfExample {

	public static void main(String[] args) {
		// if문 
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		} else {
			System.out.println("점수가 80미만 입니다.");
			System.out.println("등급은 C입니다.");
		}
	}
}
