import java.util.Scanner;

public class fibonacci_series_17 {

    static void fibonacci_series(int num)
    {
        if(num <= 0)
        {
            System.out.println(0);
        }
        int fibo[] = new int[2 * num + 1];
        fibo[0] = 0;
        fibo[1] = 1;
        
        for(int j = 2 ; j <= 2 * num ; j++)
        {
            fibo[j] = fibo[j - 1] + fibo[j - 2];
        }
        
        for(int k = 0 ; k < fibo.length ; k ++)
        {
            System.out.println(fibo[k]);
        }
    }
    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();

        fibonacci_series(num);
    }
}
