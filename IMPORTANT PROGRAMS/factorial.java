import java.util.*;

public class factorial 
{
    public static void main(String args[]) 
    {
        int fact = 1, i;
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("\nEnter a number: ");
            int num = sc.nextInt();
            System.out.println("\nSeries is: ");
            for (i = num; i != 0; i--) 
            {
                if (i == 1) 
                {
                    System.out.print(i);
                    break;
                } 
                else 
                {
                    System.out.print(i + " * ");
                }

            }
            for (i = 1; i <= num; i++) 
            {
                fact = fact * i;
            }
            System.out.println("\n\nFactorial of " + num + " is " + fact);
        }
    }
}
