package chap8;

//인터페이스간의 상속은 다중 상속이 가능함
interface Complexerable extends Printerable, Scannerable, Faxable {
//상속받은 3가지의 인터페이스 안의 멤버가 모두 Complexerable에서 접근가능
}

class Complexer2 implements Complexerable/*,Printerable*/ {
	int ink;

	Complexer2() {
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
		System.out.println(FAX_NO + "에서 " + no + "로 FAX를 보냅니다.");
	}

	@Override
	public void receive(String no) {
		System.out.println(no + "에서 " + FAX_NO + "로 FAX를 받았습니다.");
	}
}

public class InterfaceEx2 {

	public static void main(String[] args) {
		System.out.println("기본잉크량"+Printerable.INK);
		System.out.println("기본잉크량"+Complexerable.INK);
		System.out.println("기본잉크량"+Complexer.INK);
		System.out.println("기본잉크량"+Complexer2.INK);
		//실제로 INK는 Printerable에만 있음
		System.out.println("FAX번호:"+Faxable.FAX_NO);
		System.out.println("FAX번호:"+Complexerable.FAX_NO);
		System.out.println("FAX번호:"+Complexer.FAX_NO);
		System.out.println("FAX번호:"+Complexer2.FAX_NO);
		//실제로 FAX_NO는 Faxable에만 있음
		//부모꺼에 있는걸 내것처럼 사용 가능
		
		Complexer2 com = new Complexer2();
		if(com instanceof Complexerable) {
			System.out.println("com객체는 Compexerable형으로 형변환 가능");
			Complexerable c = com;
			c.print();
			c.scan();
			c.send("02-2222-3333");
			c.receive("02-2222-3333");
			System.out.println(c.FAX_NO);
//			System.out.println(c.ink);//ink는 Complexer2의 멤버임.Complexerable의 멤버가 아님
			System.out.println(com.ink);
		}
	}

}
