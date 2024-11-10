import java.util.Scanner;

public class Downward_Triangle_Star_Pattern_6 
{
    static void downward_triangle_star_pattern(int n)
    {
        for(int i = n - 1; i >=0 ; i--)
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

        downward_triangle_star_pattern(num);
    }
}
