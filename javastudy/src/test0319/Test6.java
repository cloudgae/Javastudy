package test0319;

import java.util.Scanner;

//  반지름을 입력받아 원의 둘레와 면적을 소숫점이하 2자리로 출력하기
public class Test6 {
	public static void main(String[] args) {
		double pi = 3.141592;
		System.out.println("반지름을 입력");
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		System.out.println("원의 둘레 : " + 2*(int)(pi*100)/100.0*r);
		System.out.println("원의 넓이 : " + (int)(pi*100)/100.0*r*r);
	}
}
