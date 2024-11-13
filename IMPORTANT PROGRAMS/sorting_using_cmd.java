// write a program to sort using command line argument

import java.util.*;

public class sorting_using_cmd
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("\nHow many numbers you want to enter: ");
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                System.out.print("\nEnter element: ");
                arr[i]=sc.nextInt();
            }
            System.out.print("\nArray elements are: ");
            for(int i=0;i<n;i++)
            {
                System.out.print("\n" + arr[i]);
            }

            for(int i=0;i<n;i++)
            {
            	for(int j=1;j<n-i;j++)
            	{
            		if(arr[j-1]>arr[j])
            		{
            			int temp=arr[j-1];
            			arr[j-1]=arr[j];
            			arr[j]=temp;
            		}
            	}
            }
            System.out.print("\n\nArray elements after sorting are: ");
            for(int i=0;i<n;i++)
            {
                System.out.print("\n" + arr[i]);
            }
        }
    }
}