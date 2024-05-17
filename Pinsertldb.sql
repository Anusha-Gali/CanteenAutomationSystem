create or replace procedure Pinsertldb(pusername in login_db.username_ldb%type,ppassword in login_db.password_ldb%type)
IS
Begin
insert into login_db values (pusername,ppassword);
End;
/