//                 * 
//             *   *   *
//         *   *   *   *   *
//     *   *   *   *   *   *   * 
// *   *   *   *   *   *   *   *   *
//     *   *   *   *   *   *   * 
//         *   *   *   *   *   
//             *   *   * 
//                 *            

public class Diamond_star_pattern_12 {
    public static void main(String [] args)
    {
        int rows = 5;
        // int len = 2 * rows - 1;
        for(int i = 1 ; i <= rows ; i++)
        {
            for(int j = 1 ; j <= rows - i ; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print("* ");
            }
            for(int j = 2 ; j <= i ; j++)
            {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        for(int i = rows - 1 ; i >= 1 ; i--)
        {
            for(int j = rows - i ; j >= 1 ; j--)
            {
                System.out.print("  ");
            }
            for(int j = rows - 1 ; j >= 1 ; j--)
            {
                System.out.print("* ");
        
            } 
            for(int j = 2 ; j <= i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();  
        }
    }
}
