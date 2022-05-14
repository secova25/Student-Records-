<?php
	//storing typed for each 
	$userName = $_POST['username'];
	$password = $_POST['password'];
	
	//connecting to database.
	$conn = new mysqli('localhost','root','1S#hou678po9','studentrecords')
	if($conn->connect_error){
		die('Connection Failed: '.$conn->connect_error);
	}else{
		$currentUser = $conn->prepare("SELECT * from userprofile WHERE USERNAME = $userName);"  
		$currentUser->execute();
		echo "Successfully created a new account.";
		currentUser->close();
		conn->close();
	}
?>