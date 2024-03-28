package test0322;
/*
command line에서 숫자로 이루어진 문자를 두개 받아서 두수의 공약수를 구하시오
     java Test8 10 20
     args[0], args[1]

   [결과]
   10과 20 의 공약수 : 1,2,5,10,
 */
public class Test8 {

	public static void main(String[] args) {
		// 파라미터값없을때
		if (args.length == 0) { // 커맨드라인에서 객체 안들어왔어?
			System.out.println("command라인에 파라미터를 입력하세요");
			return; // 메서드의 종료 - 메서드 이제 끝내.->메인이 끝나버림 => 실행하면 한줄나오고 종료됨
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.print(num1+"와 "+num2+"의 공약수 : " );
		
		//num1의 약수
		int min = num1;
		if(num1 < num2) {
			min=num1;
		}
		else {
			min=num2;
		}
		for(int i=1;i<min+1;i++) {
			if(num1%i == 0 && num2%i == 0) {
				System.out.print(i+",");
			}
		}
	}

}
