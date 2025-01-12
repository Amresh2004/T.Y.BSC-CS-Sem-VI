import java.util.*;
public class demo6
{
  public static void main(String a[])
  {
    ArrayList al=new ArrayList();
    for(int i=0;i<10;i++)
    al.add(i);
    System.out.println(al);
    Iterator ia=al.iterator();
    while(ia.hasNext())
    {
      int i=(Integer)ia.next();
      System.out.println(i+" ");
      if(i%2==0)
        ia.remove();
    }
 // System.out.println();
  System.out.println(al);
 }
}

