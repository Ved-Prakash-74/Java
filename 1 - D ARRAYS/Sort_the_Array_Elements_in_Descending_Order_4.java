import java.util.*;

public class Sort_the_Array_Elements_in_Descending_Order_4 {
    public static void main(String[] args)
    {
        int n;
        System.out.println("\nEnter the size of the array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Integer[] arr = new Integer[n];

        System.out.println("\nEnter array elements");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray elements are");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(" " + arr[i] + " ");
        }

        Arrays.sort(arr , Collections.reverseOrder());

        System.out.println("\nArray elements in decresing order are");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(" " + arr[i] + " ");
        }

        sc.close();
    }
}
