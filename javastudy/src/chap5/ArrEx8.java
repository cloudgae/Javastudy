package chap5;

/*
 * 가변배열 : 다차원배열에서만 가능함
 *         첫번째 배열의 갯수는 반드시 지정해야함. 이후의 갯수는 지정하지 않아도 됨
 * 1차원배열-벡터
 * 2차원배열-매트릭스
 */
public class ArrEx8 {

	public static void main(String[] args) {
		int arr[][] = new int[3][];//3행만 만들어지는거야
		arr[0] = new int[] { 10, 20 };
		arr[1] = new int[] { 10, 20, 30, 40, 50 };
		arr[2] = new int[] { 10 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d]=%d\t", i, j, arr[i][j]);
			}
			System.out.println();
		}
	}

}
