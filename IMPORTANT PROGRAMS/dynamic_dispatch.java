// program on dynamic method dispatch 
public class dynamic_dispatch
{
    public static class superclass
    {
        void print()
        {
            System.out.print("\nPrint in superclass");
        }
    }
    public static class subclass extends superclass
    {
        void print()
        {
            System.out.print("\n\nPrint in subclass");
        }
    }
    public static void main(String args[])
    {
        superclass A=new superclass();
        superclass B=new subclass();
        A.print();
        B.print();
    }
}