package day8;

import java.util.Scanner;

public class Test8_3 {

	public static void main(String[] args) {
		/* 4개의 성적을 입력받아 합격인지 불합격인지 판별하는 코드를 작성하세요.
		 * 합격 기준
		 * - 모든 성적이 과락이 없어야 함
		 * - 평균 60점 이상
		 * 과락 : 성적이 40점 미만인 경우
		 * 예시(과락이 있는경우) 
		 * 성적 : 40 30 100 100
		 * 불합격입니다.
		 * 예시(합격)
		 * 성적 : 60 40 100 100
		 * 합격입니다.
		 * 예시(평균이 60 미만인 경우)
		 * 성적 : 40 50 40 60
		 * 불합격입니다.
		 * */
		 //성적을 입력
		int sco[]=new int[4];
		System.out.print("성적을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);;
		for(int i=0;i<sco.length;i+=1) {
			sco[i]=scan.nextInt();	
			}
		 //합격여부 결정
		int sum = 0;
		boolean pass = true; //true : 합격, false : 불합격
		for(int tmp:sco) {
			sum += tmp;
		}
		double avg = (double)sum/sco.length;
		if(avg<60){
			pass=false;
		}//과락이 있는지 없는지 확인
		for(int tmp:sco) {
			if(tmp<40) {
				pass=false;
		}
		}
		if(pass) {
			System.out.println("합격입니다");
			}else {
			System.out.println("불합격입니다");
			}
	}
}	
	/*if((double)(sco1+sco2+sco3+sco4)/4<60){
			System.out.println("불합격입니다.");	
		}else if(sco1<40||sco2<40||sco3<40||sco4<40) {
			System.out.println("불합격입니다.");
		}else {
			System.out.println("합격입니다.");
		}*/

 

