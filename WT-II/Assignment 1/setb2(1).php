<?php
session_start();

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $_SESSION['eno'] = $_POST['eno'];
    $_SESSION['ename'] = $_POST['ename'];
    $_SESSION['address'] = $_POST['address'];
}
?>
<html>
<body>
    <h2>Enter Employee Earnings</h2>
    <form method="post" action="setb2(2).php">
        <label for="basic">Basic:</label>
        <input type="number" id="basic" name="basic" required><br><br>
        <label for="da">DA:</label>
        <input type="number" id="da" name="da" required><br><br>
        <label for="hra">HRA:</label>
        <input type="number" id="hra" name="hra" required><br><br>
        <button type="submit">Next</button>
    </form>
</body>
</html>
