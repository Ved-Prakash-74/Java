import java.util.Scanner;

public class leap_year_12 {
    public static void main(String[] args)
    {
        int year;
        boolean leap_year = false;
        System.out.println("\nEnter a year");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        sc.close();

        if(year % 4 == 0)
        {
            leap_year = true;
            
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    leap_year = true;
                }
                else
                {
                    leap_year = false;
                }
            }
        }
        else
        {
            leap_year = false;
        }

        if(leap_year)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Non - Leap Year");
        }
    }
    
}
