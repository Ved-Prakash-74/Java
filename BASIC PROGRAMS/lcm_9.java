import java.util.Scanner;

public class lcm_9 {

    static int lcm_of_two_numbers(int a , int b)
    {
        int gcd , lcm;
        gcd = 1;
        if(a == b)
        {
            return a;
        }
        else
        {
            for(int i = 1 ; i <= a && i <= b ; i++)
            {
                if(a % i == 0 && b % i == 0)
                {
                    gcd = i;
                }
            }

            lcm = (a * b) / gcd;
        }
        return lcm;
    }
    public static void main(String[] args)
    {
        int a , b;
        System.out.println("\nEnter two numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        int result = lcm_of_two_numbers(a , b);
        System.out.println("\nLCM of " + a + " and " + b + " is " + result);
    
    }
}
