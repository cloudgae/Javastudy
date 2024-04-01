package chap5;

import java.util.Scanner;

/*
 * 10진수를 입력받아 8진수로 변환
 * 8로나눈 나머지 저장->역순으로 읽어내면 됨
 * 몫이 0이될때까지
 * 
 * 이 알고리즘은 16진수는 사용 불가능
 */
public class Exam2 {

	public static void main(String[] args) {
		int[] octal = new int[32];
		System.out.println("8진수로 변환할 10진수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num;
		int index = 0;
		// divnum이 0이되면서 while문을 빠져나오기 바로 직전 반복문을 수행할 때
		// index값이 증가했으므로 for문에선 index-1부터 시작
		// 0부터 읽는것은 의미없으니까
		while (divnum > 0) {
			octal[index++] = divnum % 8;
			divnum /= 8;
		}
		System.out.print(num + "의 8진수:");
		// index-1에서 시작하는거..
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(octal[i]);
		}
		System.out.println();
		System.out.println("2진수변환" + Integer.toBinaryString(num));
		System.out.println("8진수변환" + Integer.toOctalString(num));
	}

}
