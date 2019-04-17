CREATE  TABLE users(
id int identity(1,1) not null primary key,
userName varchar(255),
password varchar(255),
created_at datetime default GETDATE(),
updated_at datetime default GetDATE()

);

select * from users