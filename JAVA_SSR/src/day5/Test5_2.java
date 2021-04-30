package day5;

public class Test5_2 {

	public static void main(String[] args) {
		String str1 = "ab";//"ab" : 리터럴
		String str2 = "ab";//리터럴 : 코드값
		if(str1 == str2) {
			System.out.println("두 문자열이 같습니다.");
		}else {
			System.out.println("두 문자열이 다릅니다.");
		}
		//주소가 같음  아랫쪽은 주소가 다른 경우임.
		String str3 = new String("ab");
		String str4 = new String("ab");
		if(str3 == str4) {
			System.out.println("두 문자열이 같습니다.");
		}else {
			System.out.println("두 문자열이 다릅니다.");
		}
	}

}
