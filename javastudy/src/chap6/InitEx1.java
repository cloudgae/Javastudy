package chap6;
/*
 * 초기화 블럭 예제 - 메서드가 아님:이름이 없다.
 * static 초기화블럭
 *   기능 : 클래스 변수의 초기화 - 클래스변수를 초기화할수있는방법이 이거밖에없음.객체랑상관없이 여기서초기화한번만하는것이 계속 초기화시키는것보다 안전
 *   실행시점 : 클래스 정보 로드시 한 번 실행. main메서드 이전에 실행
 * 인스턴스 초기화블럭-객체생성할때마다 생성자보다 뭔가 하고 싶다. ..
 *   기능 : 인스턴스 변수의 초기화. 생성자와 기능이 겹침(주로 생성자에서 초기화)
 *   실행시점 : 객체화시마다 생성자 호출 전에 실행
 */

public class InitEx1 {
	static int cv=10;
	int iv;
	InitEx1(){
		System.out.println("5.생성자 호출됨");
	}
	//main보다 먼저 실행됨
	static { //static초기화블럭***************클래스변수를초기화할때사용
		cv=(int)(Math.random()*100);
		System.out.println("1.static초기화블럭 실행. cv="+cv);
		//처음에 클래스정보로드될때 한 번 실행하고 더 이상 실행되지 않음
	}
	//인스턴스 초기화블럭 - 생성자보다 먼저 실행(생성자와 상관없이 인스턴스변수값을 초기화하고싶을때)
	//객체 생성할때마다 호출됨
	{
		iv=(int)(Math.random()*100); // 생성자에서 처리해도 되기 때문에 인스턴스초기화블럭은 잘 사용x
		System.out.println("4.static초기화블럭 실행. iv="+iv);
	}
	public static void main(String[] args) {
		System.out.println("2.main메서드 시작");
		System.out.println("3.main메서드에서 init1 객체 생성 cv="+cv);
		InitEx1 init1 = new InitEx1(); // 인스턴스초기화블럭->생성자
		System.out.println("3.main메서드에서 init2 객체 생성 cv="+cv);
		InitEx1 init2 = new InitEx1();// 인스턴스초기화블럭->생성자
		System.out.println();
	}

}
