import java.util.Scanner;
public class ReadInput_1
{
    public static void main(String [] args)
    {
        int num;
        System.out.println("\nEnter a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("\nEntered a number: " + num); 
        sc.close();
    }
}
