package day5;

public class Array3 {

	public static void main(String[] args) {
		/* 정수 num의 약수를 배열에 저장한 후 출력하는 코드를 작성하세요.
		 * 단, 약수의 갯수가 10개를 넘어가는 경우 최대 10개만 출력 
		 * 반복 횟수 	: i는 1부터 num보다 작거나 같을때짜기 1 씩증가
		 * 규칙성		: num를 i로 나누었을 때 나머지가 0과 같으면
		 *            배열 cnt번지에 i를 저장한 후
		 *            cnt 증가 후
		 *            cnt가 10과 같으면 반복문 종료
		 * 반복문 종료 후 : 배열에 있는 값을 0번지 부터 cnt개 출력
		 * */
		int i, num = 714;
		int arr[]=new int[10];
		int cnt = 0;
		for(i=1;i<=num;i+=1) {
			if(num%i==0) {
				//배열 cnt번지에 i를 저장
				arr[cnt]=i;
				//cnt 증가
				cnt += 1;
				if(cnt==10) {
					break;
				}
			}	
		}
		//배열에 있는 값을 0번지 부터 cnt개 출력
		for(i=0;i<cnt;i+=1) {
			System.out.print(arr[i] + " ");
		}
	}

}


