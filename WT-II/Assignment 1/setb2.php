<?php
session_start();
?>
<html>
<body>
    <h2>Enter Employee Details</h2>
    <form method="post" action="setb2(1).php">
        <label for="eno">Employee Number:</label>
        <input type="text" id="eno" name="eno" required><br><br>
        <label for="ename">Employee Name:</label>
        <input type="text" id="ename" name="ename" required><br><br>
        <label for="address">Address:</label>
        <input type="text" id="address" name="address" required><br><br>
        <button type="submit">Next</button>
    </form>
</body>
</html>
