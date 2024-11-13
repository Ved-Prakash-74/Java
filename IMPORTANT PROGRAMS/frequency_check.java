// program to check frequency of charecter in a string 

import java.util.Scanner;
public class frequency_check
{
    public static void main(String args[])
    {
        String low,str;
        System.out.print("\nEnter string: ");
        Scanner sc=new Scanner(System.in);
        low=sc.nextLine();
        int[] freq =new int[low.length()];
        int i,j;
        str=low.toLowerCase();
        System.out.print(str);
        char string[]=str.toCharArray();
        for(i=0;i<str.length();i++)
        {
            freq[i]=1;
            for(j= i+1;j<str.length();j++)
            {
                if(string[i]==string[j])
                {
                    freq[i]++;
                    string[j]='0';
                }
            }
        }
        System.out.print("\nCharecters and their corresponding frequencies: ");
        for(i=0;i<freq.length;i++)
        {
            if(string[i]!=' ' && string[i]!='0')
                System.out.print(string[i] + "-" + freq[i] + " ");
        }
    }
}
