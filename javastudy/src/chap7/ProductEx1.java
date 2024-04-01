package chap7;
/*
 * 다형성 예제
 * 
 * Product 클래스
 *  멤버변수: 가격(price),포인트(point)
 *  생성자: 가격을 입력받고, 가겨의 10%를 포인트로 설정
 */
class Product{
	int price, point;
	Product(int price){
		this.price=price;
		this.point=price/10;
	}
}
/*
 * Tv클래스:Product클래스의 하위클래스
 * 가격:100
 * toString: Tv
 */
class Tv extends Product{
	Tv(){
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}
/*
 * Computer클래스:Product클래스의 하위클래스
 * 가격:200
 * toString:Computer
 */
class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
/*
 * HandPhone클래스:Product클래스의 하위클래스
 * 가격:150
 * toString:SmartPhone
 */
class HandPhone extends Product{
	HandPhone(){
		super(150);
	}
	public String toString() {
		return "HandPhone";
	}
}
public class ProductEx1 {

	public static void main(String[] args) {
		//Tv,Computer,HandPhone 객체를 parr배열에 ㄱ각각 하나씩 저장
		Product[] parr=new Product[3];
		parr[0]=new Tv(); //Tv클래스의 객체를 Product타입으로 참조 - 자식클래스의 객체를 부모타입으로 참조
		parr[1]=new Computer();
		parr[2]=new HandPhone();
		//Product상품의 가격,포인트 출력하고, 가격과 포인트의 합계 출력
		int totPrice=0, totPoint=0;
		for(Product p : parr) {
			System.out.println(p.toString()+":"+p.price+","+p.point);
			totPrice+=p.price;
			totPoint+=p.point;	
		}
		System.out.println("전체상품가격:"+totPrice);
		System.out.println("전체상품포인트:"+totPoint);
	}

}
