<?php
header('Content-Type: text/xml');
echo '<?xml version="1.0" encoding="UTF-8"?>' . "\n";
echo "<BookInfo>\n";

$book = array(
    array(
        'Block_no' => '1',
        'Book_Name' => 'Java',
        'Author_Name' => 'Amresh',
        'Price' => '2000',
        'Year' => '2014'
    ),
    array(
        'Block_no' => '2',
        'Book_Name' => 'Python',
        'Author_Name' => 'Shubham',
        'Price' => '2500',
        'Year' => '2018'
    ),
    array(
        'Block_no' => '3',
        'Book_Name' => 'Blockchain',
        'Author_Name' => 'Mitesh',
        'Price' => '2600',
        'Year' => '2012'
    )
);

foreach ($book as $b) 
{
    echo "<Book>\n";
    foreach ($b as $tag => $data) 
    {
        echo "<$tag>" . htmlspecialchars($data) . "</$tag>\n";
    }
    echo "</Book>\n";
}

echo "</BookInfo>\n";
?>
