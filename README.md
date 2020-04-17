# MysqlConnectionJdbc

#Queries for database

create database Student;

create table Student.student_records(roll_number int(32)auto_increment not null primary key, name varchar(100));

insert into Student.student_records value(1,"Shikha");
insert into Student.student_records value(2,"Maya");
insert into Student.student_records value(3,"Mayank");

select* from Student.student_records;
