package chap5;

/*
 * str문자열 내에 각 소문자의 개수를 출력
 * 1. 소문자의 개수만 조회
 * 2. 소문자갯수가 1이상인 데이터만 출력
 * 3. 갯수만큼 * 출력하기
 * [결과]
 * a:4개=>****
 * b:3개=>***
 * d:3개=>***
 * j
 * 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
 * a b c d e f g h i j k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
 * 
 */
public class Exam3 {

	public static void main(String[] args) {
		String str = "aabbccdzzz";
		int[] cnt = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				cnt[ch - 'a']++; // ch가 a일때 'a'를 빼면 코드값 상으로 0이 됨. 0,1,2,..순으로 해당 첨자에 누적
			}
		}
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] > 0) {
				System.out.print((char) ('a' + i) + ":" + cnt[i] + "개=>");
				for(int j=0;j<cnt[i];j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
//		char[] data = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//		int[] cnt = new int[26];
//		
//		String str = "abb123cccdddda";
//		char[] num = str.toCharArray();
//		int sum=0;
//		
//		System.out.println(str);
//		// 문자열 내 소문자 개수 계산 및 각 소문자의 개수 카운트
//		for(int i=0;i<num.length;i++) {
//			if(num[i] >= 'a' && num[i] <= 'z') {
//				sum++;
//			}
//			for(int j=0;j<data.length;j++) {
//				if(num[i] == data[j]) {
//					cnt[j]++;
//				}
//			}
//		}	
//
//		System.out.println("소문자개수:"+sum);
//		
//		// 소문자가 하나 이상인 경우 각 소문자와 그 개수 출력
//		for(int i=0;i<data.length;i++) {
//			if(cnt[i]!=0) {
//				System.out.println(data[i]+":"+cnt[i]+"개");
//			}
//		}	
	}
}
