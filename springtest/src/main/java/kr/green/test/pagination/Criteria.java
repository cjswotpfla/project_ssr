package kr.green.test.pagination;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Criteria {
	@Getter
	private int page; 
	@Getter
	private int perPageNum;
	@Getter@Setter
	private String search;
	@Getter@Setter
	private int type;
	
	public Criteria() {
		this.page = 1;
		this.perPageNum = 10;
		this.search ="";
	}
	
	public void setPage(int page) {
		if(page <= 0) this.page = 1;
		else	this.page = page; }
	
	public void setPerPageNum(int perPageNum) {

		if(perPageNum <=0 || perPageNum > 100) {
			this.perPageNum = 10;
		}
		else
			this.perPageNum = perPageNum;
	}
	/* 쿼리문에서 limit에 사용되는 인덱스를 계산하는 getter */
	public int getPageStart() {
		return (this.page -1) * perPageNum;
	}
}
