import java.util.Scanner;

public class Left_Triangle_Star_Pattern_2 
{
    static void left_triangle_star_pattern(int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 2 * (n - i) ; j >= 0 ; j--)
            {
                System.out.print(" ");
            }
            // FOr right triangle remove j loop 
            // For perfect triangle remove 2 from j loop
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

        left_triangle_star_pattern(num);
    }
    
}
