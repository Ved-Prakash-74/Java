import java.util.Scanner;

public class print_Even_length_words_9 {
     public static void main(String[] args)
    {
        String str;
        System.out.println("\nENter a string");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        sc.close();

        for(String words : str.split(" "))
        {
            if(words.length() % 2 == 0)
            {
                System.out.println(words);
            }
        }
    }
}
