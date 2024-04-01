package chap8;

/*
 * 매개변수로 사용되는 인터페이스
 */
class Unit {
	int hitPoint;
	final int MAX_HP;

	Unit(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	public AirUnit(int hp) {
		super(hp);
	}
}

interface Repairable {
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
	}

	public String toString() {
		return "Tank";
	}
}

class DropShip extends AirUnit implements Repairable {
	DropShip() {
		super(125);
	}

	public String toString() {
		return "DropShip";
	}
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
	}

	public String toString() {
		return "Marine";
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
	}

	void repair(Repairable r) {// Repairable인터페이스의 구현클래스만 매개변수로 전달. 각각 오버로딩하지않고
		//MAX_Hp값을Unit의 hitPoint값으로 저장
//		System.out.println(r + "의 수리 완료. hitPoint="+r.hitPoint);//Repairable타입엔 멤버가 없음
		Unit u = (Unit)r;
		u.hitPoint=u.MAX_HP;
		System.out.println(r + "의 수리 완료. hitPoint="+u.hitPoint);//Unit으로 형변환
	}

	public String toString() {
		return "SCV";
	}
}

public class InterfaceEx5 {

	public static void main(String[] args) {
		Unit[] uarr = new Unit[4];
		uarr[0] = new Tank();
		uarr[1] = new DropShip();
		uarr[2] = new Marine();
		uarr[3] = new SCV();
		SCV s = new SCV();
		for (Unit u : uarr) {
//			s.repair(u);//에러. repair의 매개변수타입은 Repairable. Unit타입으로는 들어갈 수 없다
			if (u instanceof Repairable) {
				s.repair((Repairable) u);// Marine에서 ClassCastException:마린은 Repairable형변환 불가
			    
			}
		}
	}
}
