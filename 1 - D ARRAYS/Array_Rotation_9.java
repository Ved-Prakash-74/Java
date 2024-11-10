import java.util.Scanner;

public class Array_Rotation_9 {
    public static void main(String[] args)
    {
        int n , rotation_key;
        System.out.println("\nENter the size of the array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("\nEnter the array elements");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray elements are");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("\nEnter the rotation value");
        rotation_key = sc.nextInt();
        
        int[] temp = new int[n];
        int k = 0;

        for(int i = rotation_key ; i < n; i++)
        {
            temp[k] = arr[i];
            k++;
        }

        for(int i = 0 ; i < rotation_key ; i++)
        {
            temp[k] = arr[i];
            k++;
        }

        System.out.println("\nRotated array elements are");
        for(int i = 0 ; i < temp.length ; i++)
        {
            System.out.println(temp[i]);
        }
        sc.close();

    }
}
