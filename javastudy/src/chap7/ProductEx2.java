package chap7;
/*다형성의사용방법
 * Buyer클래스
 *   멤버변수:money=500,point
 *         cart=new Product[5] : 구매상품 저장
 *         cnt:구매갯수
 *   멤버메서드
 *       void buy(Product p)
 *         1.p상품의 가격을 money에서 차감
 *         2.p상품의 포인트를 point로 증가
 *         3.cart에 p제품을 추가. cnt증가
 *         4.p제품의 이름 출력. => Tv 구입
 *       void summary()
 *         1.구매제품의 전체금액의 합계, 포인트 합계 출력
 *         2.잔액 출력
 *         3.전체 구매 물품이름 출력
 *         4.포인트 출력
 */
class Buyer{
	int money=500, point, cnt;
	Product[] cart = new Product[5];
	void buy(Product p) {
		money -= p.price;
		point += p.point;
		cart[cnt++] = p;
		System.out.println(p+" 구입");
	}
	void summary() {
		int totPrice=0, totPoint=0;
		for(int i=0;i<cnt;i++) {
			totPrice+=cart[i].price;
			totPoint+=cart[i].point;
		}
		System.out.println("구매제품 전체 가격:"+totPrice);
		System.out.println("구매제품 전체 포인트:"+totPoint);
		System.out.println("구매 후 잔액:"+money);
		System.out.print("구매물품 목록:");
		for(int i=0;i<cnt;i++) {
			System.out.print(cart[i]+",");
		}
		System.out.println();
		System.out.println("구매 후 포인트:"+point);
	}
}
public class ProductEx2 {

	public static void main(String[] args) {
		Tv t = new Tv();
		Computer c = new Computer();
		HandPhone h = new HandPhone();
		Buyer b = new Buyer();
		b.buy(t);
		b.buy(c);
		b.buy(h);
		b.summary();
	}

}
