package day10;

import day10.Point;//같은 패키지 내에 있는 클래스 : 생략 가능

public class ClassEx3 {

	public static void main(String[] args) {
		//pt라는 객체를 선언 후 생성
		//객체 pt는 참조변수
		//일반변수 : 타입이 기본타입으로 된 변수
		//참조변수 : 타입이 기본타입이 아닌 변수
		Point pt1=null;
		Point pt2=new Point();
		//에러발생 : 객체가 생성되지 않은 상태에서 메소드를 호출했기 때문
		//pt1.print();
		pt2.print();
		pt2.move(4,5);
		pt2.print();
		Point pt3=new Point();
		pt3.print();
	}

}
