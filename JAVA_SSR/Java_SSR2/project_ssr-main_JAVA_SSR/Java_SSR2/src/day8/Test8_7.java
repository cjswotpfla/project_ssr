package day8;

public class Test8_7 {

	public static void main(String[] args) {
		/* 5개짜리 배열에 같은 숫자2개가 몇개 있는지판별하는 코드를 작성하세요
		 * 단, 숫자는 정렬되어 있다고 가정
		 * 예시 : 1 1 2 3 4
		 * 1
		 * 예시 : 1 2 3 4 5
		 * 0
		 * 예시 : 1 1 2 2 4
		 * 2
		 * 예시 : 1 1 1 2 3 
		 * 0
		 * 예시 : 1 1 1 2 2 
		 * 0
		 * i번지의 값과 i+1번지의 값이 같으면 cnt를 1 증가
		 * 다르면
		 *      cnt의 값이 2와 같으면 res를 true로 수정
		 *      cnt를 1로 초기화
		 * 반복문 종료 후
		 *  cnt가 2와 같으면 res를 true로 수정
		 *  res가 true이면 있음이라고 출력
		 *  false이면 없음이라고 출력
		 */
		int arr[]=new int[] {1,1,1,2,3};
		int cnt=1;
		int res = 0;//숫자가 2개 일치하는 경우가 있는지 없는지 알려주는 변수
		for(int i=0;i<arr.length-1;i+=1) {
			if(arr[i]==arr[i+1]) {
				cnt+=1;
			}else {
				if(cnt==2) {
					res+=1;
				}
				cnt=1;
			}
		}
		if(cnt==2) {
			res+=1;
		}
		System.out.println(res);
	}	

}
