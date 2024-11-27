//         1
//       2   2
//     3   3   3
//   4   4   4   4
// 5   5   5   5    5

public class Number_triangle_pattern_3 {
    public static void main(String [] args)
    {
        int rows = 5;

        for(int i = 1 ; i <= rows ; i++)
        {
            for(int j = rows - i ; j >= 1 ; j--)
            {
                System.out.print("  ");
            }
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print(i + "   ");
            }
            System.out.println();
        }
    }
}
