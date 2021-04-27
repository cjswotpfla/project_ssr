package day2;

import java.util.Scanner;

public class Test2_1 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 성적을 입력받아 출력해보세요 
		 * 단, 성적은 0~100점 사이의 실수 */
		double dnum1, dnum2, dnum3;
		System.out.print("국어, 영어, 수학 성적을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		
		dnum1 = scan.nextDouble();
		dnum2 = scan.nextDouble();
		dnum3 = scan.nextDouble();
	
		System.out.println("국어 : " + dnum1 + "점");
		System.out.println("영어 : " + dnum2 + "점");
		System.out.println("수학 : " + dnum3 + "점"); 
		
		scan.close();
	}

}
