package chap7;
/*
 * 상속 예제 : extends 예약어를 이용하여 구현
 * - 하위 클래스에 객체 생성시 상위 클래스이 객체를 먼저 생성함 .. 내안에부모잇다.자식클래스는무조건부모클래스를가지고잇다
 * - 단일 상속만 가능하다.
 * - 모든 클래스는 Object클래스를 상속받음.-toString()이 Object클래스의 멤버임
 *   =>모든 클래스의 객체는 Object 객체를 포함한다.
 *   =>모든 클래스의 객체는 Object 객체의 멤버 호출이 가능하다.
 */
class Phone{
	boolean power;
	int number;
	void power() {
		power=!power;
	}
	void send() {
		if(power) System.out.println("전화걸기");
	}
	void receive() {
		if(power) System.out.println("전화받기");
	}
}
//SmartPhone클래스는 Phone클래스의 하위(자손,자식,Child,Sub)클래스
//Phone클래스는 SmartPhone클래스의 상위(부모,조상,super,parent,base)클래스
class SmartPhone extends Phone{
	void setApp(String name) {
		System.out.println(name+"앱 설치");
	}
}
public class PhoneEx1 {
	
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.power=true;
		sp.send();
		sp.receive();
		sp.setApp("카카오");

	}

}
