package accountBook;

import java.util.Scanner;

public class AccountBookProgram {
	/* 가계부 프로그램 구현하려고 한다. 이 때 필요한 클랴스를 만들어보세요
	 * 수입 : 수입/지출
	 * 날짜 : 
	 * 자산 : 현금/은행/카드
	 * 분류 : 식비/교통/건강
	 * 금액 : 
	 * 내용 : 
	 * */
	AccountBook2 book;
	Scanner scan = new Scanner(System.in);
	/* 기능 : 내역을 입력받아 가계부에 저장하는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음
	 * 메소드명 : insert
	 * */
	public void insert() {
		System.out.print("타입 : ");
		String type = scan.next();
		System.out.print("날짜 : " );
		String Date = scan.next();
		System.out.print("자산 : ");
		String paymentType = scan.next();
		System.out.print("분류 : ");
		String category = scan.next();
		System.out.print("금액 : ");
		int cost = scan.nextInt();
		System.out.print("내용 : ");
		String contants = scan.next();
		Item item = new Item(type, Date, paymentType, category, cost, contants);
		book.insert(item);
		
	}
	/* 기능 : 수정할 내역의 번호와 내역정보를 입력받아 내역을 수정하는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음 void
	 * 메소드명 : update
	 * */
	public void update() {
		System.out.print("수정할 내역 번호 선택 : ");
		int index = scan.nextInt();
		System.out.println("수정할 내역을 입력하세요.");
		if(index!=0&&book.getCnt()>index) {
			System.out.println("타입 : ");
			String type = scan.next();
			System.out.print("날짜 : " );
			String Date = scan.next();
			System.out.print("자산 : ");
			String paymentType = scan.next();
			System.out.print("분류 : ");
			String category = scan.next();
			System.out.print("금액 : ");
			int cost = scan.nextInt();
			System.out.print("내용 : ");
			String contants = scan.next();
			Item item = new Item(type, Date, paymentType, category, cost, contants);
			book.update(index-1, item);
		}else {
			System.out.println("잘못된 번호입니다.");
		}
	}
	
	/* 기능 : 삭제할 번호를 입력받아 내역을 삭제하는 메소드
	 * 메소드명 : delete
	 * */
	public void delete() {
		System.out.print("삭제할 내역 번호 선택 : ");
		int index = scan.nextInt();
			book.delete(index);
	}
	/* 기능 : 내역 전체를 상세 출력하는 메소드 
	 * 메소드명 : printItemListDetail
	 * */
	public void printItemListDetail() {
		book.printItemListDetail();
	}
	
	/* 기능 : 내역 전체를 간략히 출력하는 메소드 */
	public void printItemSimple() {
		book.printItemSimple();
	}
	/* 기능 : 확인할 내역 번호를 입력받아 내역을 상세히 출력하는 메소드*/
	public void printItem() {
		System.out.println("확인할 내역의 번호 선택 : ");
		int index = scan.nextInt();
		book.printItem(index);
	}
	/* 기능 : 가계부 금액을 출력하는 메소드 */
	public void printTotal() {
		System.out.println("내역 합계 : "+book.getTotal()+"원");
	}
	

}
		


