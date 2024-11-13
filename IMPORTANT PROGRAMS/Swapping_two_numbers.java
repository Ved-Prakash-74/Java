// swapping of 2 numbers with and without third variable
public class Swapping_two_numbers
{
        public static void main(String args[]) 
        {
            int a=12, b=20;

            System.out.print("\n\nUsing third variable");
            System.out.print("\n\nNumbers before swapping are: " + a + " and " + b);

            int temp = a;
            a = b;
            b = temp;
            System.out.print("\n\nNumbers after swapping using 3rd variable are: " + a + " and " + b);

            System.out.println("\n\n============================================================================================");

            int c=5,d=10;
            System.out.print("\nWithout using third variable");
            System.out.print("\n\nNumbers before swapping are: " + c + " and " + d);
            c = c + d;
            d = c - d;
            c = c - d;
            System.out.print("\n\nNumbers after swapping without using 3rd varible are: " + c + " and " + d);
        }

    }

