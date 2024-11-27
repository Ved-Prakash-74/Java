// ******
//  *****
//   ****
//    ***
//     **
//      *

public class Reverse_Left_half_pyramid_pattern_18 {
    public static void main( String [] args)
    {
        int n = 5;
        for(int i = n ; i >= 1 ; i--)
        {
            for(int j = n - i ; j >= 1 ; j--)
            {
                System.out.print("  ");
            }
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
