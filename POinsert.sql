create or replace procedure POinsert(ptoken in order_db.token%type,pitem1 in order_db.item1%type,pitem2 in order_db.item2%type,pitem3 in order_db.item3%type,pitem4 in order_db.item4%type,pitem5 in order_db.item5%type,pcost in order_db.cost%type)
IS
Begin
         insert into order_db values(ptoken,pitem1,pitem2,pitem3,pitem4,pitem5,pcost);
End;
/