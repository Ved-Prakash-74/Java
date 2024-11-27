// ******
// *****
// ****
// ***
// **
// *

public class Right_half_reverse_pyramid_pattern_16 {
    public static void main(String [] args)
    {
        int n = 5 ;
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = n ; j >= i ; j--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
