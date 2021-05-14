package accountBook;

import java.util.Scanner;

public class AccountBookTest {

	public static void main(String[] args) {
		// 가계부 프로그램 완성본

		AccountBookProgram2 abp = new AccountBookProgram2();
		int menu=0;
		Scanner scan= new Scanner(System.in);
		do {
			abp.printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				abp.insert();
				break;
			case 2:
				abp.update();
				break;
			case 3:
				abp.delete();
				break;
			case 4:
				abp.printItemListDetail();
				break;
			case 5:
				abp.printItemSimple();
				break;
			case 6:
				abp.printItem();
				break;
			case 7:
				abp.printTotal();
				break;
			case 8:
				abp.clossItem();
				break;
			default:
				System.out.println("잘못된 번호입니다.");
			}
		}while(menu!=8);
	scan.close();
	}

}
