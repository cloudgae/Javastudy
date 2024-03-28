package chap5;

import java.util.Arrays;

/*
 * 
 * Lotto번호 생성하기
 */
public class ArrayEx3 {

	public static void main(String[] args) {
		int[] balls = new int[45];
		int[] lotto = new int[6];
		for(int i=0; i<balls.length;i++) {
			balls[i] = i+1; //1~45값
		}
		for(int b:balls) System.out.print(b+",");
		System.out.println();

		//balls 섞기-천번섞는거야
		for(int i=0; i<=1000; i++) {
			//40
			int f = (int)(Math.random()*balls.length); //0~44
			//3
			int t = (int)(Math.random()*balls.length); //0~44 balls의 인덱스의 허용범위까지를 임의로 가져오는것
			//두 수를 바꾸는 작업
			//swap알고리즘
			int tmp = balls[f]; //tmp=balls[40], tmp:41
			balls[f]=balls[t]; //balls[40]=balls[3], balls[40]:4
			balls[t]=tmp; //balls[3]=tmp; balls[3]:41
		}
		for(int b:balls) System.out.print(b+",");
		System.out.println();
		
		//lotto번호저장하기:balls의 값 앞에서 6개
		//앞에서6개를 당첨번호로 저장 
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=balls[i];
		}
		for(int b:lotto) System.out.print(b+",");
		System.out.println();
		//정렬하기 -- 큰 수를 계속 뒤로 보내는 것-이걸 정렬다될때까지 반복
		//한번하면-가장큰수가 맨뒤로 이동
		//2회차 : 두번째로 큰 수가 끝에서 2번째로 이동
		//
		//i번지와 i+1번지 값 비교 i번지값이 i+1번지값이 크면 스왑
		//버블정렬 - 두개씩 비교
		for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<lotto.length-1-i;j++) {
				if(lotto[j] > lotto[j+1]) {
					int tmp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1]=tmp;					
				}
			}
			System.out.print(i+":");
			for(int b:lotto) System.out.print(b+",");
			System.out.println();
		}
		
		//Arrays클래스를 이용한 정렬
		//Arrays : 배열 객체의 다양한 기능을 제공해주는 클래스
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=balls[i];
		}//정렬 이전으로 lotto배열 변경
		for(int b:lotto) System.out.print(b+",");
		System.out.println();
		//배열 클래스의 메소드 활용--------------------------------
		Arrays.sort(lotto);
		for(int b:lotto) System.out.print(b+",");
		System.out.println();
		

	}

}
