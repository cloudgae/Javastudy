package chap6;
/*
 * 클래스
 *   변수(필드) - 클래스변수
 *           - 인스턴스변수
 *   메서드    -클래스메서드
 *           -인스턴스메서드
 *           
 *   클래스멤버 : 클래스변수,클래스메서드      -  클래스명.멤버명
 *   인스턴스멤버 : 인스턴스변수,인스턴스메서드  -  참조변수명.멤버명
 *   
 *   클래스멤버에서 클래스멤버 호출 : 정상
 *   인스턴스멤버에서 인스턴스멤버 호출 : 정상
 *   클래스멤버에서 인스턴스멤버 호출 : 객체화 필요****
 *   인스턴스멤버에서 클래스멤버 호출 : 정상
 *   
 *   같은 멤버들 간에는 클래스명,참조변수명 생략 가능
 *   단 클래스멤버에서 인스턴스멤버 호출시 객체화가 필요하므로, 참조변수명 사용함
 */
public class MemberCall {
	static int cv1 = 10; //클래스멤버(static이 있음)
	static int cv2 = 20; //클래스멤버
	int iv1 = 100;       //인스턴스멤버
	int iv2 = iv1;       //인스턴스멤버
	int iv3 = cv1;       //인스턴스멤버 - 인스턴스멤버에 클래스멤버의 값이 들어가는 것
//	static int cv3 = iv1;//iv1은 객체화되기 전이므로 대입불가.cv3는 이미 준비되었는데 iv1은 객체화안됨
	                     //클래스멤버에서 인스턴스멤버 직접 호출 불가
	static int cv3 = new MemberCall().iv1;//객체화 필요. 이 객체는 iv1값만 사용하고 버림

	void method1() { //인스턴스멤버.에서는 클래스멤버 접근 가능
		System.out.println("cv1+cv2=" + (cv1 + cv2));
		System.out.println("iv1+iv2=" + (iv1 + iv2));
	}

	static void method2() { //클래스멤버. 클래스정보 로드되면 언제든지 호출 가능
		System.out.println("cv1+cv2=" + (cv1 + cv2));
//		System.out.println("iv1+iv2=" + (iv1 + iv2));//클래스멤버에서 인스턴스멤버 직접호출 불가
		//iv1,iv2는 아직 준비안됨-객체화필요
		MemberCall m = new MemberCall();
		System.out.println("iv1+iv2=" + (m.iv1 + m.iv2));
	}

	void method3() { //인스턴스멤버
		method1(); //인스턴스멤버 . 같은 멤버라서 참조변수 생략. 원래는 this.method1()
		method2(); //클래스멤버
	}

	static void method4() { //클래스멤버
//		method1(); //인스턴스멤버-객체화되기 전에는 클래스멤버에서 직접호출불가-객체화필요
		new MemberCall().method1();
		method2(); //클래스멤버
	}

	public static void main(String[] args) {
		//method1~method4 메서드 호출하기
		//1,3은 객체화 필요
		MemberCall m = new MemberCall();
		m.method1();
//		MemberCall.method2(); //같은 멤버라서 클래스명.멤버명 에서 클래스명은 생략. main과 method2,4가 같은 멤버이니까
		//main에서 직접호출할때는 static
		method2();
		m.method3();
		method4();

	}

}
