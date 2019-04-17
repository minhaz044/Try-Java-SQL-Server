 Create Table /
create table student_m044(
id int NOT NULL primary key IDENTITY(1,1),
name varchar,
created_at dateTime
);
/*--------------------------------------*/


/ Alter column in Table / 
Alter table student_m044
	alter COLUMN name varchar(255);
/*--------------------------------------*/


/*Add Constraint to a table Column */
alter table student_m044 
	add constraint df_created_at default GETDATE() for created_at
/*-----------------------------------------------------------------*/


/ Add new Column in Table /
Alter table student_m044 
	Add updated_at dateTime
/*--------------------------------------*/


/*  Insert data Into Table*/
insert into student_m044(name,created_at) values ('Minhaz Uddin',GETDATE());
/*--------------------------------------*/



/*  Insert data Into Table*/
select * from student_m044;
/*--------------------------------------*/

create table sub(
id int primary key identity(1,1),
name varchar(100),
created_at datetime default GETDATE(),
);



select  * from sub



insert into sub(name) values('English'),('Matheatics'),('Histry');



create table result(
id int primary key identity(1,1),
sub_id int,
number int 
	CONSTRAINT fk_res_sub
	Foreign key (sub_id)
	references sub(id) 
);


alter table result
	add student_id int foreign key(student_id) references student_m044(id)




insert into result(sub_id,student_id,number) values(1,6,50),(3,6,75),(2,6,85),(1,7,55),(2,7,65),(3,7,25) ;
insert into result(sub_id,student_id,number) values(1,8,55),(2,8,65),(3,8,25) ;


/*  Insert data Into Table*/
select * from student_m044;
/*---------------------------*/



/ Reset Identity(Auto Increment ) Pointer /
DBCC Checkident (table_name,RESEED,StartPoint -1)
/*---------------------------------------------*/
 

 select * from result

 select student_m044.id
 from student_m044,result 
 where student_m044.id=result.student_id   
 group by result.student_id 
 
 

	select id,name 
	from student_m044
	where student_m044.id between 



	select result.student_id,avg(number) as Average
	from result
	JOIN student_m044 
	ON  student_id=student_m044.id
	group by student_id

	select student_m044.id,result.student_id,student_m044.name
	from result
	JOIN student_m044 
	ON  student_id=student_m044.id

	group by student_m044.id

	 
   
  select student_m044.id as hello, avg(result.number) as totalNumber 
  from  result,student_m044 
  where student_m044.id=result.student_id  group by result.student_id 
	
	 select result.student_id,student_m044.name
  from  result,student_m044 
  where student_m044.id=result.student_id group by result.student_id
	
select result.student_id ,avg(result.number),student_m044.name
from  result,student_m044 
where student_m044.id=result.student_id AND  group by result.student_id


  select student_m044.name,result.student_id,result.number
  from  result,student_m044 
  where student_m044.id=result.student_id group by student_id

    select student_m044.name,result.student_id,result.number
  from  result,student_m044 
  where student_m044.id=result.student_id group by student_id



  
	