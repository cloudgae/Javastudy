package chap5;
/*
 * 2차원 배열의 선언 생성 초기화
 */
public class ArrEx7 {

	public static void main(String[] args) {
		int[][] arr = {{10,20},{30,40},{50,60}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+",");
			}
			System.out.println();
		}
		//행과 열의 합계
		System.out.println("arr배열의 행과 열으 ㅣ합계 출력");
		//열의 합계 저장 배열 선언, 생성
		int[] colsum=new int[arr[0].length];
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j]; //행의 합.행 바뀔때마다 0으로 초기화됨
				colsum[j]+=arr[i][j];
			}
			System.out.println(i+"행의 합:"+sum);
			
		}
		for(int i=0;i<colsum.length;i++) {
			System.out.println(i+"열의 합:"+colsum[i]);
		}

	}

}
