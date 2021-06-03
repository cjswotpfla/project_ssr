create database if not exists cinema2;
use cinema2;
CREATE TABLE if not exists `member` (
	`me_id`	varchar(20)	NOT NULL,
	`me_name`	varchar(50)	not NULL,
	`me_level`	varchar(10)	not NULL default 'bronze',
	`me_point`	int not	NULL,
    primary key(me_id)
);

CREATE TABLE if not exists `movie` (
	`mo_num`	int	NOT NULL,
	`mo_title`	varchar(50)	not NULL,
	`mo_contents`	longtext not NULL,
	`mo_director`	varchar(100)	not NULL,
	`mo_main_actor`	longtext not NULL,
	`mo_sub_actor`	longtext NULL,
	`mo_opening_date`	date NULL,
	`mo_genre`	varchar(100) not NULL,
	`mo_runtime`	int	not NULL,
	`mo_rating`	int	not NULL,
    primary key(mo_num)
);

CREATE TABLE if not exists `screen` (
	`sc_num`	int	NOT NULL,
	`sc_mo_num`	int	NOT NULL,
	`sc_start_time`	char(5) not	NULL,
	`sc_end_time`	char(5)	not NULL,
	`sc_date`	date not NULL,
	`sc_sr_num`	int	NOT NULL,
	`sc_type`	varchar(10)	not NULL default '2D',
    primary key(sc_num),
    foreign key(sc_mo_num) references movie(mo_num),
    foreign key(sc_sr_num) references screen_room(sr_num)
);

CREATE TABLE if not exists `reservation` (
	`re_num`	int	NOT NULL,
	`re_me_id`	varchar(20)	NOT NULL,
	`re_se_num`	int	NOT NULL,
	`re_sc_num`	int	NOT NULL,
	`re_price`	int	not NULL default 0,
	`re_ti_num`	int	NOT NULL,
    primary key(re_num),
    foreign key(re_me_id) references `member`(me_id),
    foreign key(re_se_num) references seat(se_num),
    foreign key(re_sc_num) references screen(sc_num),
    foreign key(re_ti_num) references ticket(ti_num)
);

CREATE TABLE if not exists `ticket` (
	`ti_num`	int	NOT NULL,
	`ti_personnal`	int	not NULL default 1,
    primary key(ti_num)
);

CREATE TABLE if not exists `theater` (
	`th_branch`	varchar(50)	NOT NULL,
	`th_address`	varchar(50) NULL,
	`th_transport`	longtext	NULL,
    primary key(th_branch)
);

CREATE TABLE if not exists `screen_room` (
	`sr_num`	int	NOT NULL,
	`sr_th_branch`	varchar(50)	NOT NULL,
	`sr_name`	varchar(10)	not NULL,
	`sr_personnel`	int not	NULL default 0,
	`sr_location`	varchar(50)	not NULL,
    primary key(sr_num),
    foreign key(sr_th_branch) references theater(th_branch)
);

CREATE TABLE if not exists `seat` (
	`se_num`	int	NOT NULL,
	`se_name`	char(3)	not NULL,
	`se_sr_num`	int	NOT NULL,
    primary key(se_num),
    foreign key(se_sr_num) references screen_room(sr_num)
);
/* 컨저링 영화정보 추가 */
insert into movie
	values(1,'컨저링 3 - 악마가 시켰다','모든 것은 악마가 시켰다!'
    , '마이클 차베즈','베라 파미가,패트릭윌슨,줄리안 힐라아드',null,'2021-06-03',
    '호러,미스터리,스릴러',112,15);
select * from movie;
/* cgv 청주성안길 영화관 정보 추가 */
insert into theater
	values('cgv 청주성안길','충청북도 청주시 상당구 북문로 1가 170-1',
    '*버스 이용 시(지하상가 정류장) 하차');
select * from theater;

/* 영화정보 확인하는 쿼리문 - 컨저링 3 */
select * from movie where mo_title like concat('%','컨저링 3','%');
select * from movie where mo_title like '%컨저링 3%';

