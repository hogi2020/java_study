package sec00.exam03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// 논리 연산자
		// &&는 피연산자가 하나여도 작동됩니다. &는 양쪽에 피연산자가 있어야 합니다.
		int charCode = 'A';
		
		if( (charCode >= 65) & (charCode <= 90) ) {
			System.out.println("대문자군요");
		}
		
		if( (charCode >= 97) && (charCode <= 122) ) {
			System.out.println("소문자군요");
		}
		
		if( !(charCode < 48) && !(charCode > 57) ) {
			System.out.println("0~9 숫자군요");
		}
		
		// ||는 피연산자가 하나여도 작동됩니다. |는 양쪽에 피연산자가 있어야 합니다.
		int value = 6;
		if ( (value%2 == 0) | (value%3 == 0) ) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		if ( (value%2 == 0) || (value%3 == 0) ) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		// 삼항 연산자를 통해 if문을 간소화할 수 있습니
		char grade = (value > 90) ? 'Y' : 'N';
		System.out.println(grade);
	}

}
