import java.util.Scanner;

public class sum_of_two_numbers {
    public static void main(String args[]) {
        int a, b, c;
        try (Scanner input = new Scanner(System.in)) 
        {
            System.out.print("\nEnter 1st number: ");
            a = input.nextInt();
            System.out.print("\nEnter 2nd number: ");
            b = input.nextInt();
        }
        c = a + b;
        System.out.println("\nSum of " + a + " and " + b + " is " + c);
    }
}
