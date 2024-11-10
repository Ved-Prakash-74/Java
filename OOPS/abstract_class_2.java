// An abstract class is a class that cannnot be initiated by itself. It needs to be subclasses by another 
// class to use its properties. 

// An abstract class is declared using abstract keyword

abstract class abstract_example
{
    abstract void printInfo();
}
class employee extends abstract_example
{
    void printInfo()
    {
        String name = "Michael";
        int age = 30;
        int salary = 50000;

        System.out.println("\nName : " + name);
        System.out.println("\nAge : " + age);
        System.out.println("\nSalary : " + salary);
    }
}
public class abstract_class_2 {
    public static void main(String[] args)
    {
        abstract_example ob = new employee();
        ob.printInfo();
    }
}
