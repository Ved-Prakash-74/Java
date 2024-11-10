import java.util.ArrayList;
import java.util.Scanner;

public class Remove_duplicates_5 {

    static void remove_duplicates(int arr[] , int n)
    {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!temp.contains(arr[i])) {
                temp.add(arr[i]);
            }
        }

        System.out.println("\nArray without duplicates are");
        for (int i = 0; i < temp.size(); i++) {
            System.out.print(" " + temp.get(i) + " ");
        }
    }
    public static void main(String[] args)
    {
        int n;
        System.out.println("\nENter the size of the array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        int[] arr = new int[n];

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

        remove_duplicates(arr , n);
        sc.close();


    }
}
