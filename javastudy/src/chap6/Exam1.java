package chap6;
/*
 * 1.직사각형(Rectangle)클래스 구현하기
 *  - 멤버필드 : 가로(width),세로(height)
 *  - 멤버메서드 : void area() => 넓이 출력 width*height
 *  - 멤버메서드 : void length() => 둘레 출력 (width+height)*2
 * 2. 구동클래스(Exam1)구현하기 => main 메서드를 가지고 있는 클래스
 *  - Rectangle클래스의 객체 생성하기 => r1참조변수로 참조하기
 *  - 가로(10),세로(5)고 값 초기화
 *  - r1 사각형의 넓이, 둘레 출력하기
 */

class Rectangle1 {
	int width;
	int height;
	void area() {
		System.out.println(width*height);
	}
	void length() {
		System.out.println((width+height)*2);
	}
}
public class Exam1 {

	public static void main(String[] args) {
		Rectangle1 r1 = new Rectangle1();
		r1.width=10;
		r1.height=5;
		r1.area();
		r1.length();
		
		Rectangle1 r2 = new Rectangle1();
		r2.width=10;
		r2.height=10;
		r2.area();
		r2.length();
	}

}
