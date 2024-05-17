create or replace procedure PUpdate(pitemname in food_tdb.itemname_fdb%type,pavailable in food_tdb.availability_ftdb%type)
IS
Begin
         update food_tdb set availability_ftdb=pavailable where itemname_fdb=pitemname; 
End;
/