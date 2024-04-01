package chap7;
/*
 * 접근제한자(접근제어자)
 *  private < (default) < protected < public
 * 제한자(제어자)
 *  static, abstract, final
 *  
 *  [접근제어자][제어자] 리턴타입 메서드명(매개변수목록)
 */
class Modifier{
	private int v1=100;
	int v2=200;
	protected int v3=300;
	public int v4=400;
	public void method() {
		System.out.println("chap7.Modifier클래스의 메서드");
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		System.out.println("v3="+v3);
		System.out.println("v4="+v4);}
}
public class ModifierEx1 {
	
	public static void main(String[] args) {
		Modifier m = new Modifier();
//		m.v1 =10; // private멤버=>같은 클래스내에서마 접근 허용
		m.v2 =20; //default멤버 =>같은 패키지내에서만 접근 허용
		m.v3 =30; //protected 멤버=> 같은 패키지내, 상속관계 접근 허용
		m.v4 =40; //public멤버 => 모두 허용
		m.method();
	}

}
