import java.util.Scanner;

public class Remove_Leading_Zeros_7 {
    public static void main(String[] args)
    {
        String str;
        int index = 0;
        System.out.println("\nEnter the string");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        sc.close();

        for(int i = 0 ; i < str.length() ; i++)
        {
            char p = str.charAt(i);
            if(p != '0')
            {
                index = i;
                break;
            }
        }

        String new_str = str.substring(index, str.length());
        System.out.println(new_str);
    }
    
}
