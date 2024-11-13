// java program to implement Array Index out of bounds, Arithmetic and parent exception 
public class different_types_of_exception_handling
{
    public static void main(String args[]) throws Exception
    {
        try
        {
            int a[]=new int[5];
            a[5]=30/10;
            System.out.print("\n" + a[5]);
        }
        
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.print("\nArray Index Out of Bound");
        }
        catch(ArithmeticException e)
        {
            System.out.print("\nCan't be divided by zero");
        }
        catch(Exception e)
        {
            System.out.print("\nParent Exception Occurs");
        }
    }   
}