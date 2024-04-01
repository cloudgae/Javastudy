package test0322;
/*
Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기
    java Test7 10
    int num = Integer.parseInt(args[0]);
  [결과]
  10의 약수 : 1,2,5,10,
*/

public class Test7 {

	public static void main(String[] args) {
		// 파라미터값없을때
		if (args.length == 0) { // 커맨드라인에서 객체 안들어왔어?
			System.out.println("command라인에 파라미터를 입력하세요");
			return; // 메서드의 종료 - 메서드 이제 끝내.->메인이 끝나버림 => 실행하면 한줄나오고 종료됨
		}
		
		int num = Integer.parseInt(args[0]);
		System.out.print(args[0]+"의 약수 : ");
		
		for(int i=1;i<num+1;i++) {
			if(num%i == 0) {
				System.out.print(i+",");
			}
		}

	}

}
