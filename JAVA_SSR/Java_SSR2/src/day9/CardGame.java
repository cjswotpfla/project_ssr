package day9;

public class CardGame {

	public static void main(String[] args) {
		/* 카드 게임 : 실제 포커 게임은 모양과 숫자를 다 고려해야 하지만 
		 * 			 여기에선 숫자만 고려, 카드는 7장
		 * 			 카드는 1~13이 4개씩(하트,다이아,세잎,스페이스)
		 * - 포커 : 같은 숫자가 4개
		 * - 풀하우스 : 트리플 1+페어(2페어도 가능) 또는 트리플 2
		 * - 스트레이트 : 연속된 숫자가 5개 이상
		 * - 트리플 : 같은 숫자가 3개
		 * - 투 페어 : 같은 숫자가 2개씩 2개 => 페어가 2개
		 * - 페어 : 같은 숫자가 2개
		 * - 탑 : 위의 모든 조건이 없는 경우 가장 큰 수 
		 * */
		/* 배열에 같은 숫자 3개가 있으면 있는 숫자들을 배열에 저장하여 알려주는 코드를 작성하세요
		 * [1,1,1,2,3,4,5]
		 */
		//카드가 주어지면 해당 카드의 가장 큰 등급을 출력하는 코드를 작성하세요
		//아래와 같이 풀하우스,트리플,페어로 판별 가능한 경우
		//풀하우스 하나만 출력
		//아래는 1풀하우스입니다 라고 출력
		int arr[]=new int[] {1,1,1,2,2,6,7};

		System.out.println("포커 : " + poker(arr));
		System.out.println("트리플 : " + triple(arr));
		System.out.println("원페어 : "+onePair(arr));
		System.out.print("투페어 : ");
		int res[]=twoPair(arr);
		if(res==null) {
			System.out.print(0);
		}else {
			for(int tmp : res) {
				System.out.print(tmp + " ");
			}
		}
		System.out.println();
		System.out.println("풀하우스 : "+fullHouse(arr));	
		System.out.println("스트레이트 : " + straight(arr));
	}
	/* 포커를 확인할 수 있는 메소드를 정리해보세요.
	 * 기능	 : 7개짜리 배열이 주어지면 배열에 포커가 있는지 확인하여 있으면 해당 숫자를,
	 * 		   없으면 0을 알려주는 메소드 
	 * 매개변수 : 배열 => int arr[](강사님 : int card[])
	 * 리턴타입 : 같은숫자 => 정수 => int(강사님 : 포커의 숫자 => 정수 => int)
	 * 메소드명 : poker
	 * */
	public static int poker(int card[]) {
		int cnt=1;
		for(int i=0;i<card.length-1;i+=1) {
			if(card[i]==card[i+1]) {
				cnt+=1;
				if(cnt==4) {
					return card[i];
				}
			}else {
				cnt=1;
			}
		}
		return 0;
	}
	/* 트리플을 확인할 수 있는 메소드를 정리해보세요. 
	 * 트리플이 있다면 해당 트리플의 숫자를 확인할 수 있는 메소드를 만들어야 합니다.
	 * 기능	 : 배열에 트리플이 있는지 확인하여 있으면 해당 숫자들을 알려주는 메소드.
	 * 		   없으면 null을 알려줌
	 * 매개변수 : 배열 : int card2[]
	 * 리턴타입 : 트리플의 숫자들 => 정수 배열 => int[]
	 * 메소드명 : tripleCount
	 * */
	public static int[] tripleList(int card[]) {
		int cnt=1;
		int res=0;
		int triple[]=new int[2];
		int num=0;
		for(int i=0;i<card.length-1;i+=1) {
			if(card[i]==card[i+1]) {
				cnt+=1;
				num=card[i];
			}else {
				if(cnt==3) {
					triple[res]=num;
					res+=1;
				}
				cnt=1;
			}
		}
		if(cnt==3) {
			triple[res]=num;
			res+=1;
		}
		//트리플이 없으면
		if(res==0) {
			return null;
		}else if(res==2){
			return triple;
		}else {
			int tmp[]=new int[1];
			tmp[0]=triple[0];
			return tmp;
		}
	}
	/* 트리플 기능을 하도록 메소드를 정리하고 코드를 작성하세요.
	 * 기능	 : 배열에 트리플이 있으면 해당 숫자를 알려주고 없으면 0을 알려주는 메소드
	 * 매개변수 : 배열 => int card[]
	 * 리턴타입 : 트리플 숫자 => int
	 * 메소드명 : triple
	 * */
	public static int triple(int card[]) {
		int res[]=tripleList(card);
		//트리플이 아닌경우
		if(res==null||res.length==2) {
			return 0;
		}
		return res[0];
	}
	/* 페어를 확인할 수 있는 메소드를 정리해보세요. 페어가 있다면 해당 페어의 숫자들을 알려주고, 
	 * 없으면 null을 알려주는 기능을 정리하고 구현해보세요.
	 * 기능 	 : 배열을 이용하여 페어가 있으면 해당 페어 숫자를 알려주고 없으면 null을 알려주는 메소드
	 * 매개변수 : 배열 => int card[]
	 * 리턴타입 : 배열의 숫자들 => int[]
	 * 메소드명 : pairList
	 * */
	public static int[] pairList(int card[]){
		int cnt = 1;
		int num = 0;
		int res = 0;
		int pair[]=new int[3];
		for(int i=0;i<card.length-1;i+=1) {
			if(card[i]==card[i+1]) {
				cnt+=1;
				num=card[i];
			}else {
				//페어이면
				if(cnt==2) {
					pair[res]=num;
					res+=1;
				}
				cnt=1;
			}
		}
		if(cnt==2) {
			pair[res]=num;
			res+=1;
		}
		if(res==0) {
			return null;
		}else if(res<3){
			int tmpArr[]=new int[res];
			for(int i=0;i<res;i+=1) {
				tmpArr[i]=pair[i];
			}
			return tmpArr;
		}
		return pair;
	}
	/* 원페어를 확인할 수 있는 메소드를 정리해보세요.
	 * 기능	 : 배열에 원페어가 있으면 해당 페어 숫자를 알려주고 없으면 0을 알려주는 메소드
	 * 매개변수 : 배열 => int card[]
	 * 리턴타입 : 원페어 숫자 => int
	 * 메소드명 : onePair
	 * */
	public static int onePair(int card[]) {
		int res[]=pairList(card);
		if(res!=null&&res.length==1) {
			return res[0];
		}
		return 0;
	}
	/* 투페어를 확인할 수 있는 메소드를 정리해보세요.
	 * 기능	 : 배열에 투페어가 있으면 해당 페어 숫자들을 알려주고 없으면 null을 알려주는 메소드
	 * 매개변수 : 배열 => int card[]
	 * 리턴타입 : 투페어 숫자들 => int[]
	 * 메소드명 : twoPair
	 * */
	public static int[] twoPair(int card[]){
		int res[]=pairList(card);
		if(res==null||res.length==1) {
			return null;
		}
		return res;
	}
	/* 풀하우스를 확인할 수 있는 메소드를 정리해보세요.
	 * 기능	 : 배열에서 풀하우스를 확인하여 있으면 숫자, 없으면 0을 알려주는 메소드
	 * 매개변수 : 배열 => int arr[]
	 * 리턴타입 : 풀하우스 숫자 => int
	 * 메소드명 : fullHouse
	 * */
	public static int fullHouse(int card[]) {
		//트리플이 2개이면 풀하우스
		//tripleList를 이용
		int triple[]=tripleList(card);
		//트리플이 없으면 풀하우스가 될 수 없기 때문에 0을 리턴(메소드 종료)
		if(triple==null) {
			return 0;
		}
		if(triple.length==2) {
			if(triple[0]>triple[1]) {
				return triple[0];
			}
			return triple[1];
		}
		//트리플이 2개가 아니면 
		//트리플이 1개, 페어가 1개 이상이면 풀하우스
		//triple과 pairList를 이용
		int pair[]=pairList(card);
		if(pair!=null) {
			return triple[0];
		}
		//아니면 풀하우스가 아님
		return 0;
	}
	/* 스트레이트를 확인할 수 있는 메소드를 정리해보세요.
	 * 원래는 마운틴이라고 해서 10,11,12,13,A가 있는데 여기에서는 제외
	 * 백스트레이트라고 해서 1,2,3,4,5가 있는데 여기에서는 그냥 5 스트레이트로 판단 
	 * 기능 	 : 배열에서 연속된 5개의 숫자가 있으면 숫자를, 없으면 0을 출력 
	 * 매개변수 : 배열 => int card[]
	 * 리턴타입 : 가장 큰수 => 정수 => int
	 * 메소드명 : straight
	 * */
	public static int straight(int card[]) {
		int cnt = 1;
		int num = 0;
		for(int i=0;i<card.length-1;i+=1) {
			if(card[i]+1==card[i+1]) {
				cnt+=1;
				num=card[i+1];
			}else {
				if(cnt>=5) {
					return num;
				}
				cnt=1;
			}
		}
		//스트레이트가 마지막 숫자를 포함할때
		if(cnt>=5) {
			return num;
		}
		return 0;
	}
}	