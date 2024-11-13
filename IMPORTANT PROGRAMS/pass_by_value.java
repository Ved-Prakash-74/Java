// write a program to demonstrate pass arguments by value 

public class pass_by_value
{
    public static void main(String args[])
    {
        // demonstration of call by value...
        program14 p = new program14();
        int val1 = 20, val2 = 30;
        System.out.println("The Values before call are : "+val1+" and "+val2);
        p.callbyvalue(val1, val2);
        System.out.println("The Values after call are : "+val1+" and "+val2);
    }
    
    void callbyvalue(int val1, int val2)
    {
        val1++;
        val2++;
    }
}