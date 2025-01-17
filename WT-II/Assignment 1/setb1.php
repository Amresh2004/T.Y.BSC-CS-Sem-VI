<?php
session_start();

$validUsername = "amresh";
$validPassword = "8624807723";

if (!isset($_SESSION['attempts'])) {
    $_SESSION['attempts'] = 0;
}

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $username = $_POST['username'] ?? '';
    $password = $_POST['password'] ?? '';

    if ($_SESSION['attempts'] < 3) {
        if ($username === $validUsername && $password === $validPassword) {
            $_SESSION['attempts'] = 0;
            $_SESSION['authenticated'] = true;
            echo "<h2>Welcome, $username!</h2>";
            echo "<form method='post' action='logout.php'>
                    <button type='submit'>Logout</button>
                  </form>";
            exit;
        } else {
            $_SESSION['attempts']++;
            $remainingAttempts = 3 - $_SESSION['attempts'];
            echo "<p style='color: red;'>Incorrect username or password. You have $remainingAttempts attempt(s) remaining.</p>";
        }
    } else {
        echo "<p style='color: red;'>Maximum login attempts exceeded. Please try again later.</p>";
    }
}

if (!isset($_SESSION['authenticated']) || !$_SESSION['authenticated']) {
    echo "<form method='post' action=''>
            <label for='username'>Username:</label>
            <input type='text' id='username' name='username' required><br><br>
            <label for='password'>Password:</label>
            <input type='password' id='password' name='password' required><br><br>
            <button type='submit'>Login</button>
          </form>";
}

?>
