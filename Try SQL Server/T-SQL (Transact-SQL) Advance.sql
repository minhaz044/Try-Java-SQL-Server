
 --===========================Author Info===========================
 --Author Name:Minhaz Uddin.
 --Created At:16/04/2019
 --Updated At :16/04/2019
 --=================================================================



--=========================CREATE PROCEDURE=======================--
Create procedure spuser_getAll
AS
BEGIN
 SET NOCOUNT ON;
SELECT * FROM users
END

--=================ALTER PROCEDURE===============================--
ALTER PROCEDURE spuser_GetByLastName
@id INT
AS
BEGIN
SELECT id,userName,password
FROM users
WHERE users.id=@id
END 


--========================CREATE ROLE=======================
CREATE ROLE STOREPROCEDUREEXECUTION

CREATE ROLE dbStoredProcedureAccess

--=====================DROP ROLE=============================
DROP ROLE STOREPROCEDUREEXECUTION
--===========================GRANT ROLE PERMISSON=================
GRANT EXECUTE TO dbStoredProcedureAccess




--===============CREATE PROCEDURE  ===================

IF OBJECT_ID('spusers_Insert') is not null
BEGIN 
DROP PROCEDURE spusers_Insert
END
GO
CREATE PROCEDURE spusers_Insert
@userName VARCHAR(255),
@password VARCHAR(255)
AS
BEGIN 
DECLARE  @created_at DATETIME=GETDATE()
DECLARE  @updated_at DATETIME=GETDATE()
DECLARE  @userId int =null
INSERT INTO users(userName,password,created_at,updated_at)
VALUES(@userName,@password,@created_at,@updated_at)
SET @userId =SCOPE_IDENTITY()
SELECT id,userName=@userName,password=@password ,created_at=@created_at 
FROM users
WHERE id=@userId
END



IF OBJECT_ID('spusers_GetAll') is not null
BEGIN
DROP PROC spusers_GetAll
END
GO
CREATE PROC spusers_GetAll
AS
BEGIN
SELECT userName,created_at,updated_at
FROM users
END


IF OBJECT_ID('spusers_GetByID') is not null
BEGIN
DROP PROC spusers_GetByID
END
GO
CREATE PROC spusers_GetByID
@userId int
AS
BEGIN
SELECT *
FROM users
WHERE id=@userId
END





IF OBJECT_ID('spusers_DeleteByID') is not null
BEGIN
DROP PROC spusers_DeleteByID
END
GO
CREATE PROC spusers_DeleteByID
@userId int
AS
BEGIN
DELETE 
FROM users
WHERE id=@userId
END






--=============================Update Procedure==========================
IF OBJECT_ID('spusers_Update') is not null
BEGIN
DROP PROC  spusers_Update
END
GO
CREATE PROC spusers_Update
@userId int,
@userName VARCHAR(255)=null,
@password VARCHAR(255)=NULL
AS
BEGIN
IF(@userName is not Null)
BEGIN
IF ((SELECT count(*) FROM users WHERE id!=@userId AND userName=@userName)=0)
	BEGIN
	UPDATE users
	SET userName=@userName ,password=@password,updated_at=GETDATE()
	WHERE id=@userId
	END
ELSE
BEGIN
	PRINT 'This UserName Is Already Taken' 
END
END
ELSE
	BEGIN
	UPDATE users 
	SET password=@password,updated_at=GETDATE()
	WHERE id=@userId
	END
END



--=======================Dummmy Sql Query Section=====================--


select * from users
GO 1
IF OBJECT_ID('spusers_Insert') is null
BEGIN 
 select (2+2) as number
END


EXEC spuser_GetByLastName @id=1
EXEC spuser_GetByLastName 1




IF OBJECT_ID('dummy','P') is not null
BEGIN
DROP PROC  dummy
END
GO
CREATE PROC dummy
@Hello varchar =null
AS
BEGIN
DECLARE @result1 TABLE (a INT, b varchar(255), c  varchar(255))=(SELECT id,userName,password FROM users WHERE id=4) 
END


EXEC dummy








--=======================================================================
--===============================IF=====================================

BEGIN 
IF(2=2)
PRINT'IS IN IF STATEMENT'
END

