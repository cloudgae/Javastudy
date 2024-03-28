package test0320;

import java.util.Scanner;

/*
1.   한개의 문자를 입력받아 ch 변수에 저장하고
     ch 문자가 
     대문자인 경우는 소문자로, 
     소문자인 경우는 대문자로 
     숫자인 경우는 20을 더한 값을  출력하기
     그외의 문자는 기타 문자 를 출력하세요 
     
[결과]
한개의 문자를 입력하세요
A : a

b : B

1 : 21

- :기타문자
*/
public class Test1 {
	public static void main(String[] args) {
		System.out.println("한 개의 문자 입력");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " : " + (char)(ch + 32));
			System.out.println(ch + " : " + (char)(ch + ' '));
		}
		else if(ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " : " + (char)(ch - 32));
			System.out.println(ch + " : " + (char)(ch - ' '));
		}
		else if(ch >= '0' && ch <= '9') {
			int num = (int)ch - 48;
			System.out.println(ch + " : " + (num + 20));
			System.out.println(ch + " : " + (ch - '0' + 20));
		}
		else {
			System.out.println(ch + " : 기타문자");
		}
	}
}