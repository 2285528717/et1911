DROP TABLE if EXISTS t_springmvc_dict;
CREATE TABLE IF not EXISTS t_springmvc_dict(
	id int PRIMARY key auto_increment,
	group_id VARCHAR(32) not null COMMENT '字典分组',
	name VARCHAR(32) not null COMMENT '字典名称',
	value VARCHAR(12) not null COMMENT '字典值',
	sort int not null COMMENT '排序字段'
);

insert into t_springmvc_dict VALUES(null,'level','小型车','1',1);
insert into t_springmvc_dict VALUES(null,'level','中型车','2',2);
insert into t_springmvc_dict VALUES(null,'level','SUV','3',3);

insert into t_springmvc_dict VALUES(null,'gearbox','自动','1',1);
insert into t_springmvc_dict VALUES(null,'gearbox','手动','2',2);

insert into t_springmvc_dict VALUES(null,'output_volume','1.0L','1',1);
insert into t_springmvc_dict VALUES(null,'output_volume','1.1L ~ 1.6L','2',2);
insert into t_springmvc_dict VALUES(null,'output_volume','1.7L ~ 2.0L','3',3);
insert into t_springmvc_dict VALUES(null,'output_volume','2.0L以上','4',4);

select id,group_id as groupId,name,value,sort from 
		t_springmvc_dict where group_id = 'level' order by sort
	
drop table if EXISTS t_springmvc_car;
CREATE TABLE if not EXISTS t_springmvc_car(
	id int PRIMARY key auto_increment,
	brand VARCHAR(64) not null COMMENT '品牌',
	series VARCHAR(64) not null COMMENT '车系',
	price INT not null COMMENT '价格',
	licensing_time VARCHAR(7) not null COMMENT '上牌时间',
	level VARCHAR(1) COMMENT '级别',
	gearbox VARCHAR(1) COMMENT '变速箱',
	output_volume VARCHAR(1) COMMENT '排量',
	mileage int COMMENT '里程(万公里)',
	location VARCHAR(64) COMMENT '归属地',
	pic VARCHAR(128) COMMENT '图片地址',
	summary VARCHAR(512) COMMENT '概述',
	create_time datetime COMMENT '创建时间'	
);