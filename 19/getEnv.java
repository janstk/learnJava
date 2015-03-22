import java.util.*;
class GetEnv
{
    public static void main (String[] args) {
        SOP(System.getProperty("_JAVA_OPTIONS"));
    }
    public static<T> void SOP(T t)
    {
        System.out.println(t);
    }
}
