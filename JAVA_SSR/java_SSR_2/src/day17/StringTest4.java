package day17;

import java.util.Scanner;

public class StringTest4 {

	public static void main(String[] args) {
		System.out.println("제이름은 홍길동입니다.".replace("홍길동", "임꺽정"));
			/* 문자열C를 입력받고, 해당 단어에 문자열 A와 문자열 B를 입력받아
				 * 문자열C에 있는 문자열 A를 문자열 B로 바꾸는 코드를 작성하세요. */
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String c = scan.next();
		System.out.println("바꿀 문자열과 바꿀 내용을 입력하세요 .");
		String a = scan.next();
		String b = scan.next();
		if(c!=null&&c.indexOf(a)!=-1) {
			c.replace(a, b);
			System.out.println(c);
		}else {
			System.out.println("에러 ");
		}
		scan.close();
	}

}
