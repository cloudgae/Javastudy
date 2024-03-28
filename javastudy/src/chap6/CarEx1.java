package chap6;

/*
 * 선언 위치에 따른 변수의 종류
 *                   선언위치     선언방법                 메모리할당시점    메모리할당위치
 *  - 클래스변수        클래스내부    static 자료형 변수명      클래스정보로드시    클래스영역   ->모든 객체가 하나의값만 필요할때
 *           =>객체화 필요없음. 모든 객체의 공통변수로 사용됨
 *           =>클래스명.변수명
 *           =>기본값으로 초기화
 *  - 인스턴스변수       클래스내부           자료형 변수명      객체화시            힙영역
 *           =>객체화 필요. 객체별로 다른 메모리 할당됨(c1의 color와 c2의 color는 다름)
 *           =>참조변수명.변수명
 *           =>기본값으로 초기화
 *  - 지역변수          메서드내부   자료형 변수명              선언문실행시        스택영역
 *           =>메서드, 블럭내에서만 사용가능
 *           =>기본값으로 초기화 안됨. 반드시 초기화 필요함.
 *           =>매개변수는 지역변수
 */
class Car {
	String color; // 객체화될때 메모리할당 - 인스턴스변수(객체변수)
	int number; // 인스턴스변수
	static int width = 200; // 객체화되기 전에도 메모리 할당받음.직접 값을 저장 - 클래스변수
	static int height = 120; // 클래스 변수
	// 멤버메서드 내에는 선언된 변수x - 지역변수 없음

	public String toString() {
		return color + ":" + number + "(" + width + "," + height + ")";
	}
}

public class CarEx1 {// ->args:매개변수 ( 지역변수 //지역변수가 매개변수 포함
	public static void main(String[] args) {
		System.out.println(Car.width + "," + Car.height);

		Car c1 = new Car(); // c1이 지역변수(참조변수이면서 지역변수)(메서드 내부에서 선언했기 때문에)
		c1.color = "White"; // 값
		c1.number = 1234;
		System.out.println("c1:" + c1.toString());
		Car c2 = new Car(); // 지역변수(메서드 내부에서 선언했기 때문에)
		c2.color = "Red";
		c2.number = 5678;
		System.out.println("c2:" + c2.toString());
//		c1.width=80;	//static변수를 직접 변경 -> c2도 영향받음
		Car.width = 80;
//		c1.height=50;
		Car.height = 50;
		System.out.println("c1:" + c1.toString());
		System.out.println("c2:" + c2.toString());

		int num = 0; // 지역변수는 초기화 필요
		System.out.println(num);
		int i;
		boolean b = true;
		if (b) {
			i = 10;
		} else
			i = 20;
		System.out.println(i);

		int j, k;
		j = 1;
		switch (j) {
		case 1:
			k = 10;
//			System.out.println(k);
		case 2:
			k = 20;
		default:
			k = 0;
		}
		System.out.println(k);
	}
}
