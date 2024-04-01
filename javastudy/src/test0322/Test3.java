package test0322;
/*
 * 10진수를 2,8,10,16 진수로 변경하기
 * [결과]
10진수 값을 입력하세요
16

16의 2진수 :10000
16의 8진수 :20
16의 10진수 :16
16의 16진수 :10

*/

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("10진수 값을 입력하세요");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		
		System.out.println(num+"의 2진수 : "+ Integer.toBinaryString(num));
		System.out.println(num+"의 8진수 : "+ Integer.toOctalString(num));
		System.out.println(num+"의 10진수 : "+ num);
		System.out.println(num+"의 16진수 : "+ Integer.toHexString(num));

	}

}
