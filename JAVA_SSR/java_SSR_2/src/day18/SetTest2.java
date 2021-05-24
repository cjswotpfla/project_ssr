package day18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTest2 {

	public static void main(String[] args) {
		/* 중복되지 않는 5개의 수가 입력 될 때까지 입력 한 후, 입력이 완료 되면 종료하는 코드
		 * 예시 
		 * 정수를 입력하세요 : 1
		 * 정수를 입력하세요 : 2
		 * 정수를 입력하세요 : 3
		 * 정수를 입력하세요 : 4
		 * 정수를 입력하세요 : 1
		 * 정수를 입력하세요 : 2
		 * 정수를 입력하세요 : 3
		 * 정수를 입력하세요 : 5
		 * 입력된 정수 : 1 2 3 4 5(출력은 순서에 상관없이)
		 * */
		HashSet<Integer> set = new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);
		while(set.size()<5){
			System.out.print("정수를 입력하세요 : ");
			//Integer num = scan.nextInt();
			//set.add(num);
			set.add(scan.nextInt());
		}
		System.out.print("입력된 정수 : ");
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			//Integer tmp = it.next();
			//System.out.println(tmp + " ");
			System.out.print(it.next()+" ");
		}
		scan.close();
	}

}
