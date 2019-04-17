
/* Create Table */
create table student_m044(
id int NOT NULL primary key IDENTITY(1,1),
name varchar,
created_at dateTime
);
/*--------------------------------------*/


/* Alter column in Table */ 
Alter table student_m044
	alter COLUMN name varchar(255);
/*--------------------------------------*/


/*Add Constraint to a table Column */
alter table student_m044 
	add constraint df_created_at default GETDATE() for created_at
/*-----------------------------------------------------------------*/


/* Add new Column in Table */
Alter table student_m044 
	Add updated_at dateTime
/*--------------------------------------*/


/*  Insert data Into Table*/
insert into student_m044(name,created_at) values ('Minhaz Uddin',GETDATE());
/*--------------------------------------*/



/*  Insert data Into Table*/
select * from student_m044;
/*--------------------------------------*/


select * from student_m044 where id=48


create table sub(
id int primary key identity(1,1),
name varchar(100),
created_at datetime default GETDATE(),
);

select  * from result


select  * from sub


delete from student_m044 where id >8

insert into sub(name) values('English'),('Matheatics'),('Histry');



create table result(
id int primary key identity(1,1),
sub_id int,
number int 
	CONSTRAINT fk_res_sub
	Foreign key (sub_id)
	references sub(id) 
);


/*  Insert data Into Table*/
select * from student_m044 order by id DESC;
/*---------------------------*/


 

select result.student_id  ,AVG(result.number) as Number 
from result
group by result.student_id  
 
 join student_m044


 
 select student_m044.id,student_m044.name,number from student_m044,
 (select result.student_id, avg(number) as Number from student_m044,result 
 where student_m044.id=result.student_id
 group by student_id ) as results
 where student_m044.id=results.student_id
 

 

 order by student_m044.name
 
    student_m044.name 


 group by result.student_id




  student_m044.name













update student_m044 Set name='',updated_at=GETDATE() output inserted.id,inserted.name,inserted.created_at,inserted.updated_at  where id="+this.id+"";
			Connection con=DBCon.getConnection();

insert into sub(name)
output inserted.name,inserted.id
values('Hello')
select * from sub


update sub 
output updated.name,updated.id
set name='Minhaz'
where id=7
INSERT INTO Table_Products (ID, Product_Name, Product_ID(Auto Increment) 
VALUES (ID from TABLE_ID, SomeProduct, Increment)



 INSERT #a(x) 
  OUTPUT inserted.identity_column 
  VALUES('b'),('c');


  update student_m044 set name='Minhaz', created_at='2019-04-20' where id=14; 
  select * from student_m044;
  \






  select customer.name,salesmen .name,salesmen .city
  from  customer,salesmen
  where salesmen .city=customer.city






  select cust_name,name
  from customer,salesman
  where customer.salesman_id=salesman.salesman_id         






