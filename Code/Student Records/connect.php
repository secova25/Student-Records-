<?php
	//Code given by : https://code.tutsplus.com/articles/read-a-csv-to-array-in-php--cms-39471
	
	//this function will be use to store data found in a csv file into an array.
	function array2csv($fileCSV){
		$CSVFile = fopen($fileCSV,'r'); //reading the str.csv file.
		
		//this while loop will help in storing all the rows into an array.
		while(!feof($CSVFile)){
	       $lines[] = fgetcsv($file_to_read, 1000, ',');
		}
 
		fclose($file_to_read); //
		return $lines;
		
	}
	
	function locateClass($username){
		//these variables will be used to display information about a specific student records.
		$ArrayUsers[] = array2csv('str.csv');
		$ArrayClasses[] = array2csv('str1.csv');
		
		$size = count($ArrayUsers);
		$size2 = count($ArrayClasses);
		
		//This outer for loop will find the username first, middle, and last name. 
		for($c = 0; $c < size; $c++){
			
			$x = 0; //iteration value.
			
			//used in comparing the given username with the stored ArrayUsers.
			if($ArrayUsers[c] == $username){
				
				echo "<p> Fname, Mname, Lname courses are: <br /></p>\n";
				
				//this inner while loop will be use to print out all the students records.
				while($x < size2){
					echo "Class Name: <br /></p>\n"; //Class Name,
					echo "Class Type: <br /></p>\n"; //Class Type.
					echo "Credit Number: <br /></p>\n"; //Class Number.
				}
			}
		}
	}
?>