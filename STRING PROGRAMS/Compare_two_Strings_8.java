import java.util.Scanner;

public class Compare_two_Strings_8 {
    public static void main(String[] args)
    {
        String str1 , str2;
        System.out.println("\nENter two string");
        Scanner sc = new Scanner(System.in);
        str1 = sc.nextLine();
        str2 = sc.nextLine(); 
        sc.close();
        
        if(str1.equals(str2))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
