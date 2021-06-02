-- create database salary_man;
create table if not exists worker (
	wk_num varchar(20) not null,
    wk_name varchar(50) not null,
    wk_term varchar(10) not null,
    primary key(wk_num)
);

CREATE TABLE if not exists `salary` (
	`sl_num`	varchar(20)	NOT NULL,
	`sl_money`	int	not NULL,
	`sl_wk_num`	varchar(20)	NOT NULL,
	`sl_rk_num`	varchar(20)	NOT NULL,
    primary key(sl_num),
    foreign key(sl_wk_num) references worker(wk_num),
    foreign key(sl_rk_num) references `rank`(rk_num)
);

CREATE TABLE if not exists `rank` (
	`rk_num`	varchar(20)	NOT NULL,
	`rk_name`	varchar(10)	not NULL,
    primary key(`rk_num`)
);
-- insert into worker(wk_num,wk_name,wk_term)
	-- values ('a01','홍길동','2년');
select * from worker;
select * from worker 
	join salary 
		on wk_num = sl_wk_num;