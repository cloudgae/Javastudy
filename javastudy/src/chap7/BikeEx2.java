package chap7;

/*
 * 다형성 예제
 * 1. 자손클래스의 객체를 부모클래스형의 참조변수로 참조 가능함
 * 2. 부모클래스타입의 참조변수로 자손클래스의 객체 참조시 부모타입의 멤버들만 접근 가능함
 * 3. 오버라이딩된 메서드는 부모타입의 참조변수로 호출 가능함. 최종 오버라이딩된 메서드가 호출됨 - (메서드는 객체에 의존함)
 * 4. 모든 클래스의 객체는 Object 객체를 포함한다. 
 *    => 모든 클래스의 객체는 Object타입으로 참조가 가능함
 * 5. 모든 클래스의 참조변수 타입으로 Object 멤버를 호출가능함
 */
class Bike2 {
	int wheel;

	Bike2(int wheel) {
		this.wheel = wheel;
	}

	void drive() {
		System.out.println("페달을 밟는다");
	}

	void stop() {
		System.out.println("브레이크를 잡는다");
	}
}

class EvBike2 extends Bike2 {
	boolean power;

	EvBike2() {
		super(2);
	}

	void power() {
		power = !power;
	}
	@Override
	void drive() {
		System.out.println("출발버튼을 누른다");
	}
}

public class BikeEx2 {
	public static void main(String[] args) {
		//객체화된 객체는 ev하나
		//Object객체부터 생성-Bike2객체 생성(wheel,생성자,메서드2개)-EvBike2객체 생성(power,생성자,오버라이딩한drive())
		EvBike2 ev=new EvBike2(); // ㄴ전체 이 객체를 ev가 참조
		Bike2 b=null; //객체는 없고 참조변수만 존재하는 상태
		ev.power();
		ev.drive();
		
		//1. 자손클래스의 객체를 부모클래스형의 참조변수로 참조 가능함
		
		b=ev; //형변환이 일어남. 다형성은 참조변수의 형변환. ev에 있는 값을 b에 . b도 ev가 참조하는 객체를 참조함
		//똑같은 객체를 하나는 EvBike2타입, 하나는 Bike2타입으로 참조(자식객체안에 부모객체가 존재하니까 부모타입의 참조변수로 자식객체 참조 가능)
//		b=(Bike2)ev; // (Bike2) 형변환 연산자 생략 가능 => 자동형변환:작은자료형에서 큰자료형으로 갈 때.
		//ev는 자손. b는 부모. 부모를 더 큰 자료형으로 봄. 부모클래스의 자료형이 더 크다.
		
		//3. 오버라이딩된 메서드는 부모타입의 참조변수로 호출 가능함. 최종 오버라이딩된 메서드가 호출됨 - (메서드는 객체에 의존함)
		
		b.drive(); //객체에 맞춰서 최종 오버라이딩된 메서드가 호출됨
		
		//2. 부모클래스타입의 참조변수로 자손클래스의 객체 참조시 부모타입의 멤버들만 접근 가능함
		
		//b타입으로 power호출하면?
//		b.power(); //에러 => Bike타입 참조변수로 참조하기 때문에 부모가 가진 멤버만큼만 사용 가능
		//객체 자체가 변한 건 아니지만 Bike타입으로 참조하면 Bike만 됨
		//b.drive()호출가능한이유 : drive도 b의 멤버이긴 하나, 오버라이딩된 메서드를 호출한 것
		//==>자식객체는 부모에 있는 모든 메서드에 접근 가능하지만,
		//부모객체는 자식에게만 있는 멤버에는 접근 불가
		
		//4. 모든 클래스의 객체는 Object 객체를 포함한다.
		
		Object o = b; 
//		o.power();//오류 : power는 Object의 멤버가 아님
//		o.drive();//오류 : drive도 Object의 멤버가 아님
//		o.stop();//오류 : Object의 멤버가 아님
		
		//5. 모든 클래스의 참조변수 타입으로 Object 멤버를 호출가능함
		
		System.out.println(ev.toString());
		System.out.println(b.toString());
		System.out.println(o.toString());
	}
}
