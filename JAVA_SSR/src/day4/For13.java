package day4;

public class For13 {

	public static void main(String[] args) {
		/* 구구단 전체를 출력하는 코드를 작성하세요
		 * */
		int i, k;
		for(i=1;i<=9;i+=1) {
			for(k=2;k<=9;k+=1)
			System.out.println(k + " x " + i + " = " +(k*i));
		}

	}

}
