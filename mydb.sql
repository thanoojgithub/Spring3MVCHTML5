select * from mydb.BOOK;

select * from mydb.AUTHOR;

select * from mydb.AUTHOR_BOOK;

create table mydb.Customer (CID BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), firstName VARCHAR(50) NOT NULL UNIQUE, LastName VARCHAR(50)  NOT NULL UNIQUE, email VARCHAR(100) NOT NULL UNIQUE)

delete from mydb.CUSTOMER;

select * from mydb.CUSTOMER;