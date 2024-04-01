package chap7;
/*
 * 추상클래스-다른클래스의 부모가되기위해
 * final 클래스 : 종단클래스. 변경불가클래스. 다른 클래스의 부모클래스가 될 수 없다. 확장불가. 날 다른용도로이용하지마.상속받지마.
 * final 의미 : 변경불가
 * 예)String, Math 클래스가 final클래스임.
 * 내가 가장 하위클래스야.
 */
//class MyString extends String{
//	
//}
final class Final{//다른 클래스의 부모클래스가 안됨. 
	
}
//class FinalSub extends Final{//Final 클래스가 final(종단)클래스임
//	
//}
public class FinalClassEx1 {

	public static void main(String[] args) {
		Final f = new Final();//final클래스도 객체화 가능 - 변경을 못한다는거지 객체화는가능
		
	}

}
