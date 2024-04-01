package chap5;
/*Command 라인에서 파라미터값 전달하기
 * 
 * 자바프로그램 실행 순서
 * 1. 소스코딩 : ArrayEx6.java
 * 2. 컴파일 
 *    javac ArrayEx6.java
 *   =>ArrayEx6.class (바이트코드 생성)
 * 3. 실행(자바인터페이스)
 *    java ArrayEx6 홍길동 김삿갓(파라미터값. args를 통해 전달)-넣으면 args.length=>2됨
 *    자바인터페이스의 기능
 *    1) JVM환경 생성 => 클래스영역(메서드영역-실제클래스정보가로드되는영역,상수풀), 스택영역, 힙영역
 *    2) 바이트코드를 메모리에 로드, 검증 => 클래스 정보를 메모리에 로드한다.
 *    3) main메서드 실행 => command라인의 파라미터값을 문자열형배열로 생성해서 main에 전달
 *       args 배열 : command라인의 파라미터값을 저장
 */
public class ArrayEx6 {

	public static void main(String[] args) {
		if(args.length == 0) { //커맨드라인에서 객체 안들어왔어?
			System.out.println("command라인에 파라미터를 입력하세요");
			return; //메서드의 종료 - 메서드 이제 끝내.->메인이 끝나버림 => 실행하면 한줄나오고 종료됨
		}
		for(String s : args) {
			System.out.println(s);
		}
		for(int i=0;i<args.length;i++) {
			System.out.println("arr["+i+"]="+args[i]);
		}
	}

}
