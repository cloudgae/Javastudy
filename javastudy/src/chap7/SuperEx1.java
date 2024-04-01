package chap7;
/*
 * super 예약어 
 * super() 생성자:
 *    자손클래스에서 부모 클래스의 생성자 호출시 사용
 *    자손클래스의 생성자 첫줄에 구현해야 함
 *    부모클래스의 생성자 중 매개변수가 없는 생성자가 있다면 생략 가능 : super()
 *    부모클래스의 생성자 중 매개변수가 없는 생성자가 없다면 생략 불가 : super(....)
 * super 참조변수:
 *    부모클래스의 객체를 참조하는 참조변수
 *    인스턴스 메서드에서만 사용가능함
 *    
 * 자기참조변수.부모참조변수 : 무조건 생성자 첫 줄에 구현해야
 */
class Parent{
	int x=10;
	Parent(int x){
		System.out.println("Parent클래스의 생성자");
		this.x=x;
	}
	Parent(){
		System.out.println("Parent클래스의 생성자");
	}
}
class Child extends Parent{
	int x=20;
	Child(){
		super(100);
		System.out.println("Child클래스의 생성자");
	}
	void method() {
		int x=30;//local var
		System.out.println("x="+x);//30 // 윗줄생략하면 20 
		System.out.println("this.x="+this.x);//20 //멤버필드x지우면 100
		System.out.println("super.x="+super.x);//100
	}
}
public class SuperEx1 {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.x); //자식꺼가져옴// 멤버필드x지우면 100 ->부모의 x밖에없음
		c.method();
	}

}
