create or replace procedure Pdelete(pitemname in food_tdb.itemname_fdb%type)
IS
Begin
         delete from food_tdb where itemname_fdb=pitemname;
End;
/