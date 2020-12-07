Insert Into ACCOUNT Values(11,'Activated','12/06/2020','rohit@gmail.com','rohit','M','pawar','123','12345678','Case Worker','11111');
Insert Into ACCOUNT Values(12,'Activated','12/07/2020','hitesh@gmail.com','hitesh','M','pawar','1234','12445678','Admin','22222');

Insert Into PLAN Values(11,'Activated','11/02/2020','Supplementary Nutrition Assistance Program','SNAP','01/01/2020');
Insert Into PLAN Values(12,'Activated','12/11/2020','Qualified Health Insurance Plan', 'QHP','01/01/2020');
 

Insert Into APPLICATION Values('AR11','Activated','11/01/2020','rohit@gmail.com','rohit','M','pawar','12345','4321');
Insert Into APPLICATION Values('AR12','Activated','11/01/2020','rohit@gmail.com','rohit','M','pawar','12345','4321');

DECLARE
	i number:=1;
	ed_trace_id number:=100;
	case_no number:=1;
BEGIN
	WHILE i <=5000 LOOP
 		insert into ELIGIBILITY_DETAILS values(ed_trace_id,'$600',case_no,sysdate,null,null,'SNAP',sysdate,'AP',null);
 		i:= i + 1;
 		ed_trace_id:=ed_trace_id +1;
 		case_no:=case_no+1;
 	END LOOP;
END;
/
