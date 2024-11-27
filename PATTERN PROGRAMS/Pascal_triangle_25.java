//             1 
//         1       1 
//     1       2       1 
// 1       3       3       1 

public class Pascal_triangle_25 {
    public static void main(String [] args)
    {
        int n = 5;
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= n - i ; j++)
            {
                System.out.print("  ");
            }
            int x = 1;
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print(x + "  ");
                x = x * (i - j) / j;
            }
            System.out.println();
        }
    }   
}
