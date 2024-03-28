package test0326;
/*
[결과]
 46
 47  37
 48  38  29
 49  39  30  22
 50  40  31  23  16
 51  41  32  24  17  11
 52  42  33  25  18  12   7
 53  43  34  26  19  13   8   4
 54  44  35  27  20  14   9   5   2
 55  45  36  28  21  15  10   6   3   1
 
 1.가변 배열 선언 int arr[][] = new int[10][]
 2.각행의 1차원 배열 객체 생성 
 =====================
 3.배열의 내부에 숫자 채우기
 4.결과 출력
 =====================
 
 10행10열에1 10행9열에 3 ...
 
 숫자  i  j    i는 j부터 9까지 j 는 9부터 0까지
 1    9  9
 2    8  8
 3    9  8
 4    7  7
 5    8  7
 6    9  7 
 7    6  6
 8    7  6
 9    8  6
 10   9  6
*/
public class Test2 {
	
	public static void main(String[] args) {
		int arr[][]=new int[10][]; //10행 
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = new int [i + 1]; //1차원 배열의 요소의 갯수 설정
		}
		
		int data = 0; //배열에 채워질 숫자값
		
		for(int j=arr.length-1;j>=0;j--) {
			for(int i=j;i<arr.length;i++) {
				arr[i][j]=++data;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.printf("%3d",arr[i][j]);
				
			}
			System.out.println();
		}
		
		//============15행짜리
		
		

	}
	
	
}
