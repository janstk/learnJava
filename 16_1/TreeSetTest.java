import java.util.*;
class TreeMapTest
{
    public static void main (String[] args) {
    TreeMap<Student,String> ts = new TreeMap<Student,String>();

    }
}
class Student
{
    private String name;
    private int age;
    Student(String name,int age)
    {
        this.age = age;
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public int hashCode()
    {
        return this.name.hashCode()+age*13;
    }
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Student))
            throw new ClassCastException("Type error");
        Student s = (Student)obj;
        return this.name == s.getName() && this.age == s.getAge();
    }
    public String toString()
    {
        return this.name + ":" + age;
    }
}
class StuComp implements Comparator<Student>
{
    public int compare(Student stu1,Student stu2)
    {
        int num = stu1.getAge() - stu2.getAge();
        if (num == 0)
            return stu1.getName().compareTo(Stu2.getName())
        return num;
    }
}
