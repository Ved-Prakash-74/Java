public class bubble_sort
{
	public static void main(String args[])
	{
		int arr[]={99,33,44,22,66};
		int n=arr.length;
		System.out.print("\nArray elements are: ");
		for(int i=0;i<n;i++)
		{
			System.out.print("\n " + arr[i]);
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
		System.out.print("\n\nAfter sorting Array elements are: ");
		for(int i=0;i<n;i++)
		{
			System.out.print("\n " + arr[i]);
			
		}
	}
}