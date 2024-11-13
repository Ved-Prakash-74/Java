// write a program to show static method 

public class static_method
{
    public static void main(String args[])
    {
        // demonstrating static method....
        System.out.println("Normal function cannot be directly called without an object....");
        print();
    }
    
    static void print()
    {
        System.out.println("The function is called using static method without an object....");
    }
}
