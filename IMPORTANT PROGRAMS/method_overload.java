// method overloading
import java.util.Scanner;

class digit_num
{
    int m,n,sum=0,count=0;
    Scanner sc=new Scanner(System.in);
    void digit_of_num()
    {
        System.out.print("\nEnter number (for sum): ");
        m=sc.nextInt();
        while(m>0)
        {
            n=m%10;
            sum=sum+n;
            m=m/10;
        }
        System.out.print("\nSum of Digit: " + sum);
    }
    void digit_of_num(int digi)
    {
        while(digi>0)
        {
            n=digi%10;
            count++;
            digi=digi/10;
        }
        System.out.print("\nCount of Digits: " + count);
    }
    void digit_of_num(int digi,int rev)
    {
        while(digi>0)
        {
            n=digi%10;
            rev=rev*10+n;
            digi=digi/10;
        }
        System.out.print("\nReverse of Digit: " + rev);
    }
}
public class method_overload
{
    public static void main(String args[])
    {
        int rev=0,m1;
        Scanner s1=new Scanner(System.in);
        System.out.print("\nEnter the number (for reverse) : ");
        m1=s1.nextInt();
        digit_num dn=new digit_num();
        dn.digit_of_num();
        dn.digit_of_num(m1);
        dn.digit_of_num(m1,rev);
    }
}

