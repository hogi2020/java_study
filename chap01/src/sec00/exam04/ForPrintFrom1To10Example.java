package sec00.exam04;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
		// 1부터 10까지 출력
		for (int i=1; i<=5; i++) {
			System.out.print(i);
		}
		
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("\n1~100 합 : " + sum);
		
		for (float x=0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
	}

}
