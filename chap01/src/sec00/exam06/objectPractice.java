package sec00.exam06;

public class objectPractice {

	public static void main(String[] args) {
		// 객체 지향 프로그래밍 연습
		// 객체란, 물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서
		// 자신의 속성을 가지고 있으면서 식별 가능한 것을 말합니다.
		// 즉 현실세계의 객체를 소프트웨어 객체로 설계하는 것을 객체 모델링이라고 합니다.
		
		// 객체 간의 관계에는 상속관계, 사용관계, 집합관계가 있습니다.
		// 집합관계 : 자동차는 엔진, 타이어, 핸들 등으로 구성되므로 자동차와 부품들은 '집합관계'라고 볼 수 있습니다.
		// 사용관계 : 객체 간의 상호작용을 의미하며, 객체는 다른 객체의 메소드를 호출하여 결과를 얻어냅니다. (달린다, 멈추다 등)
		// 상속관계 : 상위객체를 기반으로 하위객체를 생성하는 관계를 의미하며, 기계(상위)와 자동차(하위)의 관계를 의미합니다.
		
		// 객체 지향 프로그래밍은 만들고자 하는 완성품인 객체를 모델링하고,
		// 집합관계에 있는 부품 객체와 사용관계에 았는 객체를 하나씩 설계하고 조립하는 방식으로 프로그램을 개발하는 기법입니다.
		
		// 객체 지향 프로그래밍 개발은 세 가지 단계가 있습니다.
		// 1단계는 클래스를 설계합니다.
		// 2단계는 설계된 클래스를 가지고 사용할 객체를 생성합니다.
		// 3단계는 생성된 객체를 이용합니다.
		
		// 클래스 이름은 식별 가능해야하므로 식별자 작성 규칙에 따라 만들어야 합니다.
		// 하나이상의 문자, 첫 글자에 숫자 사용불가, $,_ 외의 특수문자는 사용불가, 예약어는 사용불가
		
		// 하나의 .java 파일에 일반적으로 하나의 클래스를 선언합니다.
		// 2개이상의 클래스를 선언할 수 있지만, 클래스 개수만큼 바이트 코드 파일(.class)이 생성됩니다.
		// 결국 소스 파일은 클래스 선언을 담고 있는 저장단위일 뿐, 클래스 자체가 아닙니다.
		
		// new 클래스();는 클래스로부터 객체를 생성시키는 연산자 입니다.
		// 메모리 내에서 생성된 객체의 위치를 알기 위해 new 연산자는 힙 영역에 객체를 생성시킨 후 객체의 번지를 리턴합니다.
		
		// Student와 StudentExample 클래스의 용도
		// 클래스는 두가지 용도가 있는데, 하나는 라이브러리용, 다른 하나는 실행용 입니다.
		// 라이브러리 클래스는 다른 클래스에서 이용할 목적으로 설계됩니다.
		// 대부분 객체 지향 프로그램은 라이브러리와 실행 클래스가 분리되어 있습니다.
		
		// 클래스의 구성 멤버
		// 필드 : 객체의 데이터가 저장되는 곳이며, 초기값이 없으면 객체 생성 시 자동으로 초기값으로 설정됩니다. 
		// 생성자 : 객체 생성 시 초기화 역할 담당
		// 메소드 : 객체의 동작에 해당하는 실행 블록
	}

}
