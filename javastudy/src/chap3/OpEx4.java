package chap3;
/*
 * 관계(비교) 연산자 => 결과가 무조건 boolean(true/false)
 *   == : 등가
 *   >  : 크다
 *   ....
 *논리연산자 - 피연산자 모두 boolean
 *   &&(and) : 두 값이 모두 true인 경우만 true, 그 외 false
 *   		   앞 구문이 false인 경우 결과는 무조건 false => 뒷 구문 실행 x
 *   ||(or)  : 두 값이 모두 false인 경우만 false, 그 외 true
 *   		   앞 구문이 true인 경우 결과는 무조건 true => 뒷 구문 실행 x
 *   ^(xor)
 */
public class OpEx4 {

	public static void main(String[] args) {
		int x=1, y = 1;
		//관계연산자
		System.out.println(x + " == " + y + " : " + (x==y));
		System.out.println(x + " != " + y + " : " + (x!=y));
		System.out.println(x + " >= " + y + " : " + (x>=y));
		System.out.println(x + " > " + y + " : " + (x>y));
		System.out.println(x + " <= " + y + " : " + (x<=y));
		System.out.println(x + " < " + y + " : " + (x<y));
		//논리연산자
		System.out.println("x == 1 && y == 1 : " + (x == 1 && y == 1));
		System.out.println("x == 1 && y != 1 : " + (x == 1 && y != 1));
		System.out.println("x != 1 && y == 1 : " + (x != 1 && y == 1));
		System.out.println("x != 1 && y != 1 : " + (x != 1 && y != 1));
		System.out.println("x == 1 || y == 1 : " + (x == 1 || y == 1));
		System.out.println("x == 1 || y != 1 : " + (x == 1 || y != 1));
		System.out.println("x != 1 || y == 1 : " + (x != 1 || y == 1));
		System.out.println("x != 1 || y != 1 : " + (x != 1 || y != 1));
		//null : 값이 없음. 객체가 없다.
		String str = null; // null이면 .equals()불가능
		if(str==null || str.equals("")) {
			System.out.println("str변수에 값이 없음");
			}
		if(str.equals("") || str==null) {
			System.out.println("str변수에 값이 없음");
			}
	}

}
