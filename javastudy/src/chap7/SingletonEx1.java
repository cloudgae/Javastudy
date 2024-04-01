package chap7;
/*
 * 생성자의 접근 제어자를 private으로 설정 => 객체를 한개만 생성함
 */
class SingleObject{ //클래스를 보면 생성자가 뭐지?항상 봐야함-객체생성을 어떻게하는지 알수있음
	private static SingleObject obj = new SingleObject(); //static변수로 객체하나 생성하여 obj로 참조
	private SingleObject() {};//생성자
	int value=100;
	public static SingleObject getObject() {
		return obj;
	}
}
public class SingletonEx1 {

	public static void main(String[] args) {
//		SingleObject s = new SingleObject();//생성자의 접근제한자 private. 접근 불가
//		SingleObject.obj //접근제한자 private멤버. 접근 불가능
		SingleObject s1 = SingleObject.getObject(); //이렇게 하면 객체를 받아서 사용 가능
		SingleObject s2 = SingleObject.getObject(); //s1,s2가 같은 객체로 만들어졌음 - 객체를 한개만 만듦
		System.out.println("s1.value="+s1.value);
		System.out.println("s2.value="+s2.value);
		s1.value=200;
		System.out.println("s1.value="+s1.value);
		System.out.println("s2.value="+s2.value);
		SingleObject s3 = SingleObject.getObject();
		System.out.println("s3.value="+s3.value);
	}

}
