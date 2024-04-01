package test0322;

import java.util.Scanner;

/*
 * 대칭수
 * 정수값
 * 홀수짝수
 */
/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
 */

public class Test1 {

	public static void main(String[] args) {
		System.out.println("숫자입력");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		String numstr = Integer.toString(num);
		boolean isit = true;

		// 입력된 정수를 문자열로 받고
		// 문자열의 첨자끼리 비교하기 .charAt(i)
		// 첨자 0과 마지막 숫자가 다름->바로 대칭수 아님으로 판단
		// 문자열의 길이가 홀수일때 짝수일때-굳이고려x

		for (int i = 0; i < numstr.length() / 2; i++) {
			if (numstr.charAt(i) != numstr.charAt(numstr.length() - i - 1)) {
				isit = false;
//				break;
			}
		}

		if (isit) {
			System.out.println(num + ": 대칭수");

		} else {
			System.out.println(num + ": 대칭수 아님");
		}
	}

}
