import java.util.*;
public class demo3
{
  public static void main(String a[])
  { 
    LinkedHashSet<String> s=new LinkedHashSet<String>();
    s.add("Java");
    s.add("WT");
    s.add("OS");
    Iterator<String> i=s.iterator();
    while(i.hasNext())
    {
      System.out.println(i.next());
     }
   }
}

