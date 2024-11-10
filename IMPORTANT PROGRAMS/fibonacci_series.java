import java.util.*;

public class fibonacci_series 
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nENter a number");
        n = sc.nextInt();
        sc.close();

        int val1 = 0 , val2 = 1 , temp;
        System.out.print(val1 + " , " + val2 + " , ");
        for(int i = 3 ; i <= n ; i++)
        {
            temp = val1 + val2;
            val1 = val2; 
            val2 = temp;

            if( i == n)
            {
                System.out.print(temp);
            }
            else 
            {
                System.out.print(temp + " , ");
            }
        }
    }
}
