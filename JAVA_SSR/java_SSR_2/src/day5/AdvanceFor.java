package day5;

public class AdvanceFor {

	public static void main(String[] args) {
		/* 향상된 for문 예제
		 * - 배열이나 컬렉션프레임워크에서 사용가능한 for문
		 * - 전체 탐색할 때 사용
		 * - 값을 가져올 때 사용 (값을 확인할때)
		 * - 값을 변경할 때 사용하지 않음 (번지수가 정확하지 않기 때문)
		 * for(타입 변수 : 배열명){
		 *       실행문
		 * }
		 * */
		int arr[] = {1,2,3,4,5};
		for(int i =0; i<arr.length; i+=1) {
			int tmp = arr[i];
			System.out.print(tmp + " ");
		}
		System.out.println();
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
	}

}
