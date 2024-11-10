import java.util.Scanner;

public class neon_num_14 {
    public static void main(String[] args)
    {
        int num , temp , sq , rem , result = 0;
        System.out.println("\nEnter a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();

        temp = num;
        sq = temp * temp;

        while(sq != 0)
        {
            rem = sq % 10;
            result += rem;
            sq = sq / 10;
        }
        if(num == result)
        {
            System.out.println("\nNumber is Neon number");
        }
        else
        {
            System.out.println("\nNumber is not Neon number");
        }
        
    }
}
