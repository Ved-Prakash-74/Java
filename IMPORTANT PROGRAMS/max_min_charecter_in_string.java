// WAP to enter a string and find the max and min character of every word in string.
import java.util.*;
public class max_min_charecter_in_string
{
    public static void main(String args[])
    {
        char a = ' ', b = ' ';
        String str;
        char str3[] = new char[100];
        int i, ind=0, l1, j=0, k, t;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any String : ");
        str = s.nextLine();
        String str2[] = str.split(" ");
        int size = str2.length;
        for(i=0; i<size; i++)
        {
            str3 = str2[i].toCharArray();
            l1 = str2[i].length();
            System.out.println(str3);
            for(j=0; j<l1; j++)
            {
                for(k=0; k<l1-j-1; k++)
                {
                    if(str3[k] > str3[k+1])
                    {
                           a = str3[k];
                    }
                    if(str3[k] < str3[k+1])
                    {
                        b = str3[k];
                    }
                }
            }
            System.out.println("Maximum Character : "+a+"  ||  Minimum Character : "+b);
        }
    }
}