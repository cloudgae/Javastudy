package chap7;

import chap7.test.Modifier2;

public class ModifierEx2 {

	public static void main(String[] args) {
		Modifier2 m2 = new Modifier2();
		//같은클래스에 속한클래스아님
		//java.lang도 아님
		//=>반드시 import 필요
//		m2.v1=10;//private 멤버=> Modifier2클래스에서만접근
//		m2.v2=20; //default 멤버=>같은 패키지에 속한 
//		m2.v3=30;//protected 멤버. 상속관게도 ㅏㅇ님
		m2.v4=40;//public 멤버.
		m2.method(); 
	}

}
