REM  Grant ad User DataBase di Progetto
REM  Parmetri: 1 = Db User
REM            2 = DB PassWord
REM            3 = Progetto
REM            4 = Default TableSpace
REM            5 = Temporary TableSpace

grant CONNECT, RESOURCE TO &1 identified by &2;
grant ALTER SESSION to &1;
grant CREATE DATABASE LINK to &1;
grant CREATE PROCEDURE to &1;
grant CREATE SEQUENCE to &1;
grant CREATE SYNONYM to &1;
grant CREATE TABLE to &1;
grant CREATE TRIGGER to &1;
grant CREATE VIEW to &1;
grant CREATE ROLE to &1;

DEFINE P1=&3
DEFINE P1=&4
alter user &1 default tablespace &P1
/
DEFINE P1=TMP
DEFINE P1=&5
alter user &1 temporary tablespace &P1
/

exit
