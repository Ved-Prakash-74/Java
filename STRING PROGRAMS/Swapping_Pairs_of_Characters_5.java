import java.util.Scanner;

public class Swapping_Pairs_of_Characters_5 {
    public static void main(String[] args)
    {
        String str;
        System.out.println("\nEnter the string");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        sc.close();

        if(str == null)
        {
            System.out.print(str);
        }

        char[] ch = str.toCharArray();

        for(int i = 0 ; i < ch.length - 1 ; i += 2)
        {
            char temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;
        }
        System.out.println("\nSwapped String is " + new String(ch));

    }
}
