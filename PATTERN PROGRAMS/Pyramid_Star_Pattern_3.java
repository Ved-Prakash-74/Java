import java.util.Scanner;

public class Pyramid_Star_Pattern_3 {
    static void triangle_star_pattern(int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = n - i ; j >= 0 ; j--)
            {
                System.out.print(" ");
            }
            // FOr right triangle remove j loop 
            for(int k = 0 ; k <= i ; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int num;
        System.out.println("\nENter a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();

        triangle_star_pattern(num);
    }   
}
