// To check wheather a number given as input is the sum of two prime numbers or not

import java.util.*;
public class number_is_sum_of_two_prime_num 
{
    static boolean isPrime(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        for(int i = 2 ; i <= Math.sqrt(n) ; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number");
        num = sc.nextInt();
        sc.close();
    
        boolean found = false;

        for(int i = 2 ; i <= num / 2 ; i++)
        {
            if(isPrime(i) && isPrime(num - i))
            {
                System.out.println(num + " is the sum of " + i + " and " + (num - i));
                found = true;
                break;
            }
        }

        if(!found)
        {
            System.out.println(num + " is not the sum of the prime numbers");
        }
    }   
        
}

