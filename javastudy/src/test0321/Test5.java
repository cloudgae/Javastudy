package test0321;

import java.util.Scanner;

/*
삼각형의 높이를 입력하세요             h=3=i b=5=j   m=2
3          위치       j          i      *
*****      01234  2-2 ~2+2     0     i ~ (b-1) -i
 ***       123    2-1 ~2+1     1       
  *        2      2-0 ~2+0     2      
                  m-
 */
public class Test5 {

	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		//밑바닥 2*h-1 별의 개수
		int b = 2*h-1;
		//중간위치값
		int m = b/2;
		
		for(int i=0; i<h;i++) {  //i=h=3
			//j는무조건0부터시작 공백을 찍어줘야해서
			for(int j=0; j<b-i; j++) { //j=5,4,3,2,1 //밑바닥만큼 앞뒤 공백으로 채움
				if(j>=i) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
