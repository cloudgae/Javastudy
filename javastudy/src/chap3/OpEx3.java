package chap3;
/*
 * 이항 연산자 : 산술연산자
 *  +,-,*,/
 *  % : 나머지 => 나머지 결과의 부호는 피제수의 부호를 따른다
 */
public class OpEx3 {

	public static void main(String[] args) {
		int x = 10, y = 8;
		double d = x/y;
		//x/y의 값 1이 double로 형변환되기 때문에 1.0이 나옴 - 둘 중 하나를 double로 바꾸면 1.25
		//이미 잘려져 나간 소수점 이하는 double로 형변환해도 다시 살릴 수 없음
		System.out.println(d); //1.0
		System.out.println("10.0/8 = " + (10.0/8)); //1.25
		//10.0은 double 8은 int => 결과는 더 큰 자료형인 double형
		System.out.println("10/8 = " + (10/8)); //1
		System.out.println("-10/8 = " + (-10/8)); //-1
		System.out.println("10/-8 = " + (10/-8)); //-1
		System.out.println("-10/-8 = " + (-10/-8)); //1
		
		System.out.println("10%8 = " + (10%8)); //2
		System.out.println("-10%8 = " + (-10%8)); //-2
		System.out.println("10%-8 = " + (10%-8)); //2
		System.out.println("-10%-8 = " + (-10%-8)); //-2
		
		//나눗셈과 나머지연산 부호가 다름
		//나머지연산은 분자의 부호 따름 
	}

}
