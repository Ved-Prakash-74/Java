import java.util.*;
public class Sum_of_numbers
{
    public static void main(String args[])
    {
        try (Scanner s = new Scanner(System.in)) 
        {
            System.out.print("\nEnter a number: ");
            int n=s.nextInt();
            int sum=0;
            while(n>0)
            {
                int digit=n%10;
                sum+=digit;
                n=n/10;
            }
            System.out.print("\nSum is: " + sum);
        }
    }
}
