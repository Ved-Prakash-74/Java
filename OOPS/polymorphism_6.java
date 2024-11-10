// Polymorphism - It means one form multiple interfaces. Polymorphism allows us to perferm single action 
// in different ways. In other words it allows to define one interface with multiple implementations.

// Types of Polymorphism
// i) Compile Time Polymorphism - It is also known as Static Polymorphism and it is achieved by method 
//     overloading.

// ii) Run Time Polymorphism -  It is also known as Dynamic Method Dispatch and it is achieved by Method
//     overriding.

// Example of Compile Time Polymorphism or method overloading
// class multiplication
// {
//     static int multiply(int a , int b)
//     {
//         return a * b;
//     }

//     static double multiply(double a , double b)
//     {
//         return a * b;
//     }
// }
// public class polymorphism_6
// {
//     public static void main(String[] args)
//     {
//         System.out.println(multiplication.multiply(2, 4));
//         System.out.println(multiplication.multiply(5.5, 6.3));
//     }
// }

// Example of Run Time Error or Method Overriding
class parent
{
    void print()
    {
        System.out.println("\nI am parent");
    }
}

class subclass1 extends parent
{
    void print()
    {
        System.out.println("\nI am subclass1");
    }
}

class subclass2 extends parent
{
    void print()
    {
        System.out.println("\nI am subclass2");
    }
}
public class polymorphism_6
{
    public static void main(String[] args)
    {
        parent a;
        
        a = new subclass1();
        a.print();

        a = new subclass2();
        a.print();
    }
}
