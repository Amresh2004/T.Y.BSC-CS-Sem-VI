import java.util.*;
public class b1
{
  public static void main(String a[])
  {
    TreeSet<Integer> t=new TreeSet<Integer>();
    Scanner sc=new Scanner(System.in);
    System.out.println("hopw many numbers");
    int n=sc.nextInt();
    System.out.println("Enter"+n+"intgers");
    for(int i=0;i<n;i++)
    {
      int num=sc.nextInt();
      t.add(num);
    }
    System.out.println("Sorted");
    for(int num:t)
    {
      System.out.println(num);
    }
}
}

