import java.util.*;
public class b2
{
  public static void main(String a[])
  {
   LinkedHashMap<Integer,String> m=new LinkedHashMap<Integer,String>();
   m.put(3,"amresh");
   m.put(1,"mitesh");
   m.put(2,"shubham");
   m.put(4,"avinash");
   System.out.println("Hashmap before sorting");
   for(Map.Entry<Integer, String>entry : m.entrySet())
   {
       System.out.println("Key "+entry.getKey() + ",Value "+ entry.getValue());
   }
   TreeMap<Integer,String> s=new TreeMap<Integer,String>(m);
   System.out.println("\n HashMap after soruting by keys:");
    for(Map.Entry<Integer, String>entry : s.entrySet())
    {
        System.out.println("Key "+entry.getKey() + ",Value "+ entry.getValue());
    }
}
}

