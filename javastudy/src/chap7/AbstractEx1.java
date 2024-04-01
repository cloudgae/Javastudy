package chap7;
/*
 * 추상클래스
 * 1.추상메서드를 멤버로 가질 수 있는 클래스 => abstract예약어 사용
 * 2.객체화 불가 -> 상속으로 자손클래스의 객체화를 통해 객체화가 가능(직접은 객체화안됨)
 * 3.그외 일반클래스와 동일(생성자,멤버변수,멤버메서드,초기화블럭,상속받기..)
 * 
 * 추상메서드
 * 1.메서드의 선언부만 존재함. 구현부{}가 없음. => abstract예약어 사용
 * 2.자손클래스에서 반드시 오버라이딩 필요.욀케처졸립지
 */
abstract class Shape{ // 추상클래스
	String type;
	Shape(String type){
		this.type=type;
	}
	abstract double area(); //추상메서드
	abstract double length();
	public String toString() {
		return type;
	}
}
class Circle extends Shape{
	int r;
	Circle(int r){
		super("원");
		this.r=r;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
	return r*r*Math.PI;					
	}
	@Override
	double length() {
		// TODO Auto-generated method stub
		return 2*r*Math.PI;
	}
	public String toString() {
		return super.toString()+",반지름="+r+",넓이="+area()+",둘레="+length();
	}
}
/*
 * Rectangle클래스 구현
 * Shape클래스의 하위클래스
 * 멤버변수:width,height
 * 생성자:멤버변수를입력받아초기화
 * 메서드:area,length
 */
class Rectangle extends Shape{
	int width, height;
	Rectangle(int width, int height){
		super("사각형");
		this.width=width;
		this.height=height;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return width*height;
	}
	@Override
	double length() {
		// TODO Auto-generated method stub
		return (width+height)*2;
	}
	public String toString() {
		return super.toString()+",가로="+width+",세로="+height+",넓이="+area()+",둘레="+length();
	}
}
public class AbstractEx1 {

	public static void main(String[] args) {
		// 추상클래스 객체화 불가
//		Shape s=new Shape("도형");
		Shape[] sarr=new Shape[2];
		sarr[0]=new Circle(10);
		sarr[1]=new Rectangle(10,10);
		//전체 도형으 ㅣ면적의 합, 둘레으 ㅣ합 출력
		double totarea=0, totlength=0;
//		for(int i=0;i<sarr.length;i++) {
//			System.out.println(sarr[i].area()+", "+sarr[i].length());
//			totarea += sarr[i].area();
//			totlength += sarr[i].length();
//		}
		for(Shape s : sarr) {
			totarea += s.area();
			totlength += s.length();
			System.out.println(s);//toString()구현해야함
		}
		System.out.println("전체면적:"+totarea+", 전체둘레:"+totlength);
		//각각의도형의 멤버변수 출력
		//사각형:가로=10,세로=10,면적=100.0,둘레=40.0
		//각 객체ㅡ를 Circle,Rectangle로 형변환
//		Circle c = (Circle)sarr[0];
//		Rectangle r = (Rectangle)sarr[1];
//		System.out.println(c.type+":반지름="+c.r+",면적="+c.area()+",둘레="+c.length());
//		System.out.println(r.type+":가로="+r.width+",세로="+r.height+",면적="+r.area()+",둘레="+r.length());
//		
		System.out.println("-------------------");
		for(Shape s :  sarr) {
			System.out.print(s.type+":");
			if(s instanceof Circle) { //s가 참조하고 있는 객체가 Circle객체라면, s는 Circle의 멤버인 r에 접근할수없으므로
				Circle c=(Circle)s; //Circle타입으로 형변환
				System.out.print("반지름="+c.r);
			}
			if(s instanceof Rectangle) {
				Rectangle r=(Rectangle)s;
				System.out.print("가로="+r.width+",세로="+r.height);
			}
			System.out.println(",넓이="+s.area()+",둘레="+s.length());
		}
	}

}
