drop database if exists microServices0;
create database microServices0 character set UTF8;
use microServices0;
create table dept(
    deptNo bigint not null primary key auto_increment,
    dName varchar(60),
    dbSource varchar(60)
);

insert into dept(dName, dbSource) values ('开发部', database());
insert into dept(dName, dbSource) values ('人事部', database());
insert into dept(dName, dbSource) values ('财务部', database());
insert into dept(dName, dbSource) values ('市场部', database());
insert into dept(dName, dbSource) values ('运维部', database());