package sec00.exam06;

public class Car {
	// 필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	
	// Car 객체를 생성할 때, 외부에서 제공되는 데이터가 없다면 기본 생성자로 Car 객체를 생성하고
	// 외부에서 데이터가 제공되면 그에 따른 Car 객체가 생성되어야 하는데, 생성자가 1개라면 수용이 어렵습니다.
	// 그래서 자바는 다양한 방법으로 객체를 생성할 수 있도록 생성자 오버로딩을 제공합니다.
	// 생성자의 매개변수의 타입과 개수에 따라 호출될 생성자가 결정됩니다.
	// 생성자
	Car() {
		
	}
	
	Car(String model) {
		this(model, "은색", 250);
	}
	
	Car(String model, String color) {
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
