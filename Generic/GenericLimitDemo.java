import java.util.*;
class GenericLimitDemo
{
    public static void main (String[] args) {

    }
    public static void outPutArr(ArrayList<? extends Person> al)
    {
        Iterator<? extends Person> it = al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next().getName());
        }
    }
}
class Person
{
     private String name;
     Person(String name)
     {
         this.name = name;
     }
     public String getName()
     {
         return name;
     }
}
class Worker extends Person
{
    Worker(String name)
    {
        super(name);
    }
}
