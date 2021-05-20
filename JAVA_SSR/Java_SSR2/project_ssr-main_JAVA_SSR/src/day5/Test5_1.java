package day5;

public class Test5_1 {

	public static void main(String[] args) {
		/* while문을 이용하여 구구단 7단을 출력하는 코드를 작성하세요 */
		
		int i = 1, num = 7;
		while(i<=9) {
			System.out.println(num + " x " + i + " = " + (num*i));
			i+=1;
		}

	}

}
