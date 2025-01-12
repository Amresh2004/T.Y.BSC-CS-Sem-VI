import java.util.*;
public class a1
{
  public static void main(String a[])
  { 
     ArrayList<String> al=new ArrayList<String>();
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     System.out.println("How many Cities");
     for(int i=0;i<n;i++)
     { 
       System.out.println("Enter City Names");
       String s=sc.next();
       al.add(s);
     }
     System.out.println("nmae of cities"+al);
     al.clear();
     System.out.println("all remved:"+al.size());

   }
}

