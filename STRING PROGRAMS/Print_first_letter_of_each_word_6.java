import java.util.Scanner;

public class Print_first_letter_of_each_word_6 {
    public static void main(String[] args)
    {
        String s;
        System.out.println("\nENter a string");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        sc.close(); 

        System.out.println("\nOriginal String is " + s);

        char[] ch = new char[20];
        ch[0] = s.charAt(0);
        int j = 1;

        for(int i = 0 ; i < s.length() - 1 ; i++)
        {
            if(s.charAt(i) == ' ')
            {
                ch[j++] = s.charAt(i + 1);
            }
        }

        String res = new String(ch , 0 , j);
        System.out.println(res);

    }
}
