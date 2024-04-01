package chap6;
/*
 * 
 */
class Car3{
	String color;
	int number;
	int sno;
	static int width=200;
	static int height=120;
	static int cnt;
	Car3(String c, int n){
		color=c;
		number=n;
		sno=++cnt;
	}
	Car3(String c){
		number=1000;//입력없을시 기본으로 1000번이 되도록
		color=c;
		sno=++cnt;
	}
	Car3(int n){
		number=n;
		color="White";//기본값으로 만들어줌
		sno=++cnt;
	}
public String toString() {
	return sno+"번 자동차:"+ color+","+number+"("+width+","+height+")";
}
}
public class CarEx3 {

	public static void main(String[] args) {
		Car3 c1=new Car3("White",1234);
		System.out.println(c1);
		Car3 c2=new Car3("Black");
		System.out.println(c2);
		Car3 c3=new Car3(2000);
		System.out.println(c3);

	}

}
