import java.util.*;
public class factorial 
{
    public static void main(String[] args)
    {
        int n , fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number");
        n = sc.nextInt();
        sc.close();

        for(int i = n ; i >= 1 ; i--)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
