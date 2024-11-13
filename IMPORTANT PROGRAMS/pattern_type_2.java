
// print pattern 1
//               2  3
//               4  5  6

import java.util.*;
public class pattern_type_2
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int c=1;
            System.out.print("\nEnter number of rows: ");
            int r=sc.nextInt();
            for(int i=1;i<=r;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(c + "  ");
                    c++;
                }
                System.out.print("\n");
            }
        }
    }
}
