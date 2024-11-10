import java.util.Scanner;

public class Replace_a_character_at_a_specific_index_2 {
    public static void main(String[] args)
    {
        String s;
        int index;
        char replace_c;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a string");
        s = sc.nextLine();
        System.out.println("\nEnter any index value of string");
        index = sc.nextInt();
        System.out.println("\nEnter charecter you want to inswrt");
        replace_c = sc.next().charAt(0);
        sc.close();

        System.out.println("\nOrginal string " + s);
        
        s = s.substring(0 , index) + replace_c + s.substring(index + 1);

        System.out.println("\nModified string " + s);
    }
}
