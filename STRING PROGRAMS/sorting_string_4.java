import java.util.Scanner;
import java.util.Arrays;

public class sorting_string_4 {
    public static void main(String[] args)
    {
        String s;
        System.out.println("\nENter a string");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        sc.close();

        System.out.println("\nOriginal string is " + s);

        char tempArray[] = s.toCharArray();
        Arrays.sort(tempArray);

        System.out.println("\nSorted string is " + new String(tempArray));
    }
}
