package chap6;
/*생성자는 인스턴스메서드
 * this 예약어
 * 
 * this() 생성자 : 클래스 내부의 생성자에서 다른 생성자 호출시 사용되는 예약어(생성자오버로딩이가능해서되는거)
 *               생성자의 첫줄에 구현해야함.
 * this 참조변수 : 자기참조변수
 *  - 현재 객체의 참조값을 저장함.
 *  - 인스턴스 메서드에(객체화되어야 호출가능한 메서드)서만 사용이 가능함 => 인스턴스 메서드 내부에 지역변수로 선언됨.
 *  - 지역변수와 멤버변수(참조된객체의변수)의 같은 이름을 가진 경우 구분시 사용함 
 */
class Car4{
	String color; //객체에 있는 멤버변수
	int number;
	int sno;
	static int width=200; //static 클래스 영역에 . 하지만 인스턴스변수와 같은 이름은 쓸 수 없음.
	static int height=120;
	static int cnt;
	Car4(String color, int number){ //여기 color는 지역변수(스택영역)
		this.color=color; //this->멤버변수의미. 해당객체의 값을 가지고 있음
		this.number=number;
		sno=++cnt;
		System.out.println("(String c, int n) 생성자 호출");
	}
	Car4(String color){
		this(color,1000); // Car4(String c, int n) 생성자 호출
		System.out.println("(String c) 생성자 호출");
		//this()생성자가 끝나기 전엔 다른 어떤 구문도 쓸 수 없음

	}
	Car4(int number){
		this("White",number);// Car4(String c, int n) 생성자 호출
		System.out.println("(int n) 생성자 호출");

	}
	public String toString() { //인스턴스메서드임-static없음 : 안에 지역변수없어서 자동으로 멤버변수로 가져오지만 this참조변수사용해도됨
		return sno+"번 자동차:"+ this.color+","+this.number+"("+Car4.width+","+height+")";
		//                    this.width보단 클래스변수기때문에 클래스명을 써주는것이좋음
	}
}
public class ThisEx1 {

	public static void main(String[] args) {
		Car4 c1=new Car4("White",1234);
		System.out.println(c1);
		Car4 c2=new Car4("Black");
		System.out.println(c2);
		Car4 c3=new Car4(2000);
		System.out.println(c3);


	}

}
