import java.util.Scanner;
public class swap_4
{
    public static void main(String[] args)
    {
        int a , b ;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        System.out.println("\nNumbers before swapping are: " + a + " and " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nNumbers after swapping are: " + a + " and " + b);
    }
    
}
