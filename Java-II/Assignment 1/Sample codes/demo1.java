import java.util.*;
public class demo1
{
  public static void main(String a[])
  {
     LinkedList<String> al=new LinkedList<String>();
     al.add("Amresh");
     al.add("Mitesh");
     al.add("Shubvham");
     Iterator<String> i=al.iterator();
     while(i.hasNext())
     {
       System.out.println(i.next());
     }
    }
}

