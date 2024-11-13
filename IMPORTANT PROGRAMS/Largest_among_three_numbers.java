// largest among three numbers 
import java.util.*;

public class Largest_among_three_numbers
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("\nEnter 1st number: ");
            int a = sc.nextInt();

            System.out.print("\nEnter 2nd number: ");
            int b = sc.nextInt();

            System.out.print("\nEnter 3rd number: ");
            int c = sc.nextInt();

            if(a>b && a>c)
                System.out.print("\nLargest among " + a + " , " + b + " and " + c + " is: " + a); 
            else if(b>a && b>c)
                System.out.print("\nLargest among " + a + " , " + b + " and " + c + " is: " + b); 
            else
                System.out.print("\nLargest among " + a + " , " + b + " and " + c + " is: " + c);
        } 
    }
    
}
