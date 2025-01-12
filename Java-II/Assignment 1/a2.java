import java.util.*;
public class a2
{
  public static void main(String a[])
  { 
    LinkedList<String> l=new LinkedList<String>();
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      System.out.println("Enter Friend name=");
      String s=sc.next();
      l.add(s);
    }
   System.out.println("Name of friends"+l);
  }
}

