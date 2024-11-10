import java.util.Scanner;

public class Check_if_a_value_is_present_1
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("\nEnter the size of the array");
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

        int key_ele , flag = 0;
        System.out.println("\nEnter the search element");
        key_ele = sc.nextInt();
        sc.close();

        for(int i = 0 ; i < n ; i ++)
        {
            if(arr[i] == key_ele)
            {
                flag = 1;
                break;
            }
        }

        if(flag == 1)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}