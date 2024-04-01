package chap6;

/*
 * 재귀함수 : Recursive call => 함수내에서 자신의 함수를 호출하는 함수 - 스택이 있어서 가능
 * 클래스를만드는 과정이 추상화과정-을 통해 클래스가 생성됨
 * 
 */
public class FactorialEx1 {

	public static void main(String[] args) {
//		System.out.println("4!=" + factorial(4));
		System.out.println("4!=" + new FactorialEx1().factorial(4));

	}
	//클래스메서드(static)여야 함
	//클래스멤버에서 인스턴스멤버 직접호출 불가.호출하려면 객체화가필요(인스턴스멤버:객체화시준비완료)
	//static없으면 객체화될때 이 메서드가 준비됨
	//인스턴스멤버에서 클래스멤버는 바로 호출 가능
//	private static int factorial(int i) { //메서드에 static이 붙으면 어떤의미?:
//		return (i == 1 ? 1 : factorial(i - 1) * i);
//	}
	private  int factorial(int i) { //메서드에 static이 붙으면 어떤의미?:
		return (i == 1 ? 1 : factorial(i - 1) * i);
	}

}
