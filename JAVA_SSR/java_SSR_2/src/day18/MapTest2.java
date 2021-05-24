package day18;

import java.util.HashMap;
import java.util.Scanner;

public class MapTest2 {
	public static void main(String[] args) {
		/* 다음 두 기능을 가진 프로그램을 작성하세요 
		 * 1. 회원가입
		 * 2. 로그인 
		 * 3. 종료 
		 * 예시
		 * 1. 회원가입
		 * 2. 로그인
		 * 3. 종료
		 * 메뉴 선택 : 1
		 * 회원가입
		 * 아이디 : abc123
		 * 비밀번호 : abc123
		 * 회원가입되었습니다.
		 * 1. 회원가입
		 * 2. 로그인
		 * 3. 종료
		 * 메뉴 선택 : 1
		 * 아이디 : abc123
		 * 이미 가입된 회원입니다.
		 * 1. 회원가입
		 * 2. 로그인
		 * 3. 종료
		 * 메뉴 선택 : 2
		 * 아이디 : abc123
		 * 비밀번호 : abc123
		 * 로그인 성공
		 * 1. 회원가입
		 * 2. 로그인
		 * 3. 종료
		 * 메뉴 선택 : 2
		 * 아이디 : abc123
		 * 비밀번호 : 1234
		 * 로그인 실패
		 * */
		HashMap<String, String> map = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			print();
			System.out.print("메뉴선택 : ");
			int menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.print("아이디 : ");
				String str1 = scan.next();
				//가입된 아이디가 아니면 비밀번호 입력 후 아이디와 비밀번호 저장
				
				/*System.out.print("비밀번호 : ");
				String str2 = scan.next();
				if(map.put(str1, str2)==null) {
					System.out.println("======회원가입 되었습니다======");
				}else {
					System.out.println("====이미 가입된 아이디입니다====");
				}*/
			}
		}
	}
	public static void print() {
		System.out.println("1.회원가입");
		System.out.println("2.로그인");
		System.out.println("3.종료");
	}
}