package test0327;
/*
2. Coin 클래스와 구동 클래스 구현하기
  Coin 클래스
   멤버변수 : int side (앞면:0, 뒷면:1), sno(동전번호), 
            cnt(동전번호 생성을위한 클래스변수)
   멤버메서드 : void flip()
                Math.random() 메서드를 사용하여 side를 결정.

  구동클래스
    Coin 클래스의 객체를 10개 생성하기.
    객체생성시, 동전번호를 생성하고, flip() 메서드를 이용하여 각각의 동전이 앞면인지 뒷면인지
    여부를 출력하기
10개의 동전 ㄷㅏ flip된 상태
flip이후의 갯수 총합
  [결과]
1번 동전 : 앞면
2번 동전 : 앞면
3번 동전 : 뒷면
4번 동전 : 앞면
5번 동전 : 뒷면
6번 동전 : 뒷면
7번 동전 : 뒷면
8번 동전 : 뒷면
9번 동전 : 뒷면
10번 동전 : 뒷면
전체 앞면 동전의 갯수 :3
전체 뒷면 동전의 갯수 :7
 */

class Coin{
	int side, sno;
	static int cnt;
	void flip() {
		side = (int)(Math.random()*2);
	}
	public String toString() {
		return sno + "번 동전 : " + (side==0?"앞면":"뒷면");
	}
	Coin(){
		sno = ++cnt;
	}
}
public class Test2 {
	public static void main(String[] args) {
		Coin[] carr = new Coin[10]; //참조변수 10개인 배열
		int front=0;
		int back=0;
		
		for(int i=0;i<carr.length;i++) {
			carr[i] = new Coin(); //코인 객체를 각각 10개 생성
			carr[i].flip();
			if(carr[i].side == 0) {
				front++;
			}
			else {
				back++;
			}
		}
		for(Coin c : carr) {
			System.out.println(c);
		}
		System.out.println("전체 앞면 동전의 갯수 :" + front);
		System.out.println("전체 뒷면 동전의 갯수 :" + back);

		
	}
}
