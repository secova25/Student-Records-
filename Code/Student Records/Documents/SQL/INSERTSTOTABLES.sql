--The examples below are to insert into an existing table using MySQL and to use PostgreSQL state 
--INSERT INTO "secova25/studentrecords"."table name"
--	VALUES(given values shown below.);

INSERT INTO userinfo(fname,mname,lname,username,password)
	VALUES('Samantha', 'T', 'Lurance', 'stlur23', 'student1@gmail.com');

INSERT INTO userinfo(fname,mname,lname,username,password)
	VALUES('Tim', 'P', 'Queens', 'Tpque65', 'student2@gmail.com');
    
INSERT INTO userinfo(fname,mname,lname,username,password)
	VALUES('Admin', 'profile', 'control', 'admin1', 'password');
    
INSERT INTO records(fname,mname,lname,username,classname,credittype,creditamount)
	VALUES('Samantha', 'T', 'Lurance', 'stlur23', 'HISTORY of Eastern Religion','COLLEGE',3);
 
INSERT INTO records(fname,mname,lname,username,classname,credittype,creditamount)
	VALUES('Samantha', 'T', 'Lurance', 'stlur23', 'Chemistry','HIGHSCHOOL',1);
   
INSERT INTO records(fname,mname,lname,username,classname,credittype,creditamount)
	VALUES('Tim', 'P', 'Queens', 'Tpque65', 'Introduction To Computer Science','COLLEGE',3);
 
INSERT INTO records(fname,mname,lname,username,classname,credittype,creditamount)
	VALUES('Tim', 'P', 'Queens', 'Tpque65', 'Algebra 1','HIGHSCHOOL',1);
    

