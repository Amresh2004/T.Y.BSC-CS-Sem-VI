import java.util.*;
public class demo5
{
  public static void main(String a[])
  {
    Hashtable<String,Integer> h=new Hashtable<String,Integer>();
    h.put("a",100);
    h.put("b",200);
    h.put("c",300);
    System.out.println(h);
    boolean v=h.contains(300);
    System.out.println("is 300 presernt:"+v);
    v=h.containsKey("c");
    System.out.println("is d present:"+v);
   }
}

