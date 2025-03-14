<?php
$host = "localhost";
$dbname = "amresh";
$user = "postgres";
$password = "8624807723";

$conn = pg_connect("host=$host dbname=$dbname user=$user password=$password");

if (!$conn) {
    die("Connection failed: " . pg_last_error());
}

$sql = "SELECT * FROM student ORDER BY rollno ASC";
$result = pg_query($conn, $sql);

echo "<h2>Student Records</h2>";
echo "<table border='1' cellpadding='10'>";
echo "<tr><th>Roll No</th><th>Name</th><th>Class</th></tr>";

if (pg_num_rows($result) > 0) {
    while ($row = pg_fetch_assoc($result)) {
        echo "<tr><td>" . $row["rollno"] . "</td><td>" . $row["name"] . "</td><td>" . $row["class"] . "</td></tr>";
    }
} else {
    echo "<tr><td colspan='3'>No records found</td></tr>";
}

echo "</table>";
pg_close($conn);
?>
