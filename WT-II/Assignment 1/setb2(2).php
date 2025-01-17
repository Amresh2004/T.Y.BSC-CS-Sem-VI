<?php
session_start();

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $_SESSION['basic'] = $_POST['basic'];
    $_SESSION['da'] = $_POST['da'];
    $_SESSION['hra'] = $_POST['hra'];
}

$total = $_SESSION['basic'] + $_SESSION['da'] + $_SESSION['hra'];
?>

<html>
<body>
    <h2>Employee Information</h2>
    <p><strong>Employee Number:</strong> <?php echo $_SESSION['eno']; ?></p>
    <p><strong>Employee Name:</strong> <?php echo $_SESSION['ename']; ?></p>
    <p><strong>Address:</strong> <?php echo $_SESSION['address']; ?></p>
    <p><strong>Basic:</strong> <?php echo $_SESSION['basic']; ?></p>
    <p><strong>DA:</strong> <?php echo $_SESSION['da']; ?></p>
    <p><strong>HRA:</strong> <?php echo $_SESSION['hra']; ?></p>
    <h3><strong>Total Earnings:</strong> <?php echo $total; ?></h3>
</body>
</html>
