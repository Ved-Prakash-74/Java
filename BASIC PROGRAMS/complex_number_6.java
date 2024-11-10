import java.util.Scanner;

public class complex_number_6 {

    static String adding_complex_number(int real1 , int complex1 , int real2 , int complex2)
    {
        int real = real1 + real2;
        int complex = complex1 + complex2;
        String ans = real + " + " + complex + "i";
        return ans;
    }
    public static void main(String[] args)
    {
        int real1 , real2 , complex1 , complex2;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nFirst complex number");
        System.out.println("\nEnter the real part");
        real1 = sc.nextInt();
        System.out.println("\nEnter the imaginary part");
        complex1 = sc.nextInt();

        System.out.println("\nSecond complex number");
        System.out.println("\nEnter the real part");
        real2 = sc.nextInt();
        System.out.println("\nEnter the imaginary part");
        complex2 = sc.nextInt();

        sc.close();

        System.out.println("\nFirst complex number: " + real1 + " + " + complex1 + "i");
        System.out.println("\nSecond complex number: " + real2 + " + " + complex2 + "i");

        String result = adding_complex_number(real1 , complex1 , real2 , complex2);
        System.out.println("Result : " + result);


    }
    
}
