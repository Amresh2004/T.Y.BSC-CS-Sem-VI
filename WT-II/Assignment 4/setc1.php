<?php
// Predefined array of suggestions
$suggestions = ["Rohit", "Virat", "Dhoni", "Ashwin", "Harbhajan", "Sachin", "Rahul", "Jadeja", "Pant", "Bumrah"];

$query = isset($_GET['q']) ? strtolower($_GET['q']) : '';

$response = "";

if ($query !== "") {
    foreach ($suggestions as $name) {
        if (stripos($name, $query) !== false) {
            $response .= "<div class='suggestion-item' onclick='selectSuggestion(\"$name\")'>$name</div>";
        }
    }
}

echo $response === "" ? "<div>No suggestions</div>" : $response;
?>
