package chap5;
/*
 * arr배열의 행과 열의 합 출력하기
 */
public class Exam5 {

	public static void main(String[] args) {
		int[][] arr = {{1,2},{1,2,3,4,5},{10,20},{100}};//4행
		//가장 긴 열으 ㅣ길이 찾기
		int maxcol=0;
		for(int i=0;i<arr.length;i++) {
			if(maxcol<arr[i].length) {
				maxcol=arr[i].length;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+",");
			}
			System.out.println();
		}
		
//		int[] colsum=new int[arr[1].length];
		int[] colsum=new int[maxcol];
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
				colsum[j]+=arr[i][j];
				
			}
			System.out.println(i+"행의 합:"+sum);
		}
		for(int i=0;i<colsum.length;i++) {
			System.out.println(i+"열의 합:"+colsum[i]);
		}

	}

}
