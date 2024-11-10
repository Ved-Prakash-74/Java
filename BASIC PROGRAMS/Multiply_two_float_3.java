import java.util.Scanner;

public class Multiply_two_float_3 {
    public static void main(String [] args)
    {
        float a , b ;
        System.out.println("\n Enter the value of a , b");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        float c = a * b;
        System.out.println("\nProduct of a * b is:" + c);
        sc.close();
    }
}
