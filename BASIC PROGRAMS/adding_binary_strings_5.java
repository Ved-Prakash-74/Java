import java.util.Scanner;

public class adding_binary_strings_5 
{
    static String adding(String s1 , String s2)
    {
        int num1 = Integer.parseInt(s1 , 2);
        int num2 = Integer.parseInt(s2 , 2);
        int sum = num1 + num2;
        
        String ans = Integer.toBinaryString(sum);
        return ans;
    }
    public static void main(String[] args)
    {
        System.out.println("\nEnter two binary strings");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();

        String result = adding(s1, s2);
        System.out.println("\nResult: " + result);
    }
}
