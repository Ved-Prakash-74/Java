// program to print predecessor and successor

import java.util.*;
public class predecessor_and_successor
{
    public static void main(String args[])
    {
        int n;
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("\nEnter a number: ");
            n=sc.nextInt();
        }
        int pre=n-1;
        int succ=n+1;
        System.out.print("\nSuccessor of " + n + " is: " + succ);
        System.out.print("\nPredecessor of " + n + " is: " + pre);
    }

}
