package day3;

public class Switch {

	public static void main(String[] args) {
		// switch문을 이용한 홀짝 판별 예제
		int num = 5;
		switch(num % 2) {
		case 1 :
			System.out.println("홀수");;
			break;
		default :
			System.out.println("짝수");
		
		}

	}

}