--===============================================
--==============IF ELSE===========================
BEGIN 
IF(2=2)
BEGIN
PRINT'IS IN IF STATEMENT'
PRINT 'IS IN LATE IF'
END
ELSE
PRINT 'IS IN ELSE'
END
--=================================================


--===================ELSE IF=======================
BEGIN
DECLARE @a int =200
IF @A=100
BEGIN
PRINT  @A
END
ELSE IF @a=200
BEGIN 
PRINT @a
END
ELSE 
BEGIN
PRINT @a
END
END
--====================================================

--==============================WHILE LOOP================

BEGIN
DECLARE @i int =0 
WHILE(@i<=5)
BEGIN
PRINT @i
SET @i=@i+1
IF(@i=3)
CONTINUE
END
END
--=========================WHILE LOOP WITH CONTINUE===========
BEGIN
DECLARE @j int =0 
WHILE(@j<=5)
BEGIN
SET @j=@j+1
IF(@j=3)
BEGIN
CONTINUE
END
PRINT @j
END
END

--==============================Assign Value To Declare Variable======================== 
BEGIN
DECLARE @id int ,@userName VARCHAR(255),@password VARCHAR(255)
SELECT @id=users.id,@userName=users.userName,@password=users.password
FROM users
WHERE id=3
END

--=====================================================================================

--===================================T-SQL Custom Data Type(Explicit)=======================

BEGIN 
DECLARE @user TABLE(
			id int,
			name varchar(255),
			pass varchar(255) 
			)
INSERT INTO @user(id,name,pass)
Select id,userName,password
FROM users 
WHERE id=3
Select * from @user
END
--===================================T-SQL Custom Data Type(Implicit)=======================
--========We Need to use # sign to Assign Value into a Table With Out Declaring ====
IF OBJECT_ID('user','U') is not null
DROP TABLE #user
GO
BEGIN 
Select id,userName,password INTO #user
FROM users 
WHERE id=3
UPDATE #user
SET userName='New Name'
WHERE id=3
Select * from #user
END



--=========================================Curser=====================
--==================================Advance=====================
IF (CURSOR_STATUS('LOCAL','Pointer') >=-1)
DEALLOCATE Pointer
GO
BEGIN
SET NOCOUNT ON 
DECLARE @counter int,@id  int,@name VARCHAR(255),@pass VARCHAR(255) 
DECLARE Pointer CURSOR LOCAL SCROLL FOR
	SELECT id,userName,password
	FROM users  
OPEN Pointer 
FETCH FIRST FROM Pointer --1St Data 
FETCH LAST FROM Pointer --LAst Data 
FETCH PRIOR FROM Pointer --Next From Last Execution
FETCH NEXT FROM Pointer
INTO @id, @name, @pass--Previous From Last Execution
Print 'ID : '+ CAST(@id AS VARCHAR(255))+' Name: ' + CAST(@name AS VARCHAR(255))+' Password: '+ CAST(@pass AS VARCHAR(255))
CLOSE Pointer 
DEALLOCATE Pointer
END

--==========================Exception Handeling In Sql Server ====================

IF OBJECT_ID('spExceptionHandeling','P') is not null
BEGIN
DROP PROC spExceptionHandeling
END
GO
CREATE PROC spExceptionHandeling
@number1 int,
@number2 int
AS
BEGIN 
BEGIN TRY
PRINT 'RESULT :'+CAST(@number1/@number2 AS VARCHAR(255))
END TRY
BEGIN CATCH
PRINT 'INVALID CALCULATION'
PRINT 'Error Number :'+CAST(ERROR_NUMBER() AS VARCHAR(255))
PRINT 'Error Message:'+CAST(ERROR_MESSAGE() AS VARCHAR(255))
END CATCH
END

--===========================Function In SQL Server=================== 

IF OBJECT_ID('fSquare') is not null
BEGIN
DROP FUNCTION  fSquare
END
GO
CREATE FUNCTION fSquare(@number int)
RETURNS int
AS
BEGIN
RETURN @number*@number
END


--=======================CAll A function ==========
SELECT dbo.fSquare(50) as SQUARE





--=======================Dummy Code=====================
CREATE TABLE Account(
id int identity(1,1) primary key not null,
amount float,
created_at datetime default GETDATE(),
updated_at datetime default GETDATE()
)
drop table Account
insert into Account(amount) VALUES (25000.0),(25000.0)
SELECT * FROM Account


