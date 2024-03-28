package test0322;
/*
 * 숫자 섞으란뜻 -로또
 */

import java.util.Arrays;

/*
 * 1부터 9까지의 숫자 중 중복되지 않는  숫자 3개를 선택하고, 정렬하여 출력하기.
 * 
 * 1. 1 ~ 9 저장한 배열 생성.
 * 2. 선택 숫자를 저장할 배열 선언. 3개 값
 * 3. 1 ~ 9 배열을 섞기.
 * 4. 섞인 배열에서 3개의 숫자를 선택된 배열에 저장
 * 5. 선택된 배열을 정렬하여 출력
 */

public class Test6 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int select[] = new int[3];

		// 섞기
		//천번섞는거야
		for (int i = 0; i <= 1000; i++) {
			int f = (int) (Math.random() * arr.length); // 1~9
			// 3
			int t = (int) (Math.random() * arr.length); // 
			// 두 수를 바꾸는 작업
			// swap알고리즘
			int tmp = arr[f]; // tmp=balls[40], tmp:41
			arr[f] = arr[t]; // balls[40]=balls[3], balls[40]:4
			arr[t] = tmp; // balls[3]=tmp; balls[3]:41
		}
		
		for(int i=0;i<select.length;i++) {
			select[i]=arr[i];
		}
		
		Arrays.sort(select);
		
		for(int s: select)System.out.print(s+",");

	}

}
