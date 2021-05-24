package day1;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		/* 콘솔창에서 입력받아 변수에 저장하는 예제 */
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println("입력받은 값 : "+num);
		
		System.out.print("실수를 입력하세요 : ");
		double dnum = scan.nextDouble();
		System.out.println("입력받은 값 : " + dnum);
		
		System.out.print("문자를 입력하세요 : ");
		//nextLine() : 공백을 포함한 문자열을 가져옴
		char ch = scan.next().charAt(0);
		System.out.println("입력받은 값 : "+ch);
		
		System.out.print("문자열을 입력하세요 : ");
		//nextLine() : 공백을 포함한 문자열을 가져옴
		String str1 = scan.next();
		System.out.println("입력받은 값 : "+str1);
		
		scan.close();
				

	}

}
