package chap8;
/*
 * 인터페이스 
 *  1. 멤버 : 상수,추상메서드,default메서드, static메서드
 *  2. 접근제한자는 public임
 *  3. 객체화 불가 => 구현클래스(인터페이스를 구현)의 객체화로 객체화
 *  4. 클래스와 인터페이스는 구현으로 표현함 => implements 예약어 사용
 *     => 다중 구현 가능
 *  5. 인터페이스 간에 상속이 가능함 => 다중 상속 가능함
 *  6. 참조자료형임.
 *  
 * 인터페이스 멤버
 *   상수 : [public static final] int NUM=100;
 *   추상메서드 : [public abstract] int method(int a);
 *   jdk8이후에 추가된 멤버 : 구현부 존재 가능
 *   default 메서드 : default int method(..){  }=>해당객체의 인스턴스멤버가됨
 *   static 메서드 : static in method(..){  }=>클래스멤버
 */
interface Printerable{
	int INK = 100; // public final static 예약어 생략//인터페이스 내에서는 무조건 상수가 되므로 final생략
    void print();// public abstract예약어 생략//인터페이스 내의 메서드는 원래 추상메서드이기때문에 abstract생략 
                 //=>구현클래스에서 반드시 오버라이딩 해야 함
}
interface Scannerable{
	void scan();
}
interface Faxable{
	String FAX_NO = "02-1111-2222";
	void send(String no);
	void receive(String no);
}
//다중 구현클래스
class Complexer implements Printerable, Scannerable, Faxable{
	int ink;
	Complexer(){
		ink = INK;
	}
	@Override
	public void print() {
		System.out.println("프린트 출력합니다. 남은 잉크량:" + --ink);
	}
	@Override
	public void scan() {
		System.out.println("이미지를 스캔합니다.");
	}
	@Override
	public void send(String no) {
		System.out.println(FAX_NO+"에서 "+no+"로 FAX를 보냅니다.");
	}
	@Override
	public void receive(String no) {
		System.out.println(no+"에서 "+FAX_NO+"로 FAX를 받았습니다.");
	}
}
public class InterfaceEx1 {

	public static void main(String[] args) {
		Complexer com = new Complexer();
//		Faxable.FAX_NO="02-222-3333";//상수라서 변경 불가
//		Printerable.INK=200;//상수변경불가
		System.out.println("Faxable.FAX_NO="+Faxable.FAX_NO);//static상수
		System.out.println("Printerable.INK="+Printerable.INK);//static상수 바로 사용가능
		System.out.println("Complexer.FAX_NO="+Complexer.FAX_NO);//구현클래스의멤버이기도함.
		System.out.println("Complexer.INK="+Complexer.INK);
		
		com.print();
		com.scan();
		com.send("02-2222-3333");
		com.receive("02-2222-3333");
		if(com instanceof Printerable) {
			System.out.println("com객체는 Printerable형으로 형변환 가능함.");
			Printerable p = com;//형변환연산자 생략. 부모클래스가 더 큰 자료형. 구현클래스에서 인터페이스로 참조될때도 생략
//			Printerable p = (Printerable)com; //자동형변환이됨
			p.print();
//			p.scan();//Printerabl타입의 멤버가 아니라 오류
//			p.send("02-2222-3333");
//			p.receive("02-2222-3333");
//			System.out.println("남은 잉크량:"+p.ink);
		}
		if(com instanceof Scannerable) {
			System.out.println("com객체는 Scannerable형으로 형변환 가능함");
			Scannerable s = com;
			s.scan();
//			System.out.println("남은 잉크량:"+s.ink);
		}
		if(com instanceof Faxable) {
			System.out.println("com객체는 Faxable형으로 형변환 가능함");
			Faxable f = com;
			f.send("02-2222-3333");
			f.receive("02-2222-3333");
			System.out.println("남은 잉크량:"+com.ink);//ink는 Com의 멤버죠
//			System.out.println("남은 잉크량:"+f.ink);//ink는 faxable의 멤버가 아님
		}
	}

}
