package day5;

public class Array2 {

	public static void main(String[] args) {
		// 5개짜리 정수 배열에 1부터 5까지 차례대로 저장 후 출력하는 예제
		// 5개짜리 정수 배열 생성
		int []arr = new int[5];
		int i;
		// i <= 4 == i < 5
		for(i=0;i<5;i+=1) {
			arr[i]=i+1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.print(arr[0] + " ");
		System.out.print(arr[1] + " ");
		System.out.print(arr[2] + " ");
		System.out.print(arr[3] + " ");
		System.out.print(arr[4] + " ");
	}

}
