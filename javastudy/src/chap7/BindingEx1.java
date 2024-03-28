package chap7;
/*
 * 부모클래스의 멤버와 자손클래스의 멤버가 "동일"한 경우
 *   멤버변수(필드) : 참조변수의 자료형을 따른다
 *   멤버메서드 : 객체의 자료형을 따른다.
 *             객체의 최종 오버라이딩된 메서드를 호출한다.
 *             웅제쉬어요!!!!
 */
class Parent2{
	int x=10;
	void method() {
		System.out.println("Parent2.method()");
	}
}
class Child2 extends Parent2{
	int x=20;
	void method() {
		super.method();//Parent2의 메서드 호출
		System.out.println("Child2.method()");
		System.out.println("x="+x); //객체를 따라감. 참조변수랑 상관없이 method가 호출되면 method를 쫓아감??
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}
public class BindingEx1 {

	public static void main(String[] args) {
		Child2 c=new Child2();
		c.method();
		System.out.println("c.x="+c.x);
		Parent2 p=c;
		p.method(); //Child2의 method가 호출됨-최종으로 오버라이딩된 메서드가 호출되므로
		System.out.println("p.x="+p.x); // 부모클래스에 있는 변수가 불러와짐. Child2타입의 멤버에는 접근불가
		//메서드와 변수가 다르게 작동함======================
		//변수는 오버라이딩되지 않았다.
		//멤버변수는 참조변수 타입을 따라간다.(부모,자손 간 같은 멤버일 때)******

	}

}
