package test0322;

import java.util.Arrays;

/*
1부터 100까지 임의의 수 10개를  배열에 저장하고, 정렬하여 출력하기
  1. 배열 선언, 생성.
  2. 임의의 수를 10개 배열에 저장
  3. 정렬
  4. 출력
*/

public class Test4 {

	public static void main(String[] args) {
		int[] num = new int[10];
		//중복숫자가 뽑히는 문제
		for(int i=0; i<num.length;i++) {
			num[i] = (int)(Math.random()*100+1);
		}
		Arrays.sort(num);
		for(int n : num) System.out.print(n+",");
	}

}
