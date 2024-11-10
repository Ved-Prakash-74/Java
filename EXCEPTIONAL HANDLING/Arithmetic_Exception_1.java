public class Arithmetic_Exception_1
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 0;
        try
        {
            System.out.print(a / b);
        }
        catch(Exception e)
        {
            System.out.println("\nZero Division Exception");
        }
    }
}