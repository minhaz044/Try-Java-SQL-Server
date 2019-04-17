Create table salesman(
 salesman_id int identity(1,1) primary key not null,
  name  varchar(255),
  city  varchar(255),
  commission float
)
insert into salesman(name,city,commission) Values
 ('James Hoog ', 'New York',0.15),
('Nail Knite','Paris',0.13),
 ('Pit Alex','London',0.11),
 ('Mc Lyon','Paris',0.14),
('Lauson','Hen',0.12),
('Paul Adam','Rome',0.13)

select * from salesman

Create table customerM(
customer_id int identity(1,1) primary key not null,
cust_name varchar(255),
city varchar(255),
grade int,
salesman_id int foreign key references salesman(salesman_id)
)


insert into customerM(cust_name,city,grade,salesman_id) Values
('Nick Rimando','New York',100,1),
('Graham Zusi','California',200,2),
('Brad Guzan','London',200,5),
('Fabian Johns','Paris',300,6),
('Brad Davis','New York',200,1),
('Geoff Camero','Berlin',100,3),
('Julian Green','London',300,2),
('Jozy Altidor','Moscow',200,4)

select * from customerM



Create table ordersM(           
ord_no int identity(1,1) primary key not null,
purch_amt float,
ord_date datetime default GETDATE(),
customer_id int foreign key references customerM(customer_id),
salesman_id int foreign key references salesman(salesman_id)
)


insert into ordersM(purch_amt,ord_date,customer_id,salesman_id) Values
(150.5,'2012-10-05',5,2),
(270.65,'2012-09-10',1,5),
(65.26,'2012-10-05',2,1),
(110.5,'2012-08-17',8,3),
(948.5,'2012-09-10',5,2),
(2400.6,'2012-07-27',7,1),
(5760,'2012-09-10',2,1),
(1983.43,'2012-10-10',5,6),
(2480.4,'2012-10-10',8,3),
(250.45,'2012-06-27',8,2),
(75.29,'2012-08-17',3,6),
(3045.6,'2012-04-25',2,1)



select * from ordersM 


select * 
from salesman 
where city='Paris' OR city='London'

select * 
from salesman 
where city NOT IN('Paris','London')

select * 
from salesman 
where name not between 'A' AND 'K' 

select * 
from customerM 
where customer_id between 5 AND 7
order by customer_id 


create table text(
id int identity(1,1),
text varchar(255)
)
 
 
 
 insert into text(text) values('______'),('Minhaz_Uddin'),('_hello') 

 select * from text

select *
from text
where text  like '[_]%'
  


SELECT salesman.name,customerM.cust_name,customerM.city 
from salesman,customerM
where customerM.city=salesman.city




SELECT customerM.customer_id,customerM.cust_name,salesman.name,
from salesman,customerM
where customerM.city=salesman.city


select * from ordersM



select *
from  ordersM,customerM
where ordersM.customer_id=customerM.customer_id


select * 
 from salesman
 right Join customerM on customerM.salesman_id=salesman.salesman_id


select a.ord_no,a.purch_amt,b.cust_name,b.city
from ordersM as a,customerM as b
where  a.purch_amt between 500 AND 2000 AND a.customer_id=b.customer_id


select b.cust_name,a.name
from salesman as a,customerM as b
where b.salesman_id=a.salesman_id

select b.cust_name,a.name
from salesman as a
inner join customerM as b
 ON b.salesman_id=a.salesman_id

 select b.cust_name,a.name
from salesman as a,customerM as b
where b.salesman_id=a.salesman_id AND a.commission >.12 AND a.city=b.city


create table A(
N int )

create table B(
M varchar(255) )

insert  into A(N) Values (1),(2),(3),(4),(5),(6),(7),(8)
insert  into B(M) Values ('a'),('b'),('c'),('d'),('e'),('f'),('g'),('h')

Select * 
From A
INNER JOIN B 
ON 1=1

alter table A
add name varchar default (SELECT * from A  )

