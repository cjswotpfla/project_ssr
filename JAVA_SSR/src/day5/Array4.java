package day5;

public class Array4 {

	public static void main(String[] args) {
		/* 1~10 사이의 정수 3개를 랜덤으로 생성하여 배열에 저장한 후 생성된 값들이 
		 * 중복되었는지 아닌지 확인하는 코드를 작성하세요.
		 * 예시 : 
		 * 랜덤 : 3 8 2
		 * 중복되지않음
		 * 예시 :
		 * 랜덤 : 2 8 8
		 * 중복
		 * */
		int min = 1, max = 10;
		int i, k, r;
		int arr[] = new int[3];
		System.out.print("랜덤 : ");
		for(i=0;i<arr.length;i+=1) {
			r = (int)(Math.random() * (max-min+1) + min);
			arr[i] = r;
			System.out.print(arr[i] + " ");  			
		}
		System.out.println();
		
		if(arr[0]==arr[1]||arr[0]==arr[2]||arr[1]==arr[2]) {
			System.out.println("중복");
		}else {
			System.out.println("중복되지 않음");
		}//중복된 값이 있을지 없을지에 관한 변수 선언
		boolean isDup = false;
		//비교할숫자보다 1을 빼 주어야 한다 
		//0 1 2 3 4 => 01 02 03 04 =>12 13 14 => 23 24 => 34 
		//위와 같이 한개씩 줄어드는것을 볼수있음. 그렇기에 1을 빼주어야함
		for(i=0;i<arr.length-1;i+=1) {
			//i에 1을 더하는 이유 : i가 0부터 시작하기때문임
			for(k=i+1;k<arr.length;k+=1) {
				if(arr[i]==arr[k]) {
					isDup = true;
				}
			}
		}
		if(isDup) {
			System.out.println("중복");
		}else {
			System.out.println("중복 아님");
		}
		
	}
}