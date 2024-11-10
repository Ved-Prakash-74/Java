import java.util.Scanner;

public class get_a_character_from_a_String {
    public static void main(String[] args)
    {
        String s;
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a string");
        s =sc.nextLine();
        System.out.println("\nEnter any index value of string");
        index = sc.nextInt();
        sc.close();

        System.out.println("\nCharecter from string" + s + " at index " + index + " is " + s.charAt(index));
    }
}
