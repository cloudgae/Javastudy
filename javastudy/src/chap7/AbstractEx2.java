package chap7;
/*
 * 추상클래스간의 상속
 */
abstract class Abs1{
	int a=10;
	abstract int getA();
}
abstract class Abs2 extends Abs1{ //둘다 추상클래스-추상클래스를 상속받아도 오버라이딩필수아님
	int b=20;
	abstract int getB();
}
class Normal extends Abs2{

	@Override
	int getB() {
		// TODO Auto-generated method stub
		return b;
	}

	@Override
	int getA() {
		// TODO Auto-generated method stub
		return a;
	}
	
}
public class AbstractEx2 {

	public static void main(String[] args) {
		Normal n = new Normal();
		//부모의 멤버는 내꺼라서 가능
		System.out.println(n.a);
		System.out.println(n.getA());
		System.out.println(n.b);
		System.out.println(n.getB());
		System.out.println("Abs2 타입으로 형변환");
		Abs2 a2 = n; //부모타입의 참조변수 <= 자손타입의 참조변수
//		Abs2 a2 = (Abs2)n; ->자동형변환가능해서 생략가능 : 부모꺼는 내꺼!!
		System.out.println(a2.a);
		System.out.println(a2.getA());//Abs1의 멤버이지만 상속받았기때문에 가능
		System.out.println(a2.b);
		System.out.println(a2.getB());
		Abs1 a1 = a2;
		System.out.println(a1.a);
		System.out.println(a1.getA());//Abs1의 멤버이지만 상속받았기때문에 가능
		//b, getB()는 Abs1의 멤버가 아닌 Abs2의 멤버
		//Abs1타입으로는 a,getA()만 참조가능
//		System.out.println(a1.b);
//		System.out.println(a1.getB());
		System.out.println("Object타입으로 형변환");
		Object o = a1;
		//Object타입에서 접근 불가. Object에는 없는 멤버
//		System.out.println(o.a);
//		System.out.println(o.getA());
//		System.out.println(o.b);
//		System.out.println(o.getB());
		//형변환하면 가능
		System.out.println(((Abs1)o).a);
		System.out.println(((Abs1)o).getA());
		System.out.println(((Abs2)o).b);
		System.out.println(((Abs2)o).getB());
	}

}
