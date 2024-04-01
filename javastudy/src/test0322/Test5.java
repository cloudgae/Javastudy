package test0322;

import java.util.Scanner;

/*
 * 각동전5개->총액먼저알수잇음 아닌 경우 거르기
 * 
 */
/*
동전의 종류와 동전의 갯수 지정하여, 지정된 갯수만큼만 동전 변경하기
500,100,50,10,5,1원짜리 동전이 각각 5개씩 있다고 가정할때,
입력된 금액을 동전으로 바꿔주고, 남은 동전을 출력하기

[결과] 
금액을 입력하세요
36000
동전이 부족합니다.

[결과] 
금액을 입력하세요
3010
500원:5
100원:5
50원:0
10원:1
5원:0
1원:0
남은 동전 500원:0개
남은 동전 100원:0개
남은 동전 50원:5개
남은 동전 10원:4개
남은 동전 5원:5개
남은 동전 1원:5개
*/

public class Test5 {

	public static void main(String[] args) {
		// 총 가진 금액
		int money = 500 * 5 + 100 * 5 + 50 * 5 + 10 * 5 + 5 * 5 + 1 * 5;
		System.out.println("금액을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int out = scan.nextInt();
		// 남은동전
		// int r500 = 0, r100 = 0, r50 = 0, r10 = 0, r5 = 0, r1 = 0;
		/*
		 * i 0 1 2 3 4 5 500원 100원 50원 10원 5원 1원 5 5 5 5 5 5
		 */
		// 가진동전
		int arrm[] = { 5, 5, 5, 5, 5, 5 };
		int coin[] = { 500, 100, 50, 10, 5, 1 };

		if (out > money) {
			System.out.println("동전이 부족합니다.");
		} else {
			for (int i = 0; i < coin.length; i++) {
				// arrm[i] >= out/coin[i]
				// 만약 out/coin[i]가 5보다 크다면 필요한 동전은 5개로 출력하고
				// out-coin[i]*5 값을 out으로 변경
				if (out / coin[i] > 5) {
					System.out.println(coin[i] + "원:5");
					out -= coin[i] * 5;
					arrm[i] = 0;
				} else {
					System.out.println(coin[i] + "원:" + out / coin[i]);
					arrm[i] -= out/coin[i];
					out %= coin[i];
					
				}

//				arrm[i] -= out / coin[i]; // 바꿔주고 남은 동전의 갯수

			}

		}
		for (int i = 0; i < coin.length; i++) {
			System.out.println("남은 동전 " + coin[i] + "원:" + arrm[i]);
		}
	}

}
