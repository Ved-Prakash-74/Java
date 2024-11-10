import java.util.Scanner;

public class prime_num_11
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("\nEnter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();

        for(int i = 2 ; i <= n ; i++)
        {
            boolean isPrime = true;
            for(int j = 2 ; j <= Math.sqrt(i) ; j++)
            {
                if(i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println(i);
            }

        }
    }
}