interface A 
{
    final int a = 10;
    void display();
}

public class interfaces_3 implements  A{

    public void display()
    {
        System.out.println("This is main");
    }
    public static void main(String[] args)
    {
        interfaces_3 ob = new interfaces_3();
        ob.display();
        System.out.println(a);
    }
}
