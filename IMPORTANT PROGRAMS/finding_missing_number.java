// Given an array of non-duplicating numbers from 1 to n where one number is missing, write an 
// efficient java program to find that missing number. 

public class finding_missing_number 
{
    public static void main(String[] args)
    {
        int[] arr = {4 , 3 , 8 , 7 , 5 , 2 , 6};
        int len = arr.length + 1;

        // calculating sum of all natural number to n
        int actual_sum = len * (len + 1) / 2;

        // calculating sum of arr
        int arr_sum = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr_sum += arr[i];
        }

        // finding missing number
        int missing_number = actual_sum - arr_sum;

        System.out.println("\nThe missing number is " + missing_number);
    }
}
