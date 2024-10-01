package sec03.exam01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		// 메소드 블록 내에서 선언된 변수를 로컬변수라고 하는데, 메소드 블록 내부에서만 사용되고, 메소드 실행이 끝나면 메모리에서 없어집니다.
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y: " + y);
		
		int temp = x;    // 변수 x를 변수 temp의 초기값으로 설정
		x = y;           // 변수 x에 변수 y를 재선언
		y = temp;        // 변수 y에 변수 temp를 재선언
		System.out.println("x: " + x + ", y: " + y);
	}
}
