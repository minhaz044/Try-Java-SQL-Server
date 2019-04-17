

Create table WorkerM(
worker_id  int primary key identity(1,1) not null,
first_name varchar(255),
last_name varchar(255),
salary float ,
joining_date datetime,
department  char(25)
);
insert into WorkerM(first_name,last_name,salary,joining_date,department) 
values('Minhaz','Uddin',60000,'02-02-2019','Trainee'),
	  ('xyz','abc',6000,'02-05-2018','HR'),
	  ('Mr','John',6000,'02-05-2017','DevelopMent'),
	  ('Hello','Uddin',160000,'02-05-2016','Tech Lead'),
	  ('Mainul','Sekh',60000,'02-05-2018','Treaning'),
	  ('Refat','',70000,'02-02-2019','DevelopMent')

insert into WorkerM(first_name,last_name,salary,joining_date,department) 
values('Minhaz','Uddin',60000,'02-05-2018','Trainee'),
	  ('Minhaz','Uddin',60000,'02-05-2018','Trainee')


SELECT * FROM WorkerM


CREATE TABLE BonusM(
	worker_ref_id INT FOREIGN KEY (worker_ref_id) REFERENCES WorkerM(worker_id) ON DELETE CASCADE,
	bonus_amount INT,
	bonus_date DATETIME,
);

insert into BonusM(worker_ref_id,bonus_amount,bonus_date) 
values(1,50)






create table TitleM(
worker_ref_id INT foreign key references WorkerM(worker_id) on DELETE CASCADE,
worker_title varchar(255),
affected_from daTETIME,
);

insert  into TitleM(worker_ref_id,worker_title,affected_from)
values(1,'Trainee Software Engineer',25-02-2019),
	  (2,'Trainee HR',25-02-2019),
 	  (3,'Jr Software Engineer',25-02-2019),
	  (4,'Manager',25-02-2019),
	  (5,'Trainer',01-03-2019),
	  (6,'Sr Software Engineer',25-02-2019)

select * from TitleM


/*
Q-1. Write An SQL Query To Fetch Worker Names With Salaries >= 50000 And <= 100000.
|*/
select (first_name + first_name)  as name,salary
from WorkerM
where salary between   50000 AND 100000

/*
Q-2. Write An SQL Query To Fetch The No. Of Workers For Each Department In The Descending Order.
|*/

select  department as Department,count(department) as TotalEmployee
from WorkerM
group by department order by department desc

/*
Q-3. Write An SQL Query To Print Details Of The Workers Who Are Also Managers.
|*/

select * 
from WorkerM, TitleM
where WorkerM.worker_id=TitleM.worker_ref_id AND TitleM.worker_title='Manager'


/*
Q-4. Write An SQL Query To Fetch Duplicate Records Having Matching Data In Some Fields Of A Table.
|*/

select joining_date
from WorkerM 
group by joining_date
Having count(joining_date)>1


select * 
from workerM 
where joining_date in(select joining_date 
									from workerM
									group by (joining_date)
									having count(joining_date)>1)




/*
Q-5. Write An SQL Query To Show The Top N (Say 10) Records Of A Table.
*/

select top 2 * 
from WorkerM