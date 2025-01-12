import java.util.*;
public class c2
{
  public static void main(String a[])
  {
    LinkedList<Integer> l=new LinkedList<Integer>();
    l.add(1);
    l.add(2);
    System.out.println(" linked list"+l);
    l.addFirst(5);
   System.out.println("After adding 5 at a first positiobn "+l);
    l.removeLast();
    System.out.println("After removing last elemnt "+l);
    System.out.println("size of linkedlist"+l.size());
  }
}

