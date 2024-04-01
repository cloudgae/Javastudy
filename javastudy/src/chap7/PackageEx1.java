package chap7;

//import java.util.Date;
import java.util.*; // jajva.util 패키지 내의 클래스들은 패키지명 생략 가능

/*
 * package예제
 * package
 *  - 클래스, 인터페이스들의 모입=>주로 기능이 비슷한 클래스, 인터페이스들의 모임
 *  - 클래스 명은 패키지를 포함한다.
 *  - package의 설정은 파일 처음에 한번만 구현
 *  => 같은 파일에 존재하는 클래스는 같ㅇ느 패키지에 속한 클래스임.
 *  
 *  import예약어
 *   - 클래스명의 패키지명을 생략하루 수 있도록 설정
 *   
 *   클래스으 ㅣ패키지명을 생략할 수 있느 경우
 *   1. 같은 패키지에 속한 클래스 사용시
 *   2. java.lang 패키지의 클래스 사용시
 *   3. import구문에서 선언된 클래스 사용시
 *     =>패키지명.클래스명=>클래스명의 패키지명 생략 가능
 *     =>패키지명.*     =>패키지에 속한 모든 클래스의 패키지명 생략 가능
 */
public class PackageEx1 {

	public static void main(String[] args) {
		//java.lang.String=> java.lang 에 속한 클래스들은 패키지명 생략 가능
//		java.util.Date now = new java.util.Date();
		Date now = new Date(); //import구문 설정으로 패키지명 생략
		A a = new A(); //같은 패키지에 속한 클래스는 패키지명 생략 가능
		Scanner scan = new Scanner(System.in);
		Pack1 p = new Pack1();
		p.method();
//		p.methodp();//methodp의 접근제한자 private이므로 접근 불가
		p.method2();
	}

}
class A{}
class Pack1{
	private void methodp() {//private접근제어자 : Pack1에서만 호출 가능
		System.out.println("chp1.Pack1.methodp 메서드");
	}
	void method() {//default접근제어자
		System.out.println("chp1.Pack1.method 메서드");
	}
	void method2() {
		methodp();
	}
}