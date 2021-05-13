package accountBook;

public class AccountBook {
	private String type;
	private String date;
	private String assets;
	private String classification;
	private int price;
	private String contents;
		
	public AccountBook(String type, String date, String assets, String classification, int price,
			String contents) {
		this.type =type;
		this.date = date;
		this.assets = assets;
		this.classification = classification;
		this.price = price;
		this.contents = contents;
	}
	
	
	
	
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

	public String getAssets() {
		return assets;
	}

	public void setAssets(String assets) {
		this.assets = assets;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	


}