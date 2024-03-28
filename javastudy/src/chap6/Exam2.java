package chap6;

/*
 * Rectangle3클래스
 * 멤버변수 : width,height,sno,cnt(생성번호를위한static변수)
 * 생성자 : 구동클래스에 맞도록 구현
 * 멤버메서드 : area() : 넓이 값 리턴
 *           length() : 둘레값
 *           isSquare():정사각형여부
 *           toString():사각형정보출력
 */
class Rectangle3 {
	int width, height, sno;
	static int cnt;

	// 생성자에서 대입해줘서 편함
	Rectangle3(int w, int h) {
		width = w;
		height = h;
		sno = ++cnt;
	}

	int area() {
		return width * height;
	}

	int length() {
		return (width + height) * 2;
	}

	boolean isSquare() {
		return width == height;
	}

	public String toString() {
		return sno + "번사각형=>(" + width + "," + height + "),넓이:" + area() + ",둘레:" + length() + ","
				+ (isSquare() ? "정사각형" : "직사각형") + ",생성된 사각형 갯수:" + cnt;
	}

}

public class Exam2 {
//메모리할당은 new가. 생성자는 메모리 할당 하지 x
	public static void main(String[] args) {
		Rectangle3 r = new Rectangle3(10, 20);
		System.out.println(r);
		Rectangle3 r2 = new Rectangle3(20, 20);
		System.out.println(r2);

	}

}
