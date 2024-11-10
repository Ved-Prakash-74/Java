import java.util.Scanner;

public class even_odd_7 
{
    static String check_even_odd(int num)
    {
        if(num % 2 == 0)
        {
            return "Even";
        }
        else
        {
            return "Odd";
        }
    }
    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        sc.close();

        String result = check_even_odd(num);
        System.out.println("\nResult : " + result);
    }
}
