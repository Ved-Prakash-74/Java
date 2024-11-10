import java.util.Scanner;

public class Reverse_a_string_3 
{
    public static void main(String[] args)
    {
        String s , rev_s = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a string");
        s =sc.nextLine();
        sc.close();

        for(int i = s.length() - 1 ; i >= 0 ; i--)
        {
            rev_s += s.charAt(i);
        }
        System.out.println("\nOriginal String " + s);
        System.out.println("\nReversed String " + rev_s);

    }
}


// import java.lang.*;
// import java.io.*;
// import java.util.*;

// class ReverseString {
// 	public static void main(String[] args)
// 	{
// 		String input = "Geeks for Geeks";

// 		StringBuilder input1 = new StringBuilder();

		
// 		input1.append(input);

		
// 		input1.reverse();

		
// 		System.out.println(input1);
// 	}
// }

