// write a program to demonstrate pass arguments by reference  

public class pass_by_reference 
{
    int val1 = 10, val2 = 12;
    public static void main(String args[])
    {
        // demonstrating call by reference...
        program15 p1 = new program15();
        System.out.println("The numbers before call is : "+p1.val1+" and "+p1.val2);
        p1.callbyref(p1);
        System.out.println("The numbers after call is : "+p1.val1+" and "+p1.val2);
    }
    
    void callbyref(program15 p1)
    {
        p1.val1 = p1.val1 + 10;
        p1.val2 = p1.val2 + 12;
    }
}