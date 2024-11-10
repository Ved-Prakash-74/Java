import java.util.Scanner;

public class largest_among_three_8 
{
    static int largest_among_three(int a , int b , int c)
    {
        if(a >= b && a >= c)
        {
            return a;
        }
        else if (b >= c && b >= a) 
        {
            return b;
        }
        else
        {
            return c;
        }
    }
    public static void main(String[] args)
    {
        int a , b , c;
        System.out.println("\nEnter three numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        sc.close();

        int result = largest_among_three(a , b , c);
        System.out.println("\nLargest among " + a + " , " + b + " and " + c + " is " + result);

    }   
}
