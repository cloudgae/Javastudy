package test0320;
/*
 * 1부터 100까지의 숫자 중 2의 배수이거나, 3의 배수의 합을 구하기 
 */
public class Test5 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i <= 100) {
			if(i % 2 == 0 || i % 3 == 0) {
				sum += i;
//				System.out.println("i=" + i + "sum=" + sum);
			}
			i++;
		}
		System.out.println(sum);
		
		for(i=1;i<=100;i++) {
			if(i%2==0 || i%3==0) sum += i;
		}
		System.out.println(sum);
	}
}