package chap7;
/*
 * instanceof 연산자 : 단항연산자
 *  =>객체와 참조변수 사이의 관계 리턴
 * "객체와 참조변수"의 관계를 알려주는 연산자(Object는 항상 가능하므로, 이건 제외하고 다른건 형변환 전에 확인해보기)
 * 
 * 
 * 부모클래스의 객체를 자손클래스타입의 참조변수로 참조 불가 : ClassCastException예외발생
 * 
 */
public class InstanceOfEx1 {

	public static void main(String[] args) {
//		Parent2 p = new Parent2(); // 2,3번 출력
		Parent2 p = new Child2(); //1,2,3번 출력
//		Child2 c = (Child2)p;
//		System.out.println(p.x);
//		System.out.println(c.x);
		if(p instanceof Child2) {
			System.out.println("p참조변수가 참조하는 객체는 Child2객체임");
			Child2 c = (Child2)p;
		}
		if(p instanceof Parent2) { //이 객체가 Parent2타입이니?
			System.out.println("p참조변수가 참조하는 객체는 Parent2객체임");
			Parent2 p2 = p; //그렇다면 Parent2 타입으로 참조하렴
		}
		if(p instanceof Object) {
			System.out.println("p참조변수가 참조하는 객체는 Object객체임");
			Object o = p;
		}
	}

}
