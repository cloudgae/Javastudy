package chap7;
/*
 * final : 변경불가의 의미
 * final 메서드 : 재정의 불가. 오버라이딩 불가 메서드
 * 
 */
class OrgMethod{
	void method() {
		System.out.println("FinalMethod의 method");
	}
}
class FinalMethod extends OrgMethod{
	final void method() {
		System.out.println("FinalMethod의 method");//
	}
	void method1() {
		System.out.println("FinalMethod의 method1");
	}
}
class FinalMethodSub extends FinalMethod{
//	void method() { //FinalMethod.method()가 final메서드이므로 오버라이딩(재정의)불가
//		System.out.println("FinalMethodSub의 method");
//	}//->주석처리하면 FinalMethod.method()호출됨
	void method1() {
		System.out.println("FinalMethodSub의 method1");
	}
}
public class FinalMethodEx1 {

	public static void main(String[] args) {
		FinalMethodSub f = new FinalMethodSub();
		f.method();
		f.method1();
	}

}
