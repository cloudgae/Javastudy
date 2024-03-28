package chap5;

import java.util.Scanner;

/*
 * 10진수를 16진수로 변환
 * 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
 * 0 1 2 3 4 5 6 7 8 9  A  B  C  D  E  F ->문자때문에 정수형 배열 사용x
 */
public class ArrayEx5 {

	public static void main(String[] args) {
		//toCharArray(): 문자열의 데이터를 char[]로 변환
		//             ->문자열String클래스  ->문자열값을 char형배열로 변환
		char[] data = "0123456789ABCDEF".toCharArray();
		//방16개를 가진 data라는 배열 생성
		char[] hex = new char[8];
		System.out.println("16진수로 변환할 10진수를 입력");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num;
		int index = 0;
		while (divnum > 0) {
			//divnum%16이 15가 나왔다?hex배열에 바로 대입할수가없음
			hex[index++] = data[divnum % 16];
			divnum /= 16;

		}
		System.out.print(num + "의 16진수:");
		for(int i=index-1;i>=0;i--) {
			System.out.print(hex[i]);
		
		}
		System.out.println();
		System.out.println("Integer 클래스를 이용한 16진수 변환");
		System.out.println(Integer.toHexString(num));
	}

}
