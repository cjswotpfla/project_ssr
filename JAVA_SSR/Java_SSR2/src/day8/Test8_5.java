package day8;

import java.util.Scanner;

public class Test8_5 {

	public static void main(String[] args) {
		/* 10개짜리 배열에 1부터 10을 저장한 후 출력하는 코드를 작성하세요*/
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i+=1) {
			arr[i]=i+1;
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		/* 10개짜리 배열에 피보나치수열을 저장한 후 출력하는 코드를 작성하세요
		 * 피보나치수열
		 * - 앞에 두개를 더하여 나열함
		 * - 0번지 : 1, 1번지 : 1
		 * - 1 1 2 3 5 6 13 21 34 55\
		 * 힌트 : arr[i] = arr[i-2] + arr[i-1]
		 * */
		int arr2[]=new int[10];
		arr[0]=1;
		arr[1]=1;
		//피보나치 수열 값을 배열에 저장
		for(int i=2;i<arr2.length;i+=i) {
			arr2[i] = arr2[i-2] + arr2[i-1];
		}
		for(int i=0;i<arr2.length;i+=1) {
			System.out.print(arr2[i]+ " ");
				}
		//배열의 값을 출력
		System.out.println();
		/* 5개짜리 배열에 저장된 숫자들 중 연속된 3자리 숫자가 있는지 확인하는 코드를 작성하세요.
		 * 단 숫자들은 정렬되었다고 가정
		 * 예시
		 * 입력 : 1 1 2 3 4
		 * 연속
		 * 예시
		 * 입력 : 1 2 4 5 8
		 * 연속아님
		 * 예시
		 * 입력 : 1 3 5 6 7
		 * 연속
		 * 뒤번지의 값과 1차이가 나면 count 변수를 1 증가
		 * 1차이가 나지 않으면 cnt는 1
		 * cnt가 3이 되면 반복문 종료*/
		int arr3[]=new int[] {1,2,4,5,8};
		int cnt = 1;
		for(int i=0;i<arr3.length-1;i+=1) {
			//i번지의 값과 i+1번지의 값의 차이가 1이면 cnt를 1증가
			if(arr3[i]+1==arr3[i+1]) {
				cnt+=1;
			}else {
				cnt=1;
			}//cnt가 3이면 반복문 종료
			if(cnt==3) {
				break;
			}
		}
		//cnt가 3이면 연속이라고 출력
		//cnt가 3이 아니면 연속 아님이라고 출력
		if(cnt==3) {
			System.out.println("연속");
		}else {
			System.out.println("연속 아님");
		}
	}
	//이거 쌤꺼 깃 다시한번 보아야겠다 ^^;;;
}

