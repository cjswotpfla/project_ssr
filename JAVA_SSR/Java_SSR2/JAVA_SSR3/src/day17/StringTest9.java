package day17;

import java.util.Scanner;

public class StringTest9 {

	public static void main(String[] args) {
		/* 공백을 포함한 긴 문자열을 입력한 후 단어를 입력받아 해당 단어가 몇번 나오는지 확인하는 코드
		 * 예시
		 * 문장 입력 : Hello. Hi. HHHH. He. His
		 * 단어 입력 : H
		 * 횟수 : 8번 
		 * 문장 입력 : Hello. Hi. HHHH. He. His
		 * 단어 입력 : Hi
		 * 횟수 : 2번 */
		Scanner scan = new Scanner(System.in);
		System.out.print("문장 입력 : ");
		String str1 = scan.nextLine();
		System.out.print("단어 입력 : ");
		String str2 = scan.next();
		
		//반복문을 통해 해당 단어가 몇번 있는지 체크(indexOf() 이용)
		int count = 0;//단어의 갯수
		int index = 0;//해당 단어가 있는 시작 번지
		while(true) {
			index = str1.indexOf(str2);//문장에 해당 단어가 있는 위치를 찾음
			if(index==-1) {
				break;
			}
			count++;
			str1=str1.substring(index+1);
		}
		System.out.println(count+"번");
		scan.close();
	}
}
