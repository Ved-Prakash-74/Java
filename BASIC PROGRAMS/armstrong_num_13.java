import java.util.Scanner;

public class armstrong_num_13 {
    public static void main(String[] args)
    {
        int num , temp , rem , result = 0;
        System.out.println("\nEnter a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();

        temp = num;
        while(temp != 0)
        {
            rem = temp % 10;
            result += rem * rem * rem;
            temp = temp / 10;
        }
        if(result == num)
        {
            System.out.println("Number is Armstrong");
        }
        else
        {
            System.out.println("Number is not Armstrong");
        }
    }
}
