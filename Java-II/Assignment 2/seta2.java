import java.util.*;
public class seta2 extends Thread
{
        public static void main(String a[])
        {
                Thread t=new Thread(new seta2());
                t.start();
        }
        public void run()
        {
                try
                {
                        for(int i=100;i>=0;i--)
                        {
                                System.out.println(i);
                                sleep(6000);
                        }
                }
                catch(Exception e)
                {
                        System.out.println(e);
                }
        }
}
