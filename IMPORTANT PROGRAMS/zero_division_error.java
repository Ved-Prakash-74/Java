// java program to create exception of divide by zero 
public class zero_division_error
{
    public static void main(String args[]) throws Exception 
    {
        int a=10,b=0,c;
        try
        {
            c=a/b;
            System.out.print(c);
        }
        catch(Exception e)
        {
            System.out.print("\nCan't be divided by zero");
        }
        finally
        {
            System.out.print("\nEnd of program");
        }
    }   
}
