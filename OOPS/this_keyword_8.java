class test 
{
    int a; 
    int b;

    test(int a , int b)
    {
        this.a = a; 
        this.b = b;
    }

    void display()
    {
        System.out.println("\na = " + a + "\nb = " + b);
    }
}

public class this_keyword_8 {
    public static void main(String[] args)
    {
        test ob = new test(10 , 20);
        ob.display();
    }
}
