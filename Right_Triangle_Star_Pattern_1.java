import java.util.Scanner;

public class Right_Triangle_Star_Pattern_1 
{
    static void right_triangle_star_pattern(int num)
    {
        for(int i = 0 ; i < num ; i++)
        {
            for(int j = 0 ; j <= i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int num;
        System.out.println("\nEnter a num");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();

        right_triangle_star_pattern(num);
    }
}
