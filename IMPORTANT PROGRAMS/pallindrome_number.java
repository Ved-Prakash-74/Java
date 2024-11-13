// write a program to check whether a number is pallindrome on not 

import java.util.*;

public class pallindrome_number
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("\nEnter a number: ");
            int num=sc.nextInt();
            int temp=num;
            int digit=0;
            while(temp>0)
            {
                int rem=temp%10;
                digit=(digit *10)+rem;
                temp=temp/10;
            }
            if(digit==num)
            {
                System.out.print("\n" + num + " is pallindrome");
            }
            else
            {
                System.out.print("\n " + num + " is not pallindrome");
            }
        }
    }
}
