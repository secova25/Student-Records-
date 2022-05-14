<?php
	//definding varriables that will be used for new users. 
	$firstName = $_POST['fname'];
	$middleName = $_POST['mname'];
	$lastName = $_POST['lname'];
	$firstName = $_POST['fname'];
	$userName = $_POST['username'];
	$password = $_POST['password'];
	$passwordcon = $_POST['passwordcon'];
	
	//connecting to database.
	$conn = new mysqli('localhost','root','1S#hou678po9','studentrecords')
	if($conn->connect_error){
		die('Connection Failed: '.$conn->connect_error);
	}else{
		$newUser = $conn->prepare("INSERT INTO userprofile(FNAME,MNAME,LNAME,USERNAME,PASSWORD)
			values(?,?,?,?,?,?)");
		newUser->bind_param("ssssss",$firstName,$middleName,$lastName,$firstName,$userName,$password);
		$newUser->execute();
		echo "Successfully created a new account.";
		newUser->close();
		conn->close();
	}	
?>