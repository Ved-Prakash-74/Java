// 1 
// 0   1 
// 1   0   1 
// 0   1   0   1 
// 1   0   1   0   1 
// 0   1   0   1   0   1

public class Zero_one_triangle_pattern_9 {
    public static void main(String [] args)
    {
        int rows = 6;
        for(int i = 1 ; i <= rows ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                if((i + j) % 2 == 0)
                {
                    System.out.print(1 + "  ");
                } 
                else 
                {
                    System.out.print(0 + "  ");
                }
            }
            System.out.println();
        }
    }
}
