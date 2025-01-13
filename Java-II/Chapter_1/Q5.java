//Java program which accept N numbers of yours friends using LinkedList collection also display the conetents of the set.

import java.util.*;
public class Q5
{
        public static void main(String args[])
        {
                LinkedList<String> a=new LinkedList<String>();
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                System.out.println("Enter friends names");
                for(int i=0;i<n;i++)
                {
                        String s=sc.next();
                        a.add(s);
                }
                System.out.println(a);
        }
}
