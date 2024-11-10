import java.util.Arrays;

public class Check_if_two_Arrays_are_Equal_or_not_7
{
    public static void main(String[] args)
    {
        int[] a = {30 , 25 , 40};
        int[] b = {30 , 25 , 40};
        int[] c = {30 , 25 , 40 , 23};
        int[] d = {30 , 26 , 40};

        System.out.println("\nThe first array is");
        for(int i = 0 ; i < a.length ; i++)
        {
            System.out.print(" " + a[i] + " ");
        }

        System.out.println("\nThe second array is");
        for(int i = 0 ; i < b.length ; i++)
        {
            System.out.print(" " + b[i] + " ");
        }

        System.out.println("\nChecking both arrays are equal or not");
        boolean result1 = Arrays.equals(a, b);

        System.out.println(result1);
        
        System.out.println("\nThe third array is");
        for(int i = 0 ; i < c.length ; i++)
        {
            System.out.print(" " + c[i] + " ");
        }
        
        System.out.println("\nThe fourth array is");
        for(int i = 0 ; i < d.length ; i++)
        {
            System.out.print(" " + d[i] + " ");
        }
        
        System.out.println("\nChecking both arrays are equal or not");
        boolean result2 = Arrays.equals(c, d);
        System.out.println(result2);


    }
}