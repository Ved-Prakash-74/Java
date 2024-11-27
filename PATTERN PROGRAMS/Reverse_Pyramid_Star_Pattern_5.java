import java.util.Scanner;

public class Reverse_Pyramid_Star_Pattern_5 {

    static void reverse_pyramid_star_pattern(int n)
    {
        int i = n , j;
        while(i > 0)
        {
            j = 0;
            while(j++ < n - i)
            {
                System.out.print(" ");
            }
            j = 0;
            while(j++ < (i * 2) - 1)
            {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }
    public static void main(String[] args)
    {
        int num;
        System.out.println("\nEnter a num");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();

        reverse_pyramid_star_pattern(num);
    }
}
