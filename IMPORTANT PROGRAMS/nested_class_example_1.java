// non static nested class 
// WAP where n numbers should accepted through command line arguments in nested form of classes , the outer  
// class will exract all positive number finally the inner class will find sum of positive prime number

import java.util.LinkedList;
class outer_class
{
    class inner_class
    {
        void print_sum_of_primes()
        {
            int sum=0;
            System.out.print("\nPositive Primes: ");
            while(positives.isEmpty()==false)
            {
                int num=positives.getFirst();
                if((num>1)&&(Test_01.is_prime(num)))
                {
                    System.out.print(num + " ");
                    sum+=num;
                }
            }
            System.out.print("\nSum: " + sum);
        }
    }
    LinkedList<Integer>positives;

    void extract_and_print_sum_of_primes(String[] args)
    {
        positives=new LinkedList<Integer>();
        for(int i=0;i<args.length;i++)
        {
            int num=Integer.parseInt(args[i]);
            if(num>0)
                positives.addLast(num);
        }
        inner_class obj=new inner_class();
        obj.print_sum_of_primes();
    }
}
public class nested_class_example_1
{
    static boolean is_prime(int n)
    {
        boolean n_is_prime=true;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                n_is_prime=false;
                break;
            }
        }
        return n_is_prime;
    }
    public static void main(String [] args)
    {
        outer_class obj=new outer_class();
        obj.extract_and_print_sum_of_primes(args);
    }
}