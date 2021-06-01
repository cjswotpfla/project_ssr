-- create database fruit_shop;
create table if not exists seller(
	sl_num varchar(20) not null,
	sl_name varchar(50) not null,
	sl_conum int,
	sl_company varchar(40),
    primary key(sl_num)
  );
create table if not exists fruit(
	fr_num varchar(20) not null,
	fr_name varchar(20) not null,
    fr_date date not null,
    fr_origin varchar(20) not null,
    fr_organic char(1),
    fr_stock int not null,
    fr_price int not null,
    primary key(fr_num)
);
create table if not exists sell(
    se_num varchar(20) not null,
	se_count int not null,
	se_date date not null,
	se_sl_num varchar(20) not null,
	se_fr_num varchar(20) not null,
    primary key(se_num),
    foreign key(se_sl_num) references seller(sl_num),
	foreign key(se_fr_num) references fruit(fr_num)
);
create table if not exists vender(
	vd_num varchar(20) not null,
	vd_name varchar(50) not null,
	vd_address varchar(50) not null,
	vd_company varchar(40) not null,
    primary key(vd_num)
);
create table if not exists delivary(
	dv_num varchar(20) not null,
	dv_vd_num varchar(20) not null,
    dv_fr_num varchar(20) not null,
    dv_date date not null,
    dv_count int not null,
    primary key(dv_num),
	foreign key(dv_vd_num) references vender(vd_num),
	foreign key(dv_fr_num) references fruit(fr_num)
);