package test0401;

/*
1. 인터페이스 내에 메서드를 적합하게 선언한 형태 2개를 고르시오. 
=>답 : 1, 2

(1) void methoda(); 
(2) public double methoda();
(3) public final double methoda();//final->변경불가메서드->오버라이딩불가->추상메서드는반드시오버라이딩되어야
(4) static void methoda(double d1);//static있으면 구현부 필요
(5) protected void methoda(double d1);//protected->인터페이스 내 모든 메서드는 public

2. 2번째 줄과 동일한 의미를 갖는 문장 3개를 고르시오.
=>답 : 1, 2, 3

1. public interface Foo { 
2. int k = 4;
3. }

(1) final int k = 4;      (2) public int k = 4;
(3) static int k = 4;   (4) abstract int k = 4;
(5) volatile int k = 4; (6) protected int k = 4;


4. 다음 소스를 보고 보기 중 16라인에 추가되면 
java.lang.ClassCastException을 발생시키는 문장을 선택하시오.
=>답 : 2

//Beta형의 x는 Alpha를 상속받음
//Delta는 Beta의 하위클래스지만 Foo타입으로 형변환 불가
//Beta형의 x는 Alpha를 상속받고, Alpha도 Foo인터페이스를 상속받으므로 형변환 가능
//Beta형의 x를 Alpha->Beta로 형변환하여 Beta타입의 b에 대입
//FOO
 * |
 * Alpha
 * |
 * Beta-main에서 객체화-A,F,Object타입으로 참조가능
 * |
 * Delta
 * 
10. interface Foo {}
11. class Alpha implements Foo { } 
12. class Beta extends Alpha {} 
13. class Delta extends Beta { 
14. public static void main( String[] args) { 
15. Beta x = new Beta(); 
16. // insert code here 
17. } 
18. } 
(1). Alpha a = x; 
(2). Foo f= (Delta)x; 
(3). Foo f= (Alpha)x; 
(4). Beta b = (Beta)(Alpha)x; 

5. 다음 A 인터페이스를 상속 받아서 새로운 B 인터페이스를 생성하고
자 한다. 다음 보기 중 올바른 문장을 선택하시오. 
=>답 : 2(X) 답은 1
인터페이스간 상속이기때문에 extends
클래스와 인터페이스 간 implements

1. public interface A { 
2.    String DEFAULT_GREETING = “Hello World”; 
3.    public void method1(); 
4. } 
(1). public interface B extends A { } 
(2). public interface B implements A {} 
(3). public interface B instanceOf A {} 
(4). public interface B inheritsFrom A { }
 
*/

