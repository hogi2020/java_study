package sec00.exam06;

public class Computer {
	// 매개변수의 개수를 모를 경우
	int sum1(int[] values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	// 매개변수의 개수를 모를 경우, 매개변수를 배열 타입으로 선언하면 됩니다.
	// 매개변수를 배열 타입으로 선언하면 메소드를 호출하기 전에 배열을 생성해야 하는 불편함이 있습니다.
	// 그래서 메소드의 매개변수를 ...를 사용해서 선언하면, 호출 시 넘겨준 값의 수에 따라 자동으로 배열이 생성됩니다.
	int sum2(int ... values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

}
