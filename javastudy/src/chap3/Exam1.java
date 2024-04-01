package chap3;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		int x = 10;
		//++연산자를 사용하여 x=10의 결과가 나오도록 코딩
		//--연산자를 사용하여 x=10의 결과가 나오도록 코딩
		System.out.println("x=" + x++);
		System.out.println("x=" + --x);
		//화면에서 정수를 입력받아 x=입력받은 수로 나오도록 코딩하기
		Scanner scan = new Scanner(System.in); //키보드로부터 입력받는 스트림클래스
		System.out.println("정수를 입력하세요");
		x = scan.nextInt(); //키보드에서 정수형 값을 입력받아 x에 저장
		System.out.println("x=" + x++);
		System.out.println("x=" + --x);
	}

}
