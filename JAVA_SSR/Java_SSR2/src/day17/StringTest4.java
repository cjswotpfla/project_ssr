package day17;

import java.util.Scanner;

public class StringTest4 {

	public static void main(String[] args) {
		System.out.println("안녕하세요. 제 이름은 홍길동입니다.".replace("홍길동", "임꺽정"));
		/* 문자열 C를 입력받고, 해당 단어에 문자열 A와 문자열 B를 입력받아
		 * 문자열 C에 있는 문자열 A를 문자열 B로 바꾸는 코드를 작성하세요.*/
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String c = scan.next();
		System.out.print("수정할 곳의 단어와 수정될 단어를 입력하세요 : ");
		String a = scan.next();
		String b = scan.next();
		if(c!=null && c.indexOf(a)!=-1) {
			c = c.replace(a, b);
			System.out.println("바뀐 단어 : " + c);
		}else {
			System.out.println("바꿀 수 없습니다.");
		}
		scan.close();

	}

}
