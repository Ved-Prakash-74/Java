// Encapsulation means binding code and data together in a single unit. By using encapsulation we can hide 
// the implementation details from outside class.

// Encapsulation can be achieved by declaring instance variable of class as private, which means they can be
// accessed within the class. To get outside access public method calls getters and setters for getting and
// setting the value of the variable

class Person
{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
public class Encapsulation_4 {
    public  static void main(String[] args)
    {
        Person ob = new Person();
        ob.setName("John");
        ob.setAge(30);

        System.out.println("\nName : " + ob.getName());
        System.out.println("\nAge : " + ob.getAge());
    }
}
