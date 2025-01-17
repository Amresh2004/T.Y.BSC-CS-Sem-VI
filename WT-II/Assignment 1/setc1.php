<html>
    <body>
        <?php
        setCookie('name',$_POST["name"]);
        setCookie('ph-no',$_POST["ph-no"]);
        setCookie('address',$_POST["address"]);
        echo"Hello".$_POST["name"]."!Enter Details....<br>";
        ?>
        <form method ="post" action="setc2.php">
            <table border="1">
                <tr><td>Product name</td><td><input type="text" name="pname"></td></tr>
                <tr><td>qty</td><td><input type="text" name="qty"></td></tr>
                <tr><td>rate</td><td><input type="text" name="rate"></td></tr>
                <tr><td></td><td><input type="submit" name="submit" value="DISPLAY"></td></tr>
            </table>
        </form>
    </body>
</html>