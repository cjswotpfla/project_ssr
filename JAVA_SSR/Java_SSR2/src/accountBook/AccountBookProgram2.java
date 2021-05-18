package accountBook;

import java.util.Scanner;

public class AccountBookProgram2 {
	AccountBook2 book;
	Scanner scan = new Scanner(System.in);
	/* 기능 : 내역을 입력받아 가계부에 저장하는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음
	 * 메소드명 : insert
	 * */
	public void insert() {
		System.out.println("가계부 내역을 입력하세요 .");
		Item item=createItem();
		book.insert(item);
	}
	public void update() {
		System.out.print("수정할 내역 번호 선택 : ");
		int index = scan.nextInt();
		if(index<1||index>book.getCnt()) {
			System.out.println("없는 내역입니다. 수정할 수 없습니다.");
		}
		System.out.println("수정할 내역을 입력하세요.");
		Item item = createItem();
		book.update(index-1, item);
		System.out.println("수정이 완료되었습니다.");
	}
	/* 기능 : 삭제할 번호를 입력받아 내역을 삭제하는 메소드
	 * 메소드명 : delete
	 * */
	public void delete() {
		System.out.println("삭제할 내역 번호 선택 : ");
		int index = scan.nextInt();
		if(index<1||index>book.getCnt()) {
			System.out.println("없는 내역입니다. 삭제할 수 없습니다.");
		}
		book.delete(index-1);
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
		if(index<1||index>book.getCnt()) {
			System.out.println("없는 내역입니다. 확인할 수 없습니다.");
		}
		book.printItem(index-1);
	}
	/* 기능 : 가계부 금액을 출력하는 메소드 */
	public void printTotal() {
		System.out.println("내역 합계 : "+book.getTotal()+"원");
	}
	
	public AccountBookProgram2() {
		book = new AccountBook2();
	}
	public AccountBookProgram2(int max) {
		book = new AccountBook2(max);
	}
	
	public void printMenu() {
		System.out.println("--------메뉴--------");
		System.out.println("1. 가계부 작성");
		System.out.println("2. 가계부 수정");
		System.out.println("3. 가계부 삭제");
		System.out.println("4. 가계부 전체 상세 확인");
		System.out.println("5. 가계부 전체 간략 확인");
		System.out.println("6. 가계부 내역 상세 확인");
		System.out.println("7. 가계부 총액 확인");
		System.out.println("8. 가계부 닫기");
		System.out.println("--------------------");
		System.out.print("메뉴를 선택하세요 : ");
	}
	/* 기능 : 내역 정보를 입력받아 내역을 생성하여 알려주는 메소드
	 * 매개변수 : x
	 * 리턴타입 : 생성된 내역 => Item 
	 * 메소드명 : createItem*/
	private Item createItem() {
		System.out.print("수입/지출 : ");
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
		return item;
	}
	public void clossItem() {
		System.out.println("가계부를 닫습니다.");
		scan.close();
	}
}
//도서관리 프로그램을 만드려고 한다. 이때 필요한 클래스는 무엇인가?
//수강생 관리 프로그램을 만드려고 한다. 이때 필요한 클래스는 무엇인가?
//쇼핑몰을 운영하려고 한다. 이 때 필요한 클래스는 무엇인가?
 