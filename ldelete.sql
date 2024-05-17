create or replace procedure ldelete(ptokenid in order_db.token%type)
IS
Begin
         delete from order_db where token=ptokenid;
End;
/