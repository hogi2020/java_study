package sec00.exam03;

public class CharOperationExample {

	public static void main(String[] args) {
		// char 타입의 산술 연산
		char c1 = 'A' + 1;			// A가 유니코드 65로 인식되어 65+1=66이 됩니다.
		System.out.println(c1);		// 리터럴간의 연산은 컴파일 단계에서 수행하기 때문에 타입 변환이 없습니다.
		
		int c3 = c1 + 10;			// 산술연산의 결과는 int 타입으로 반환됩니다.
		System.out.println(c3);
		
		String str1 = 3 + 3 + "JDK";
		System.out.println(str1);
		
		String str2 = "JDK" + (3 + 3);
		System.out.println(str2);
		
		String str3 = 3 + "JDK" + 3;
		System.out.println(str3);
	}

}
