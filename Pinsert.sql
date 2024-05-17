create or replace procedure Pinsert(pserialnumber in details_db.serialnumber%type,puserid in details_db.userid_ldb%type,pname in details_db.name_ddb%type,pbranch in details_db.branch_ddb%type,pemail in details_db.email_ddb%type,pphonenumber in details_db.phonenumber_ddb%type,pusername in details_db.username_ldb%type)
IS
Begin
         insert into details_db values(pserialnumber,puserid,pname,pbranch,pemail,pphonenumber,pusername);
End;
/