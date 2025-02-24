<?php
$nm=$_GET['n'];
$nm_arr=array("Amresh","Shubham","Mitesh");
if($nm==NULL)
     echo "Stranger please tell me your name";
foreach($nm_arr as $n)
{
    if($n==$nm)
    {
        echo "Welcome ".$n;
        exit();
    }
}
echo"$nm, I don't know you";
?>