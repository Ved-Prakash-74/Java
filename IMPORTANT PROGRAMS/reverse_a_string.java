import java.util.*;
public class reverse_a_string 
{
    public static void main(String[] args)
    {
        String str , rev_str = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a string");
        str = sc.nextLine();
        sc.close();

        for(int i = str.length() - 1 ; i >= 0 ; i--)
        {
            rev_str += str.charAt(i);
        }

        System.out.println("\nString is " + str);
        System.out.println("\nReversed string is " + rev_str);
    }
}
