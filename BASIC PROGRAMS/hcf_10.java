import java.util.Scanner;

public class hcf_10 {

    static int hcf_of_two_numbers(int a , int b)
    {
        int gcd = 1;
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
            return gcd;
        }
    }
    public static void main(String[] args)
    {
        int a , b;
        System.out.println("\nEnter two numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        System.out.println("\nHCF of " + a + " and " + b + " is " + hcf_of_two_numbers(a , b));
    }
}
