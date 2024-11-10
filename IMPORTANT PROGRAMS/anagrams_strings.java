// Anagrams means that with same string different meaning words can be formed. 

import java.util.*;

public class anagrams_strings 
{
    public static void main(String[] args)
    {
        String str1 , str2;
        Scanner sc = new Scanner(System.in); 
        System.out.println("\nEnter two Strings");
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        sc.close();

        if(str1.length() == str2.length())
        {
            char[] s1 = str1.toCharArray();
            char[] s2 = str2.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);

            System.out.println(s1);
            System.out.println(s2);
            

            if(Arrays.equals(s1, s2))
            {
                System.out.println(str1 + " and " + str2 + " are in anagrams");
            }
            else 
            {
                System.out.println(str1 + " and " + str2 + " are not in anagrams");
            }
        }
        else 
        {
            System.out.println(str1 + " and " + str2 + " are not in anagrams");
        }
    }
}
