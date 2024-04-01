package chap3;

import java.util.Scanner;

/*
 * 키보드에서 초를 입력받아 몇시간 몇분 몇초인지 출력
 * 1. Scanner 객체를 생성 : Scanner scan = new Scanner(System.in);
 * 2. 입력값을 second 변수에 저장 : int second = scan.nextInt();
 * 3. 시간 저장 : int h = second/3600
 * 4. 분 저장 : int m = (second%3600)/60
 * 5. 초 저장 : int s = second%60
 * 
 * [결과]
 * 초를 입력하세요
 * 3662
 * 1시간 1분 2초
 */
public class Exam2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //키보드로부터 입력받는 스트림클래스
		System.out.println("초를 입력하세요");
		int second = scan.nextInt(); //키보드에서 정수형 값을 입력받아 scan에 저장
		int h = second/3600;
		int m = second%3600/60;
		//int s = second%3600%60;
		int s = second%60;
		
		System.out.println(h + "시간 " + m + "분 " + s + "초");
		
	}

}
