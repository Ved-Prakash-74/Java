// method overridding
import java.util.Scanner;

class employee
{
    String name;
    int code, basic;
    Scanner sc= new Scanner(System.in);
    employee()
    {
        System.out.print("\nEnter employee code: ");
        code=sc.nextInt();
        System.out.print("\nEnter employee name: ");
        name=sc.next();
        System.out.print("\nEnter employee basic: ");
        basic=sc.nextInt();
    }
    void show()
    {
        System.out.print("\nEmployee code is: " + code);
        System.out.print("\nEmployee name is: " + name);
        System.out.print("\nEmployee basic is: " + basic);
    }
}
class incometax extends employee
{
    double da,hra,gs=0,tax=0,ansal;
    incometax()
    {
        da=(50*basic)/100;
        hra=(15*basic)/100;
        gs=basic+hra+da;
        ansal=gs*12;
        if(ansal<100000)
        {
            tax=0;
        }
        else if(ansal>100000 && ansal<=150000)
        {
            tax=(ansal-100000)*0.1;   
        }
        else if(ansal>150000 && ansal<=250000)
        {
            tax=5000+(ansal-250000)*0.2;
        }
        else
        {
            tax=15000+(ansal-250000)*0.3;
        }
    }
    void show()
    {
        super.show();
        System.out.print("\nDA is: " + da);
        System.out.print("\nHRA is: " + hra);
        System.out.print("\nGS is: " + gs);
        System.out.print("\nAnsal is: " + ansal);
        System.out.print("\nTax is: " + tax);
    }

}
public class Method_Override
{
    public static void main(String args[])
    {
        incometax it = new incometax();
        it.show();
    }
}