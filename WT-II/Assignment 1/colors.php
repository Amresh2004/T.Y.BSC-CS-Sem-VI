<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') 
{
    if (isset($_POST['t1'], $_POST['t2'], $_POST['t3'], $_POST['t4'], $_POST['t5'])) 
    {
        setcookie('text', $_POST['t1']);
        setcookie('style', $_POST['t2']);
        setcookie('bgcolor', $_POST['t3']);
        setcookie('size', $_POST['t4']);
        setcookie('color', $_POST['t5']);

        echo "<html>
                <form method='post' action='colors.php'>
                Your Settings:
                <br>Text=" . htmlspecialchars($_POST['t1']) . "
                <br>Style=" . htmlspecialchars($_POST['t2']) . "
                <br>Background Color=" . htmlspecialchars($_POST['t3']) . "
                <br>Font Size=" . htmlspecialchars($_POST['t4']) . "
                <br>Font Color=" . htmlspecialchars($_POST['t5']) . "
                <br><input type='submit' value='Implement'>
              </form>
              </html>";
    } 
} 
?>

<?php
$text=$_COOKIE['text'];
$s=$_COOKIE['style'];
$b=$_COOKIE['bgcolor'];
$sz=$_COOKIE['size'];
$c=$_COOKIE['color'];
echo "<html>
        <body bgcolor=$b> <font size=$sz color=$c> <$s> $text</$s></font></body></html>";
?>
