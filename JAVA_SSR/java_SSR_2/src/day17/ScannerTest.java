package day17;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		/* next() 	  : 공백(엔터, 스페이스)을 만나기 전까지 문자열을 가져오는 메소드
		 * nextLine() : 처음 만나는 엔터 전 까지 문자열을 가져오는 메소드 
		 * */
		Scanner scan = new Scanner("1234 1234\n\n\n4567\n8910\n++++\n");
		while(scan.hasNext()) {//다음에 가져올 내용이 있는지 없는지 체크하는 메소드
			String str = scan.nextLine();
			if(str.length()!=0) {
			System.out.println(str);
			}
		}
		//String str = scan.next();
		/*String str = scan.nextLine();	//1234 1234 (\n)을 추출
		System.out.println(str);
		System.out.println("----");
		str = scan.nextLine();			//4567 (\n)을 추출
		System.out.println(str);		
		System.out.println("----");
		int num = scan.nextInt();		//8910을 추출
		System.out.println(num);		
		System.out.println("----");
		str=scan.nextLine();			//빈 공백(\n)을 추출
		System.out.println(str);
		System.out.println("----");*/
		scan.close();
	}

}
