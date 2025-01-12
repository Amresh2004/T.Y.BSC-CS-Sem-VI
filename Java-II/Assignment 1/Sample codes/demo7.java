import java.util.*;
public class demo7
{
  public static void main(String a[])
  {
    ArrayList al=new ArrayList(2);
    System.out.println(al+",size="+al.size());
    al.add("R");
    al.add("U");
    al.add("O");
    al.add(new String("x"));
    al.add(2,new Integer(10));
    System.out.println(al+",size="+al.size());
    al.remove("U");
    System.out.println(al+",size="+al.size());
    Boolean b=al.contains("x");
    System.out.println("The list contains x="+b);
    b=al.contains("p");
    System.out.println("the list contains p="+b);
    b=al.contains(new Integer(10));
    System.out.println("the list contains intefer 10="+b);
    ListIterator l=al.listIterator();
    while(l.hasNext())
    {
      System.out.println("From ListIterator="+l.next());
      Object an[]=al.toArray();
      for(int i=0;i<an.length;i++)
      {
          System.out.println("From an Array=+"+an[i]);
       }
    }
  }
}

    
