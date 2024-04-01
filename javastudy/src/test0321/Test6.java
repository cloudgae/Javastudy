package test0321;

import java.util.Scanner;

/*

삼각형의 높이를 홀수로 입력하세요
5            i    j
*****        0    01234     j:i ~ (h-i), i<=j
 ***         1    123
  *          2    2
 ***         3    123       j:0~i, h-i-1<=j : * 5-3-1=1 :1부터 시작하는구나
*****        4    01234                         5-7-1=0 :0부터 시작하는구나


 */
public class Test6 {

	public static void main(String[] args) {
		//홀수로입력안하면 계속 물어보도록
		Scanner scan = new Scanner(System.in);
	    int len = 0;
		while(true) { //언제 홀수를 입력해줄지 모르기때문에 무한루프
		   System.out.println("삼각형의 높이를 홀수로 입력하세요");
		   len = scan.nextInt();
		   if(len%2 ==0) {
			   System.out.println("홀수로 입력하세요");
		   }  else break; //홀수를입력해야 빠질 수 있음
		}
		//윗부분-역삼각형      <= : 꼭짓점까지 출력하겟다
		for (int i = 0; i <= len / 2; i++) {
			for (int j = 0; j < len - i; j++) {
				if (j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		//아래쪽 이등변삼각형-꼭짓점ㄴ
		// 5/2+1 => i=3,4두번만 처리
		for (int i = len / 2 + 1; i < len; i++) {
			//j의 끝점을 i에 맞추면 됨 12'3', 0123'4'
			for (int j = 0; j <= i; j++) {
				if (j >= len - i - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
