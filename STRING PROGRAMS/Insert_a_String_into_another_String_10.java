import java.util.Scanner;

public class Insert_a_String_into_another_String_10 {
    public static void main(String[] args)
    {
        String str , s , new_str;
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a string");
        str = sc.nextLine();
        System.out.println("\nEnter a string to be inserted");
        s = sc.nextLine();
        System.out.println("\nEnter index where you want string to be inserted");
        index = sc.nextInt();
        
        sc.close();

        System.out.println("\nOriginal String is " + str);

        new_str = str.substring(0 , index) + s + str.substring(index + 1);

        System.out.println("\nModified String is " + new_str);
    }
}
