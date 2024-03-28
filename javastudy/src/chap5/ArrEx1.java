package chap5;

/*
 * 
 */
public class ArrEx1 {
	public static void main(String[] args) {
		// 1.배열의 선언. 참조변수 선언
		int arr[]; // []은 자료형과 변수명 어디에 붙어도상관없음
		// 2.배열 객체의 생성
		arr = new int[5];// int형 방 5개 만들고, 기본값 0으로 초기화:new라는 연산자가 하는 일
		/*
		 * new 예약어 기능 1.객체 생성 : int값 5개를 저장할 수 있는 변수 할당. length 상수값 설정 2.기본값 초기화 숫자 : 0
		 * boolean : false 그 외 : null->값이 없다(모든 비트가 0으로 초기화됨)->이게 숫자면 숫자0으로 나타남 3.배열의
		 * 초기화. 인덱스로 접근. 인덱스는 0부터 시작
		 */
		arr[0] = 10;
		arr[1] = 20;
		// 4.배열값 조회
		// arr.length : 배열 값의 갯수 저장

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		int arr2[] = new int[3];
		arr2[0] = 100;
		arr2[1] = 200;

		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]=" + arr2[i]);
		}
		
		arr2=arr; //arr2에 변화생김
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]=" + arr2[i]);
		}                                              
		
		arr[3]=500;
		System.out.println("arr2 = arr[3]=600 이후=======");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]=" + arr2[i]);
		} 
		
		//개선된 for구문
		//인덱스 사용안됨:요소의 값만 조회
		//인덱스를 사용할 필요가 있는 경우 기존의 for문으로 구현해야함
		System.out.println("개선된 for구문으로 조회(forEach라고도 함)");
		for(int a: arr) {
			System.out.println(a);
		}
	}

}
