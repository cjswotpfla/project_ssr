package day17;

import java.util.Scanner;

public class StringTest3 {

	public static void main(String[] args) {
		//System.out.println("abcdef".indexOf("bc"));
		//System.out.println("abcdef".indexOf("ad"));
		/* 두 단어 단어A와 단어B를 입력받고 단어A에 단어B가 있는지 없는지 확인하는 코드 */
		Scanner scan = new Scanner(System.in);
		System.out.print("두 단어 A,B를 입력하세요 : ");
		String str1 = scan.next();
		String str2 = scan.next();
		if(str1!=null && str1.indexOf(str2)!=-1){
			System.out.println(str1+"에 "+str2+"가 있습니다.");
		}else {
			System.out.println(str1+"에 "+str2+"가 없습니다.");
		}if(str1!=null) {
			System.out.println(str1+"의 길이 : " + str1.length());
		}
		int arr[]=new int[5];
		System.out.println(arr.length);
		scan.close();	
	}

}
