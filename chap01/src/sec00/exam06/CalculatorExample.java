package sec00.exam06;

public class CalculatorExample {

	public static void main(String[] args) {
		// 메소드 호출
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		
		byte x = 10;
		byte y = 4;
		
		myCalc.execute(x, y);
		myCalc.powerOff();
	}
}
