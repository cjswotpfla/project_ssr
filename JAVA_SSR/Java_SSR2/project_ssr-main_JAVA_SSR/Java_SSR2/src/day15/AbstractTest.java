package day15;

public class AbstractTest {

	public static void main(String[] args) {
		//클래스 A의 객체 a를 생성
		A a = new A();
		//추상 클래스 B의 객체 b를 생성 
		//B b = new B();//오류 발생
		//추상 클래스 B를 상속받은 클래스 C의 객체 c를 생성
		C c = new C();
		//클래스 C를 이용하여 객체를 생성한 후 추상 클래스 B의 객체에 저장
		B b1 = new C();//클래스 타입변환(자동)
	}
}

class A{}
abstract class B{
	abstract void print();
}
class C extends B{
	@Override
	void print() {
	
	}
}
class D{}

/* 추상클래스 									인터페이스
 -객체멤버변수,객체상수 							-클래스상수,추상 메소드
 클래스변수,클래스 상수,							
 객체메소드,클래스메소드,
 추상메소드
*/