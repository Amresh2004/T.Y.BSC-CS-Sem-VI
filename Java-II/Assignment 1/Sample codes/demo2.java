import java.util.*;
public class demo2
{
  public static void main(String a[])
  {
    HashSet h=new HashSet(5,0.5f);
    h.add("one");
    h.add("two");
    h.add("three");
    h.add("four");
    h.add("five");
    System.out.println(h);
    Boolean b=h.add("one");
    System.out.println("Duplicated item allowed ="+b);
    System.out.println(h);
   }
}

