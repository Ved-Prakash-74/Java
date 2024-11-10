// A number is said to be a magic number if after doing sum of digits in each step and inturn doing sum 
// of digits of that sum, the ultimate result (when there is only one digit left) is 1.

// Example
// 163 => 1+6+3 = 10
// 10 => 1+0 = 1 => Hence 163 is a magic number

import java.util.Scanner;

public class magic_number 
{
    public static void main(String[] args)
    {
        int num , sum_of_digits = 0 , temp ,rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number");
        num = sc.nextInt();
        sc.close();
        
        temp = num;
        while(num > 0 || sum_of_digits > 9)
        {
            if(num == 0)
            {
                num = sum_of_digits;
                sum_of_digits = 0;
            }
            rem = num % 10;
            sum_of_digits += rem;
            num = num / 10;
        }

        if(sum_of_digits == 1)
        {
            System.out.println("\nThe given number " + temp + " is a Magic Number");
        }
        else 
        {
            System.out.println("\nThe given number " + temp + " is not a Magic Number");
        }
    }
}
