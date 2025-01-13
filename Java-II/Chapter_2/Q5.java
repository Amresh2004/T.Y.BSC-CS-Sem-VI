//program to print the number 1 to 5000 in reverse order after every 3 seconds

import java.util.*;
public class Q5 extends Thread
{
        public static void main(String a[])
        {
                Thread t=new Thread(new Q5());
                t.start();
        }
        public void run()
        {
                try
                {
                        for(int i=5000;i>=0;i--)
                        {
                                System.out.println(i);
                                sleep(3000);
                        }
                }
                catch(Exception e)
                {
                        System.out.println(e);
                }
        }
}
