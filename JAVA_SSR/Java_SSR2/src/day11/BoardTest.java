package day11;

public class BoardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board(1, "제목입니다", "내용입니다", "송세림", "2021-05-11", "공지");
		board.print();
		// =는 오른쪽에 있는 값을 왼쪽에 저장하는데, 타입이 같거나 변환이 가능해야한다.
		//String str = new Point();
		String str = "1";
		//int num = str;
		double dnum = 1;//정수 1이 자동타입변환이 되어서 가능
		int num = (int)1.0;//실수 1.0이 강제타입변환이 되어서 가능
	}

}
