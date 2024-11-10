import java.util.Scanner;
import java.util.Arrays;

public class sorting_an_array_3 {
    public static void main(String[] args)
    {
        int n;
        System.out.println("\nEnter the size of the array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("\nEnter array elements");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nOriginal array");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);

        System.out.println("\nSorted array");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
