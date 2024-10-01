package sec00.exam03;

public class StringOperatorExample {

	public static void main(String[] args) {
		// 부호 연산자
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println(result1);
		System.out.println(result2);
		
		byte b = -100;
		// byte result3 = -b;	// 부호 연산자를 사용하면 int 타입으로 변환되어 컴파일 오류가 발생합니다.
		int result3 = -b;
		System.out.println(result3);
	}

}
