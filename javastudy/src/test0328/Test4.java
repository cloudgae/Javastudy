package test0328;
/*
 * Student 클래스 구현하기
 * 멤버변수 : 학번(studno),국어(kor),영어(eng),수학(math),
 *          이름(name)
 * 구동클래스에 맞도록 메서드,생성자 구현하기 - toString()구현

* [결과]
      학번:1
      이름:홍길동
      국어:0
      영어:0
      수학:0
      총점:0
      평균:0.0
   =====================
      학번:2
      이름:김삿갓
      국어:80
      영어:90
      수학:70
      총점:240
      평균:80.0
   ===================== 
*/
class Student{
	int studno, kor, eng, math;
	String name;
	Student(String name, int studno){
		this.name=name;
		this.studno=studno;
	}
	Student(String name, int studno, int kor, int eng, int math){
		this.name=name;
		this.studno=studno;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	public String toString() {
		return "학번:"+studno+"\n이름:"+name+"\n국어:"+kor+"\n영어:"+eng+"\n수학:"+math
				+"\n총점:"+ (kor+eng+math)+"\n평균:"+ (kor+eng+math)/3f;
	}
}
public class Test4 {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동",1);
		Student s2 = new Student("김삿갓",2,80,90,70);
		System.out.println(s1);
		System.out.println("=====================");
		System.out.println(s2);
		System.out.println("=====================");

	}
}
