package test0322;

import java.util.Scanner;

/*
1.  다음은 주어진 문자열(value)이 숫자인지를 판별하는  프로그램을 작성하시오.
  String 함수 charAt(i), length() 을 사용함.
  [결과]
숫자만 입력하세요
123
123는 숫자 입니다.
  
  [결과]
숫자만 입력하세요
123@12
123@12는 숫자가 아닙니다.
 */
public class Test2 {

	public static void main(String[] args) {
		System.out.println("숫자만 입력하세요");
		Scanner scan = new Scanner(System.in);

//		String str = scan.toString();
		String str = scan.next();
//		int num = scan.nextInt();
//		String str = Integer.toString(num);

		boolean isit = true;

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i)-'0' >= 0) && (str.charAt(i)-'0' <= 9)) {
				isit = true;
			} else {
				isit = false;
			}
		}
		if (isit) {
			System.out.println(str + "는 숫자입니다.");
		} else {
			System.out.println(str + "는 숫자가아닙니다.");
		}

	}

}
