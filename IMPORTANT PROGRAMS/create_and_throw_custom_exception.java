class custom_exception extends Exception
{
    public custom_exception(String message)
    {
        super(message);
    }
}
public class create_and_throw_custom_exception 
{
    public static void main(String[] args)
    {
        try
        {
            int age = 15;
            if(age < 18)
            {

                throw new custom_exception("You must be 18 years old");
            }
        }
        catch(custom_exception e)
        {
            System.out.println("\nCustom Exception caught : " + e.getMessage());
        }
    }
}
