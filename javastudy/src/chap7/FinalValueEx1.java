package chap7;
/*
 * final : 변경불가의 의미
 * final 변수 : 변경불가 변수. 상수(자바에서는 const안쓰고 final씀)
 *             상수값으 이름규칙 : snack방식 _(언더바)사용
 */
class FinalValue{
	final int NUM;
	static final int MAX;//static final은 같이 사용 가능. abstract는 불가.
	// 클래스변수의 초기화를담당하는거:static초기화블럭
	static {
		MAX=(int)(Math.random()*100);
	}//명시적초기화하지않으면 클래스변수의 경우 static초기화블럭에서 한번은 초기화
	FinalValue(int num){ //생성자에서 초기화->생성자는 객체와 관련있음. 객체별로 다른 상수값 설정 가능
		NUM=num;  //명시적 초기화가 되지않은경우 생성자에서 한번은 초기화 가능
		
	}
}
public class FinalValueEx1 {

	public static void main(String[] args) {
		final int NUM = 100;//상수:변경불가 변수
//		NUM=200; //변경불가
		final int MAX; //초기화하지않으면 한번은 초기화 가능
		MAX=200; //한번은 초기화 가능
//		MAX=300; //두번은 초기화 불가
		FinalValue fv1 = new FinalValue(10);
		FinalValue fv2 = new FinalValue(20);
		System.out.println(fv1.NUM);//10
		System.out.println(fv2.NUM);//20
//		fv1.NUM=100; //초기화된경우 변경불가
//		fv2.NUM=200;
		final int[] arr = {10,20,30,40,50};
		//배열의값 변경 몬하나??
		for(int a : arr) {
			System.out.print(a+",");
		}
		System.out.println();
		arr[0]=100;
		for(int a : arr) {
			System.out.print(a+",");
		}
		System.out.println();
		//상수인데 값이 바뀌네
		//final배열의 상수값이 바뀔수없는게 아니라, 새로운 배열 객체 생성이 불가한 것
		//arr참조변수에 새로운 객체 참조 불가함================
//		arr=new int[] {100,200,300}; //새로운 객체를 생성.참조값2000이라고 가정한다면 원래 arr이 참조하던 주소값1000은 바뀔수없음
		//다른객체를 참조할수없다는 것
		//참조변수가 상수지. 배열객체가 상수인 것이 아니다.  arr자체가 상수지. arr배열 객체 각각은 상수가 아님
		//arr이 참조하는 값이 상수인거.
	}

}
