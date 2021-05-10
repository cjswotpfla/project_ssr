package day10;

public class Rect {
	private int height;
	private int width;
	//왼쪽 위의 점 : leftUP
	private Point leftUp;
	//오른쪽 아래의 점 : rightDown
	private Point rightDown;
	
	/* 기능 : 사각형의 정보를 출력하는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음 
	 * 메소드명 : print
	 * */
	public void print() {
		System.out.print("사각형의 왼쪽 위 점 : ");
		leftUp.print();
		System.out.print("사각형의 오른쪽 위 점 : ");
		rightDown.print();
		System.out.println("사각형의 높이 : "+height);
		System.out.println("사각형의 너비 : "+width);
	}
	/* 기능 	  : 주어진 좌표로 왼쪽위의 점을 이동시키는 메소드
	 * 매개변수 : 주어진 좌표 => int x, int y
	 * 리턴타입 : 없음 => void
	 * 메소드명 : move
	 * */
	
	
	/* 기본생성자 : 왼쪽 위의 점을 나타내는 객체를 생성, 오른쪽 위의 점을 나타내는 객체 생성*/
	public Rect() {
		leftUp = new Point();
		rightDown = new Point();
	}
	/* 생성자 : 좌상점과 우하점이 주어지면 해당 점을 이용한 사각형이 되도록 초기화 
	 * 		  좌상점, 우하점 초기화, 너비와 높이도 계산해서 초기화
	 * 매개변수 : 좌상점, 우하점
	 * */
	public Rect(int left,int up, int right,int down) {
		leftUp = new Point(left,up);
		rightDown = new Point(right,down);
		width =right = left;
		height = up - down;
	}
	public Rect(Point lu, Point rd) {
		leftUp = lu;
		rightDown = rd;
		width = rightDown.getX()-leftUp.getX();
		height = leftUp.getY()-rightDown.getY(); 
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public Point getLeftUp() {
		return leftUp;
	}
	public void setLeftUp(Point leftUp) {
		this.leftUp = leftUp;
	}
	public Point getRightDown() {
		return rightDown;
	}
	public void setRightDown(Point rightDown) {
		this.rightDown = rightDown;
	}
}