CREATE TABLE TransactionInfo(
id int identity (1,1) primary key not null,
userId int foreign key references Account(id),
tDate datetime default Current_timestamp,
tType varchar(255),
tBranch Varchar(255),
tAmount float
);
SELECT * FROM Account 

SELECT * FROM TransactionInfo


delete from TransactionInfo where id>0




==================================================================
--============================TRANSACTION IN SQL (IMPORTANT)==================
==============================IMPORTANT=====================================


--==============With Out Transaction =====================
IF OBJECT_ID('spAccountTransfer','P') is not null
BEGIN
DROP PROC spAccountTransfer
END
GO 
CREATE PROC spAccountTransfer
@sender int,
@reciver int,
@amount float
AS
BEGIN
IF((SELECT count(*) FROM Account WHERE id=@sender AND amount>=@amount)=1 AND (SELECT count(*) FROM Account WHERE id=@reciver)=1)
BEGIN
UPDATE Account 
SET Account.amount=Account.amount-@amount
WHERE id=@sender 

PRINT 2/0

UPDATE Account 
SET Account.amount=Account.amount+@amount
WHERE id=@reciver 
END
ELSE
BEGIN
PRINT ' INVALID TRANSACTION '
END
END


--====================== Declaring and using transactions==============
1.Began
	--begin tran
2.Finish 
	--Commit
3.RollBack
	--RollBack

--====================Demo Transaction =============

PRINT @@TRANCOUNT  
--  The BEGIN TRAN statement will increment the  
--  transaction count by 1.  
BEGIN TRAN  
    PRINT @@TRANCOUNT  
    BEGIN TRAN  
        PRINT @@TRANCOUNT  
--  The COMMIT statement will decrement the transaction count by 1.  
    COMMIT  
    PRINT @@TRANCOUNT  
COMMIT  
PRINT @@TRANCOUNT  
===========================================================================
--=============================Transaction Handeling======================


IF OBJECT_ID('spAccountTransfer','P') is not null
BEGIN
DROP PROC spAccountTransfer
END
GO 
CREATE PROC spAccountTransfer
@sender int,
@reciver int,
@amount float,
@branch varchar(255),
@Type varchar(255)
AS
BEGIN
IF((SELECT count(*) FROM Account WHERE id=@sender AND amount>=@amount)=1 AND (SELECT count(*) FROM Account WHERE id=@reciver)=1)
BEGIN
PRINT '@@TranCount :'+CAST(@@trancount AS VARCHAR(5));
PRINT 'TRANSACTION BEGAN';
BEGIN TRAN
BEGIN TRY
UPDATE Account 
SET Account.amount=Account.amount-@amount
WHERE id=@sender;
INSERT INTO TransactionInfo(userId,tDate,tType,tBranch,tAmount)
VALUES(@sender,GETDATE(),@Type,@branch,0-@amount);
UPDATE Account 
SET Account.amount=Account.amount+@amount
WHERE id=@reciver;
INSERT INTO TransactionInfo(userId,tDate,tType,tBranch,tAmount)
VALUES(@reciver,GETDATE(),@Type,@branch,@amount);
IF(@@TRANCOUNT >0)
BEGIN
	COMMIT TRAN
	PRINT 'Transaction Comited'
END
END TRY
BEGIN CATCH
PRINT 'ERROR :'+CAST(ERROR_MESSAGE() AS VARCHAR(255))
IF(@@TRANCOUNT >0)
BEGIN
	ROLLBACK TRAN
	PRINT 'ROLLBACKED'
END
END CATCH
END
ELSE
BEGIN
PRINT ' INVALID TRANSACTION '
END
END




--===============================================================


 --==========================EXECUTE PROCEDURE=================
exec spuser_getAll

EXEC spusers_Insert 'Minhaz 055','120080'

EXEC spusers_Update @userId=2,@password='155448'

EXEC spusers_GetByID @userId=3

EXEC spusers_DeleteByID @userId=2

EXEC spExceptionHandeling 100

EXEC spAccountTransfer 1,2,25000

EXEC spAccountTransfer @sender=2 ,@reciver=1 ,@amount=1500.73 ,@branch='Feni',@Type='SR'


