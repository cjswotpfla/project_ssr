/* 소녀시대가 부른 노래를 검색할 때 필요한 쿼리문 
singer 테이블(가수명), source 테이블(노래명)
sing 테이블(가수번호, 음원번호)
*/
select so_title from singer 
	join sing
		on si_num = sn_si_num
	join `source`
		on so_num = sn_so_num
	where si_name = '소녀시대';
/* 소녀시대의 멤버들을 검색하기 위한 쿼리문 
singer 테이블(소녀시대), artist(멤버이름)
member 테이블
*/
select ar_name from singer
	join `member`
		on me_si_num = si_num
	join artist
		on me_ar_num = ar_num
	where si_name = '소녀시대';
/* 소녀시대의 3집앨범의 수록곡들을 확인하기 위한 쿼리문
 => 소녀시대의 노래들 중 3집 앨범에 있는 노래들
 => 소녀시대의 노래들 중 album 테이블과 list 테이블
*/

select so_title from singer 
	join sing
		on si_num = sn_si_num
	join `source`
		on so_num = sn_so_num
	join `list`
		on so_num = li_so_num
	join album
		on al_num = li_al_num
	where si_name = '소녀시대' and al_title like '%3집%';

/* join을 하는 경우 순서에 따라 검색 시간이 달라짐 */   
select so_title from (select * from singer where si_name = '소녀시대') as singer_search 
	join sing
		on si_num = sn_si_num
	join `source`
		on so_num = sn_so_num
	join `list`
		on so_num = li_so_num
	join album
		on al_num = li_al_num
	where al_title like '%3집%';
    
/* 거짓말이 들어간 노래를 확인하는 쿼리문 */
select so_title from `source` where so_title like '%거짓말%';

/* 노래 제목 또는 가사에 거짓말이 포함된 노래를 확인하는 쿼리문 */
select so_title from `source` 
	where so_title like '%거짓말%' or so_lyric like '%거짓말%';

/* SM 소속 아티스트 목록을 확인하는 쿼리문 */
select ar_name from artist where ar_agency like 'SM%';

/* 태연이 활동한 그룹들을 확인한 쿼리문
artist 테이블(태연), member 테이블(속한 그룹)
singer 테이블(그룹명)
*/
select si_name from `member`
	join artist
		on me_ar_num = ar_num
	join singer
		on me_si_num = si_num
	where ar_name like '%태연%';
    
/* 태연(가수)이 피처링한 노래들을 확인하는 쿼리문 
singer 테이블 : 태연, sing 테이블 : 피처링 여부
source 테이블 : 노래 
*/
select so_title from singer
	join sing
		on sn_si_num = si_num
	join `source`
		on sn_so_num = so_num
	where si_name like '%태연%' and sn_featuring = 'Y';
    
/* 소녀시대의 메인 타이틀곡들을 확인하는 쿼리문 
singer : 소녀시대 ,	list : 대표곡 여부
source : 노래 제목, 	sing : 음반이 소녀시대 노래인지
*/
select so_title from singer 
	join sing
		on si_num = sn_si_num
	join `source`
		on so_num = sn_so_num
	join `list`
		on so_num = li_so_num
	join album
		on al_num = li_al_num
	where si_name = '소녀시대' and li_main = 'Y';