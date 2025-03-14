<?php
session_start(); // Start the session

// Store Employee details from Page 1 into session variables
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $_SESSION['eno'] = $_POST['eno'];
    $_SESSION['ename'] = $_POST['ename'];
    $_SESSION['address'] = $_POST['address'];
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Employee Earnings</title>
</head>
<body>
    <h2>Enter Employee Earnings</h2>
    <form action="employee_summary.php" method="post">
        Basic Salary: <input type="number" name="basic" required><br><br>
        DA: <input type="number" name="da" required><br><br>
        HRA: <input type="number" name="hra" required><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
