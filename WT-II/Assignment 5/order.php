<?php
// Set cookies with personal details from previous form
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    setcookie("name", $_POST['name'], time() + 3600);
    setcookie("age", $_POST['age'], time() + 3600);
    setcookie("address", $_POST['address'], time() + 3600);
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Order Details</title>
</head>
<body>
    <h2>Enter Order Details</h2>
    <form action="display_details.php" method="post">
        Product Name: <input type="text" name="product" required><br><br>
        Quantity: <input type="number" name="quantity" required><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
