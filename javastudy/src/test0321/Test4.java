package test0321;

import java.util.Scanner;

/*
 * [결과]
삼각형의 높이를 입력하세요
3
		9			
	8	7	6		
5	4	3	2	1	

높이
  3 : 5+3+1 =9
  5 : 9+7+5+3+1 = 25
 
*/
public class Test4 {

	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		//가장 큰 숫자
		int n = h*h;
		//밑바닥 2*h-1
		int b = 2*h-1;
		//중간위치값 처리 위한
		int m = b/2;
		
		
		int data = 0;//첫번째의 숫자값 저장
		for(int i= b;i>=1;i-=2) {
			data+=i;
		}
		
		
		
		for(int i=0; i<h;i++) {  //i=0
			for(int j=0; j<b; j++) { //j=0,1,2,3,4,5 //밑바닥만큼 앞뒤 공백으로 채우지x길이만큼만
				if(m-i <= j && j <=m+i) {
					//System.out.print(data-- + "\t");//증감연산자:먼저 화면에 출력하고, 그 다음에 차감
					System.out.printf("%5d",data--);
				}
				else {
//					System.out.print("\t");
					System.out.printf("%5c",' ');
				}
			}
			System.out.println();
		}

	}

}
