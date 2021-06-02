-- create database cgv_movie;
CREATE TABLE if not exists `movie` (
	`mv_num`	int	auto_increment,
	`mv_name`	varchar(30)	not NULL,
	`mv_type`	varchar(10)	not NULL,
    primary key(`mv_num`)
);

CREATE TABLE if not exists `theater` (
	`tt_num`	varchar(10)	NOT NULL,
	`tt_type`	varchar(20)	not NULL,
	`tt_address`	varchar(50)	not NULL,
    primary key(`tt_num`)
);

CREATE TABLE if not exists `play` (
	`pl_num`	int	auto_increment,
	`pl_time`	datetime not NULL,
	`pl_mv_num`	int	NOT NULL,
	`pl_tt_num`	varchar(10)	NOT NULL,
    pl_place varchar(5) not null,
    primary key(`pl_num`),
    foreign key(`pl_mv_num`) references `movie`(`mv_num`),
    foreign key(`pl_tt_num`) references `theater`(`tt_num`)
);
create table if not exists `member`(
	mb_id varchar(15) not null,
    mb_pw varchar(15) not null,
    mb_phone varchar(14) not null,
    primary key(mb_id)
);
create table if not exists ticketing(
	tk_num varchar(10) not null,
    tk_mv_num int not null,
    tk_mb_id varchar(15) not null,
    tk_date datetime not null,
    tk_pay varchar(10) not null,
    tk_peaple int not null,
    tk_seat varchar(10) not null,
    tk_ticket_num int not null, 
    primary key(tk_num),
    foreign key(tk_mv_num) references movie(mv_num),
    foreign key(tk_mb_id) references member(mb_id)
);

select * from ticketing;