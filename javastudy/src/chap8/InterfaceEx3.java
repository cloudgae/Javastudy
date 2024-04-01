package chap8;
/*
 * 단일상속의 보완에 사용되는 인터페이스
 */
abstract class Animal{
	String name;
	Animal(String name){
		this.name=name;
	}
	abstract void eat();
}
interface Flyable{
	void fly();
}

class Dove extends Animal implements Flyable{
	public Dove() {
		super("비둘기");
	}

	@Override
	public void fly() {
		System.out.println(name+"는 하늘을 날 수 있다.");
	}

	@Override
	void eat() {
		System.out.println(name+"는 벌레를 잡아먹는다.");
	}
}
class Monkey extends Animal{
	public Monkey() {
		super("원숭이");
	}

	@Override
	void eat() {
		System.out.println(name+"는 나무에서 열매를 따먹는다.");
	}
}
/*
 * 1. Animal타입의 참조변수로 두개를 배열로 설정하여 첫번째는 Dove객체, 두번째는 원숭이 객체를 저장함
 * [결과]
 * 비둘기는 벌레를 잡아먹는다 eat()
 * 비둘긴느 하늘을 날 수 있다. fly()
 * 원숭이는 나무에서 열매를 따먹는다 eat()
 */
public class InterfaceEx3 {

	public static void main(String[] args) {
		Animal[] arr = new Animal[2];
		arr[0]=new Dove();
		arr[1]=new Monkey();
//		arr[0].eat();
//		Dove d = new Dove();
//		d = (Dove)arr[0];
//		d.fly();
//		arr[1].eat();
		for(Animal a : arr) {
			a.eat();
//			a.fly();//오류
			if(a instanceof Flyable) { //이 조건이 있어야 알아서 Flyable변환
				Flyable f = (Flyable)a; //Monkey는 Flyable형변환 불가 
				//ClassCastException : 참조변수의 자료형으로 객체를 참조 불가한 경우
				f.fly();//Animal class와 Flyable은 관련없어서 명시적형변환 필요
			}
			
		}
	}

}
