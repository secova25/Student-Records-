//this code was provided by: https://www.mysqltutorial.org/mysql-nodejs/connect/

	let mysql = require('mysql');
	
	//this will create a connect for mysql localhost 
	let con = mysql.createConnection({
	  host: 'localhost',
	  user: 'root',
	  password: '1S#hou678po9'
	  database: 'studentrecords'
	});
	
	//testing opening  connection.
	con.connect(function(err)){
		if(err){
			return console.error('error:' + err.message);
		}
		console.log('Connected properly to MySQL server.')
	}
	//testing cosing connection.
	con.end(function(err){
		if(err){
			return console.log('error:' + err.message);
		}
			
		console.log('Close the database connection.');	
		
	});