import java.util.Scanner;

public class factorial_16 {
    public static void main(String[] args)
    {
        int num , result = 1;
        System.out.println("\nEnter a num");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();

        for(int i = 1 ; i <= num ; i++)
        {
            result *= i;
        }

        System.out.print(result);
    }
}
