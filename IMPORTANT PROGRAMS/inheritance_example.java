 import java.util.Scanner;

public class inheritance_example
{
    public static void main(String args[])
    {
        child ch=new child();
        ch.displayall();
    }
}
class parent
{
    int age;
    String name;
    parent()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter name: ");
        String n=sc.nextLine();
        System.out.print("\nEnter age: ");
        int a=sc.nextInt();
        name=n;
        age=a;
    }
    void display()
    {
        System.out.print("\nName : " + name);
        System.out.print("\nAge : " + age);
    }
}
class child extends parent
{
    String address;
    child()
    {
        super();
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter address: ");
        String a =sc.nextLine();
        address=a;
    }
    void displayall()
    {
        System.out.print("\nName : " + name);
        System.out.print("\nAge : " + age);
        System.out.print("\nAddress : " + address);

    }
}
