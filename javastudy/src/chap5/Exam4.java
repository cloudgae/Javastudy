package chap5;
/*
 * command라인에서 숫자들을 입력받아 숫자들의 자리수의 합 출력하기
 * java Exam4 123 456 789
 * [결과]
 * 123 456 789의 자리수 합 : 45
 *         j
 *      i  012
 * args[0]:123
 * args[1]:456
 * args[2]:789
 * 
 * 
 */
public class Exam4 {

	public static void main(String[] args) {
		//파라미터값없을때
		if(args.length == 0) { //커맨드라인에서 객체 안들어왔어?
			System.out.println("command라인에 파라미터를 입력하세요");
			return; //메서드의 종료 - 메서드 이제 끝내.->메인이 끝나버림 => 실행하면 한줄나오고 종료됨
		}
		
		int sum=0; 
		
		//args.length : 배열값 . 배열에 있는 length
		for(int i=0;i<args.length;i++) {
			System.out.print(args[i]+" ");
			//args[i].length : 문자열.의 길이  '123'문자열의 length를 말함
			for(int j=0;j<args[i].length();j++) {
				sum += args[i].charAt(j)-'0'; //순수숫자값 합계
			}
		}
		System.out.println("의 자리수 합 : "+ sum);
		
		//----------------------------------
		sum=0;
		for(int i=0;i<args.length;i++) {
			//args[i].length : 문자열.의 길이  '123'문자열의 length를 말함
			for(int j=0;j<args[i].length();j++) {
				sum += args[i].charAt(j)-'0'; //순수숫자값 합계
				System.out.print(args[i].charAt(j) 
						+ ((i==args.length-1) && j==args.length-1?"=":"+"));
			}
		}
		System.out.println(sum);
		//각 args[i] 요소 출력
		for(int i=0;i<args.length;i++) {
			System.out.println("arr["+i+"]="+args[i]);		
		}
	}
}