/* 컨저링 3의 오늘(2021-06-03) 상영시간을 확인하는 쿼리문 */
select mo_title, sc_start_time from screen
	join movie
		on mo_num = sc_mo_num
			where mo_title like '%컨저링 3%' and sc_date like '%2021-06-03%';
		
/* 컨저링 3의 CGV청주성안길 지점의 상영 정보를 확인하는 쿼리문 */
select mo_title,sr_th_branch, screen.* from screen
	join movie
		on mo_num = sc_mo_num
	join screen_room
		on sc_sr_num = sr_num
			where mo_title like '%컨저링 3%' and sr_th_branch like '%cgv 청주성안길%';
select screen.* from screen
	where sc_mo_num = (select mo_num from movie where mo_title like '%컨저링 3%')
		and sc_sr_num = 
			(select sr_num from screen_room where sr_th_branch like '%cgv 청주성안길%');
            
/* CGV 청주성안길 지점의 1관의 예매가능한 좌석 정보를 확인하는 쿼리문*/
select se_name from seat
	join screen_room on sr_num = se_sr_num
		where sr_name ='1관' and sr_th_branch like '%cgv 청주성안길%';
select se_name from seat
	where se_sr_num =
		(select sr_num from screen_room where sr_th_branch like '%cgv 청주성안길%');

/* cgv 청주성안길 컨저링 3가 9:00에 있을 때 해당 영화의 선택 가능 좌석을 확인하는 쿼리문 
 해당 영화의 상영관 정보를 알아야 좌석 정보를 알 수있다.
 해당 영화 예매 내역중 예약된 좌석 현황 
 해당 영화의 예매 가능한 좌석 정보를 확인 */
-- cgv청주성안길 지점에서 오늘 9:00에 시작하는 컨저링 3 영화의 상영관의 전체 죄석
select se_name from seat
	join screen_room on sr_num = se_sr_num
    join screen on sc_sr_num = sr_num
    join movie on sc_mo_num = mo_num
		where sc_start_time like '%9:00%' 
        and sr_th_branch like '%cgv 청주성안길%'
        and sc_date like '2021-06-03%'
        and mo_title like '%컨저링 3%';
select se_name from seat
	where se_sr_num =  
	(select sr_num from screen_room join screen on sc_sr_num = sr_num
    where sr_th_branch like '%cgv 청주성안길%' 
		and sc_start_time like '%9:00%' 
		and sc_date like '2021-06-03%'
		and sc_mo_num = (select mo_num from movie where mo_title like '%컨저링 3%'));
-- cgv청주성안길 지점에서 오늘 9:00에 시작하는 컨저링 3 영화의 상영관 번호
select sr_num from screen_room join screen on sc_sr_num = sr_num
    where sr_th_branch like '%cgv 청주성안길%' 
		and sc_start_time like '%9:00%' 
		and sc_date like '2021-06-03%'
		and sc_mo_num = (select mo_num from movie where mo_title like '%컨저링 3%');
        
-- 해당 영화 예매 내역 중 예약된 좌석 현황
select se_name from seat where se_num in
	(select re_se_num from reservation where re_sc_num = ('상영시간번호'));
    
-- 해당 영화에서(오늘 9:00 컨저링 3) 예약 가능한 과젓
-- 예약 가능한 좌석은 전체 좌석에서 예약된 좌석을 제외한(포함하지 않은) 좌석들
select se_name from seat
	where se_sr_num = ('상영관번호')
    and se_name not in ('예약된 좌석명');
 -- abc123 회원이 관람했던 영화 리스트 확인\
 select mo_title from movie 
	join screen on mo_num = sc_mo_num
    join reservation on sc_num = re_sc_num
    where re_me_id = 'abc123';
 select mo_title from movie 
	where mo_num in 
    (select sc_mo_num from screen
    join reservation on sc_num = re_sc_num
    where re_me_id = 'abc123');