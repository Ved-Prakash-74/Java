// * * * * * * 
//  *       * 
//   *     * 
//    *   * 
//     * * 
//      * 
//     * * 
//    *   * 
//   *     * 
//  *       * 
// * * * * * * 

public class Hollow_hour_glass_pattern_24 
{
    public static void main(String [] args)
    {
        int n = 5;
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j < i ; j++)
            {
                System.out.print("  ");
            }
            for(int j = i ; j <= n ; j++)
            {
                if(i == 1 || j == i || j == n)
                {
                    System.out.print("  * ");
                }
                else 
                {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
        for(int i = n - 1 ; i >= 1 ; i--)
        {
            for(int j = i ; j >= 1 ; j--)
            {
                System.out.print("  ");
            } 
            for(int j = n; j >= i ; j--)
            {
                if(j == n || i == j || i == 1)
                {
                    System.out.print(" *  ");
                }
                else 
                {
                    System.out.print("    ");
                }
            } 
            System.out.println();              
        }
    }   
}
