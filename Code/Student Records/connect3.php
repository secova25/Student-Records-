<?php
$host= 'db.bit.io';
$port = '5432'
$db = 'bitdotio';
$user = 'secova25_demo_db_connection';
$password = '3pR2Q_z9fkkxAPw8xZf8mz9xD4ghY'; // change to your password

try {
	$dsn = "pgsql:host=$host;port=$port;dbname=$db;";
	// make a database connection
	$pdo = new PDO($dsn, $user, $password, [PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION]);

	if ($pdo) {
		echo "Connected to the $db database successfully!";
	}
} catch (PDOException $e) {
	die($e->getMessage());
} finally {
	if ($pdo) {
		$pdo = null;
	}
}


?>