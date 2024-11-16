// *   *   *   *   * 
// *           * 
// *       * 
// *   * 
// *

public class Hollow_reverse_star_traingle_pattern_8 {
    public static void main(String [] args)
    {
        int rows = 5 ;
        for(int i = 1 ; i <= rows ; i++)
        {
            for(int j = rows ; j >= i ; j--)
            {
                if(j == rows || i == 1 || j == i)
                {
                    System.out.print("* ");
                }
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
