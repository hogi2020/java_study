package sec00.exam04;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		// 1부터 100까지 합을 출력
		int sum = 0;	// 합계를 저장할 변수
		
		int i = 1;
		
		int num = (int) (Math.random() * 5) + 1;
		
		while (i <= 100) {
			sum += i;
			i++;
			
			if (num % 2 == 0) {
				break;
			}
		}
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}
