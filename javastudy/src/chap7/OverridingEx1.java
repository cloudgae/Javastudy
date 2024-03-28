package chap7;
/*
 * 오버라이딩 예제
 * 메서드의 다형성:오버로딩
 * 오버라이딩 : 메서드의 재정의
 *    상속관계에서 나타남. '메서드의 재정의'
 *    - 부모클래스의 메서드를 자손클래스에서 재정의함
 *    - 부모클래스의 메서드와 선언부가 동일해야 함(매개변수 달라지면 오버로딩)
 *      [접근제어자] 리턴타입 메서드명(매개변수목록) 예외처리 => 선언부
 *      {        }                             =>구현부
 *      단, 접근제어자의 경우 넓은 범위는 가능하다
 *      단, 예외처리의 경우 좁은 범위로 가능하다
 */
/*
 * 상속? 재사용?
 * =========================
 * 보통예금계좌
 * 인터넷계좌
 * ==========================
 * 자동차   물탱크
 * 소방차:둘중에 뭘 상속받아야??
 * 소방차 is a 자동차  -->상속
 * 소방차 is a 물탱크 --> (X)
 * 소방차 has a 물탱크 -->멤버로 접근
 * ===========================
 * class 소방차 extends 자동차{
 *     물탱크 w = new 물탱크();
 * }
 * ===========================
 * 상속 : is a 관계
 *      인터넷계좌 is a 보통예금계좌?? 라면 상속
 *      사람 is a 동물??
 */
class Bike{
	int wheel;
	Bike(int wheel){
		this.wheel=wheel;
	}
	String drive() {
		return "페달을 밟는다";
	}
	String stop() {
		return "브레이크를 잡는다";
	}
}
class EvBike extends Bike{
	boolean power;
	EvBike(){
		super(2);
	}
	void power() {
		power=!power;
	}
	@Override  //=>오버라이딩 정상 여부 판단 어노테이션
	String drive() {
		return "출발버튼을 누른다";
	}

}
public class OverridingEx1 {

	public static void main(String[] args) {
		EvBike ev=new EvBike();
		System.out.println(ev.drive());
		System.out.println(ev.stop());
		
		Bike b = new Bike(2);
		System.out.println(b.drive());
		System.out.println(b.stop());
	}

}
