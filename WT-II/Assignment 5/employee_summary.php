<?php
session_start(); // Start the session

// Retrieve employee details from session
$eno = $_SESSION['eno'];
$ename = $_SESSION['ename'];
$address = $_SESSION['address'];

// Retrieve earnings from form
$basic = $_POST['basic'];
$da = $_POST['da'];
$hra = $_POST['hra'];

// Calculate total salary
$total = $basic + $da + $hra;
?>

<!DOCTYPE html>
<html>
<head>
    <title>Employee Summary</title>
</head>
<body>
    <h2>Employee Information</h2>
    <p><strong>Employee Number:</strong> <?php echo $eno; ?></p>
    <p><strong>Employee Name:</strong> <?php echo $ename; ?></p>
    <p><strong>Address:</strong> <?php echo $address; ?></p>

    <h2>Employee Earnings</h2>
    <p><strong>Basic Salary:</strong> <?php echo $basic; ?></p>
    <p><strong>DA:</strong> <?php echo $da; ?></p>
    <p><strong>HRA:</strong> <?php echo $hra; ?></p>
    <p><strong>Total Salary:</strong> <?php echo $total; ?></p>

    <br><a href="employee.php">Start Over</a>
</body>
</html>
