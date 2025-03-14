<?php
$name = isset($_COOKIE['name']) ? $_COOKIE['name'] : "Not set";
$age = isset($_COOKIE['age']) ? $_COOKIE['age'] : "Not set";
$address = isset($_COOKIE['address']) ? $_COOKIE['address'] : "Not set";

$product = $_POST['product'];
$quantity = $_POST['quantity'];
?>

<!DOCTYPE html>
<html>
<head>
    <title>Order Summary</title>
</head>
<body>
    <h2>Personal Details</h2>
    <p><strong>Name:</strong> <?php echo $name; ?></p>
    <p><strong>Age:</strong> <?php echo $age; ?></p>
    <p><strong>Address:</strong> <?php echo $address; ?></p>

    <h2>Order Details</h2>
    <p><strong>Product Name:</strong> <?php echo $product; ?></p>
    <p><strong>Quantity:</strong> <?php echo $quantity; ?></p>

    <br><a href="personal.html">Start Over</a>
</body>
</html>
