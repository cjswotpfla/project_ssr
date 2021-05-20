package day2;

import java.util.Scanner;

public class Test2_6 {

	public static void main(String[] args) {
		/* 성적을 입력 받아 입력받은 성적을 출력하는 코드를 작성하세요,
		 * A : 90이상 100이하
		 * B : 80이상 90미만
		 * C : 70이상 80미만
		 * D : 60이상 70미만
		 * F : 0이상 60 미만
		 * 잘못된 성적 : 0미만, 100초과 */
		System.out.print("성적을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int sco = scan.nextInt();
		if(90 <= sco && sco <=100) {
			System.out.println(sco + "점 : A");
		} else if(80 <= sco && sco < 90) {
			System.out.println(sco + "점 : B");
		} else if(70 <= sco && sco <= 80) {
			System.out.println(sco + "점 : C");
		} else if(60 <= sco && sco < 70) {
			System.out.println(sco + "점 : D");
		} else if(0 <= sco && sco < 60) {
			System.out.println(sco + "점 : F");
		} else {
			System.out.println(sco + "점은 잘못된 성적");
		}
 		
	
		scan.close();

	}

}
