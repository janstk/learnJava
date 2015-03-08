import java.util.*;
class HashDemo
{
    public static void main (String[] args) {
        HashSet hs = new HashSet();
        hs.add("java_1");
        hs.add("java_2");
        hs.add("java_3");
        sop(hs.add("java_4"));
        sop(hs.add("java_4"));
        Iterator it = hs.iterator();
        while(it.hasNext())
        {
            sop(it.next());
        }
    }
    public static void  sop(Object obj)
    {
        System.out.println(obj);
    }
}
