// write a program to check whether a string is pallindrome or not 

import java.util.*;

public class pallindrome_string 
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("\nEnter any string: ");
            String str=sc.nextLine();
            String rev_str="";
            int len=str.length();
            for(int i=len-1;i>=0;i--)
            {
                rev_str+=str.charAt(i);
            }
            if(str.equals(rev_str)==true)
            {
                System.out.print("\n" + str + " is pallindrome");
            }
            else
            {
                System.out.print("\n" + str + " is not pallindrome");
            }
        }
    }
}
