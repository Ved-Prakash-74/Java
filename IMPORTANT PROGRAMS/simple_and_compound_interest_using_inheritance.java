import java.util.Scanner;

public class simple_and_compound_interest_using_inheritance 
{
    public static void main(String args[])
    {
        compound co= new compound();
        co.showsimple();
        co.showcompound();
    }
}
class simple
{
    int p,t,r,amount;
    Scanner sc=new Scanner(System.in);
    simple()
    {
        System.out.print("\nSIMPLE INTEREST");
        System.out.print("\nEnter priciple: ");
        p=sc.nextInt();
        System.out.print("\nEnter Rate of Interest: ");
        r=sc.nextInt();
        System.out.print("\nEnter Time: ");
        t=sc.nextInt();
        amount=p+(p*r*t)/100;
    }
    void showsimple()
    {
        System.out.print("\nTotal is(Simple Interest): " + amount);
    }
}
class compound extends simple
{
    float p,r,t,amount;
    Scanner sc=new Scanner(System.in);
    compound()
    {
        System.out.print("\nCOMPOUND INTEREST");
        System.out.print("\nEnter principle: ");
        p=sc.nextInt();
        System.out.print("\nEnter Rate of Intrest: ");
        r=sc.nextFloat();
        System.out.print("\nEnter Time: ");
        t=sc.nextFloat();
        amount=p*(float)(Math.pow((1+p/100),2));
    }
    void showcompound()
    {
        System.out.print("\nTotal amount is (Compound Interest): "  + amount);
    }
}