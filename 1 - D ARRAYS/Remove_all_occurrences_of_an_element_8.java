import java.util.Scanner;

public class Remove_all_occurrences_of_an_element_8 {
    public static void main(String[] args)
    {
        int n , ele;
        System.out.println("\nENter the size of the array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("\nENter the array elements");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray elements are");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("\nEnter the element you want to remove");
        ele = sc.nextInt();

        int[] temp = new int[n];
        int j = 0;

        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i] != ele)
            {   
                temp[j] = arr[i];
                j++;
            }
        }

        System.out.println("\nArray elements after modification");
        for(int i = 0 ; i < j ; i++)
        {
            System.out.println(temp[i]);
        }

        sc.close();
        
    }
}
