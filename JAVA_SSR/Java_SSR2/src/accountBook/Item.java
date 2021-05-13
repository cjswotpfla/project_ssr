package accountBook;

public class Item {
	/* 클래스명 : Item
	 *  - 수입/ 지출내역을 나타내는 클래스*/
	private String type;//수입,지출
	private String date;//날짜
	private String paymentType;//결제타입
	private String category;//분류
	private int cost;//금액
	private String contents;//내용
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	public Item(String type, String date, String paymentType, String category, int cost, String contents) {
		this.type = type;
		this.date = date;
		this.paymentType = paymentType;
		this.category = category;
		this.cost = cost;
		this.contents = contents;
	}
	/* 기능 : 멤버변수를 수정하는 기능
	 * 매개변수 : 수정할 멤버변수 내용
	 * 리턴타입 : x 
	 * 메소드명 : update */
	public void update(String type, String date, String paymentType, String category, int cost, String contents) {
		if(type!=null)
			this.type = type;
		if(date!=null)
			this.date = date;
		if(paymentType!=null)
			this.paymentType = paymentType;
		if(category!=null)
			this.category = category;
		if(cost!=0)
			this.cost = cost;
		if(contents!=null)
			this.contents = contents;
	}
	/**/
	public void print() {
		System.out.println("수입 : "+type);
		System.out.println("날짜 : "+date);
		System.out.println("자산(현금,은행,카드) : "+paymentType);
		System.out.println("분류(식비,교통,건강) : "+category);
		System.out.println("금액 : " + cost);
		System.out.println("내용 : " + contents);
	}
	
}