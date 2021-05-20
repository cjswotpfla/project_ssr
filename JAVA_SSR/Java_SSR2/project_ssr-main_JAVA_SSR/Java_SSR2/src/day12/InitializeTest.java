package day12;

public class InitializeTest {//초기화 순서를 배우는 예제

	public static void main(String[] args) {
		TestA ta = new TestA();
		System.out.println(ta.getNum());
		System.out.println(TestA.getRes());
	}
}
/* 객체 변수 초기화 순서
 * 1. 변수 선언시 기본값으로 초기화
 * 	  - num는 0으로 초기화
 * 2. 명시적 초기화 
 * 	  - num는 1로 초기화
 * 3. 초기화 블록
 *    - num는 3으로 초기화
 * 4. 생성자 초기화
 * 	  - num는 2로 초기화 
 * -기본값이 아닌 값들은 생성자에서 초기화 하자 
 * 클래스변수
 * 1. 변수 선언시 기본값으로 초기화
 *	  - res를 0으로 초기화
 * 2. 명시적 초기화
 *    - res를 10으로 초기화
 * 3. 초기화 블록
 * */
class TestA{
	private int num=1;//명시적 초기화(객체 변수)
	private static int res = 10;//명시적 초기화(클래스 변수)
	{
		num=3; //초기화 블록 : 객체 변수
	}
	static {
		res=20;//초기화 블록 : 클래스 변수
	}
	public TestA() {
		num=2;//생성자 초기화
	}
	public int getNum() {
		return num;
	}
	public static int getRes() {
		return res;
	}
}