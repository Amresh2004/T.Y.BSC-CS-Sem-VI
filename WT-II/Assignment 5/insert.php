<?php
// Connect to PostgreSQL database
$host = "localhost";
$dbname = "amresh";
$user = "postgres";
$password = "8624807723"; // Replace with your PostgreSQL password

$conn = pg_connect("host=$host dbname=$dbname user=$user password=$password");

// Check connection
if (!$conn) {
    die("Connection failed: " . pg_last_error());
}

// Insert 5 more records (if not inserted already)
$sql = "INSERT INTO student (rollno, name, class) VALUES 
(1001,'Frank', '10A'),
(200,'Grace', '10B'),
(32,'Hannah', '10C'),
(43,'Ivy', '10A'),
(55,'Jack', '10B')";

$result = pg_query($conn, $sql);

if ($result) {
    echo "New records inserted successfully!";
} else {
    echo "Error: " . pg_last_error();
}

// Close the connection
pg_close($conn);
?>
