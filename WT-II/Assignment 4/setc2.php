<?php
header("Content-Type: text/html");

if (!isset($_GET['title'])) {
    echo "No book selected!";
    exit;
}

$selectedTitle = $_GET['title'];
$xml = simplexml_load_file("setc2.xml") or die("Error loading XML file!");

$found = false;
foreach ($xml->book as $book) {
    if (strcasecmp($book->title, $selectedTitle) == 0) {
        echo "<strong>Title:</strong> " . $book->title . "<br>";
        echo "<strong>Author:</strong> " . $book->author . "<br>";
        echo "<strong>Year:</strong> " . $book->year . "<br>";
        echo "<strong>Price:</strong> $" . $book->price . "<br>";
        $found = true;
        break;
    }
}

if (!$found) {
    echo "Book not found!";
}
?>
