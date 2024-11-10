import java.util.Scanner;

public class largest_element_in_an_array_2 {
    public static void main(String[] args)
    {
        int size;
        System.out.println("\nEnter the size of the array");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("\nEnter the array elements");
        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray elements are");
        for(int i = 0 ; i < size ; i++)
        {
            System.out.println(arr[i]);
        }

        int max = 0;
        for(int i = 0 ; i < size ; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        sc.close();
        System.out.println("\nLargest element is " + max);

    }
}
