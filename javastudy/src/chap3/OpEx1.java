package chap3;
/*
 * 단항연산자 : 연산자의 피연산자가 한 개인 겨우
 * 1. 증감연산자 : ++, --
 * 	  ++ : 변수값을 1 증가
 *	  -- : 변수값을 1 감소
 */
public class OpEx1 {

	public static void main(String[] args) {
		int x=5, y=5;
		x++;//x값을 1증가 :6
		y--;//y값을 1감소 :4
		System.out.println("x=" + x + " y=" + y);
		
		++x;//x값을 1증가 :7
		--y;//y값을 1감소 :3
		System.out.println("x=" + x + " y=" + y);
		
		x=y=5; //x,y값 5ㅗ 초기화
		y = ++x; //x값 1 증가 :6, y값 대입 :6
		System.out.println("x=" + x + " y=" + y);
		
		x=y=5; //x,y값 5ㅗ 초기화
		y = x++;//1. x값을 y에 대입 2.x값 1증가 : 6,5
		System.out.println("x=" + x + " y=" + y);
		
		y = ++x; //x값 1 증가 :7, 2. y에 대입
		System.out.println("x=" + x + " y=" + y);
		
		x=y=5;
		System.out.println("x=" + x++);
		System.out.println("x=" + x);
		System.out.println("x=" + ++x);
		System.out.println("y=" + y--);
		System.out.println("y=" + y);
		System.out.println("y=" + --y);
	}

}
