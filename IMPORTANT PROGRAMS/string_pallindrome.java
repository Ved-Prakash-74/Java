import java.util.*;
class Pallindrome 
{
    String check_pallindrome(String str)
    {
        String temp = str;
        String rev_str = "";
        for(int i = temp.length() - 1 ; i >= 0 ; i--)
        {
            rev_str += temp.charAt(i);
        }

        if(str.equals(rev_str))
        {
            return "The given string is a Pallindrome String";
        }
        else
        {
            return "The given string is not a Pallindrome String";
        }
    }

}

public class string_pallindrome 
{
    public static void main(String[] args)
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a string");
        str = sc.nextLine();
        sc.close();

        Pallindrome ob = new Pallindrome();
        String result = ob.check_pallindrome(str);
        System.out.println(result);
    }
}