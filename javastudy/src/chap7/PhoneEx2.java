package chap7;
/*----------<상속의 특징>---------
 * 자손클래스의 객체 생성시 부모 클래스의 객체 생성을 먼저 함
 * =>자손클래스의 생성자에서 부모 클래스의 생성자를 호출해야함.
 *** 부모클래스의 매개변수가 없는 생성자(기본생성자)가 없다면, 자손클래스의 생성자에서
 *   super(매개변수값) - super()에 매개변수 넣어서 직접 호출해야함
 *** 부모클래스의 매개변수가 없는 생성자(기본생성자)가 있다면, 자손클래스의 생성자에서
 *   super() 명령문을 생략할 수 있음
 */
class Phone2{
	boolean power;
	int number;
//	Phone2(){}
	Phone2(int number){
		this.number=number;
	}
}
class SmartPhone2 extends Phone2{ //기본생성자 제공시 오류 발생
	SmartPhone2(){//기본생성자의 틀
		//super클래스에 매개변수 없는 생성자가 없어서 기본생성자를 제공해줘도 오류
		//따라서 SmartPhone2는 무조건 생성자 구현해야함
//		super(); // 부모클래스의 생성자 호출
		super(1234); // 번호없이는 Phone객체생성안해줌. 
	}
	void setApp(String name) {
		System.out.println(name+"앱 설치함");
	}
}
public class PhoneEx2 {

	public static void main(String[] args) {
		SmartPhone2 sp = new SmartPhone2();
		System.out.println(sp.number);
		sp.power=true;

	}

}
