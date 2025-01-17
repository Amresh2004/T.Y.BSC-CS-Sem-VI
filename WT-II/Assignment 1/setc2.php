<html>
    <body>
        <?php
        echo "<b> customer Details</b><br>";
        echo "<table border='1'>";
        echo "<tr><td>";
        echo"customerName:".$_COOKIE["name"]."<br>";
        echo "</tr></td>";
        echo "<tr><td>";
        echo"customer phone:-".$_COOKIE["ph-no"]."<br>";
        echo "</tr></td>";
        echo "<tr><td>";
        echo"Studcustomerent address:-".$_COOKIE["address"]."<br>";
        echo "</tr></td>";
        echo "<tr><td>";
        echo "<b> customer Bill</b><br>";
        echo "</tr></td>";
        echo "<tr><td>";
        echo"pname:".$_REQUEST["pname"];echo "</tr></td>";
        echo "<tr><td>";
        echo"qty:".$_REQUEST["qty"];echo "</tr></td>";
        echo "<tr><td>";
        echo"rate:".$_REQUEST["rate"];echo "</tr></td>";
        echo "</table>";
        if(isset($_POST['submit']))
        {
            $qty=(int)$_POST['qty'];
            $rate=(int)$_POST['rate'];
            $total = $qty*$rate;
            echo"Total=".$total;
        }
        ?>
    </body>
 </html>