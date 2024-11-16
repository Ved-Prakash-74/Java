// *       *       *       *       * 
//     *                       * 
//         *               * 
//             *       * 
//                 *  

public class Hollow_reverse_triangle_pattern_23 {
    public static void main(String [] args)
    {
        int n = 5;
        for(int i = n ; i >= 1 ; i--)
        {
            for(int j = n ; j > i ; j--)
            {
                System.out.print("  ");
            }
            for(int j = 1 ; j <= i ; j++)
            {
                if(i == n || j == i || j == 1)
                {
                    System.out.print(" * ");
                }
                else 
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
