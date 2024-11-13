
// print pattern   1
//                 1  2
//                 1  2  3

import java.util.*;
public class pattern_type_1
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("\nEnter no of rows: ");
            int r=sc.nextInt();
            for(int i=1;i<=r;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j);
                }
                System.out.print("\n");
            }
        }
    }
}
