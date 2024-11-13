// static nested class 
// write a program where n number(+ ve and - ve) should be accepted through command line argument in nested form of 
// classes. the outer class will extract all - ve  numbers and inner class will display numbers in sorted order.

import java.util.ArrayList;
class outer_class
{
    static class inner_class
    {
        static void sort(ArrayList<Integer>negatives, int count)
        {
            for(int i=1;i<count;i++)
            {
                for(int j=0;j<count-i;j++)
                {
                    if(negatives.get(j)>negatives.get(j+1))
                    {
                        int temp=negatives.get(j);
                        negatives.set(j,negatives.get(j+1));
                        negatives.set(j+1,temp);
                    }
                }
            }
            System.out.print("\nNegatives in sorted order: ");
            for(int i=0;i<count;i++)
                System.out.print(negatives.get(i)+" ");
            System.out.println();
        }
    }
    void extract_and_sort_negatives(String[] args)
    {
        ArrayList<Integer>negatives=new ArrayList<Integer>();
        int count=0;
        for(int i=0;i<args.length;i++)
        {
            int num=Integer.parseInt(args[i]);
            if(num<0)
            {
                negatives.add(num);
                ++count;
            }
        }
        inner_class.sort(negatives,count);
    }
}
public class nested_class_example_2
{
    public static void main(String args[])
    {
        outer_class obj=new outer_class();
        obj.extract_and_sort_negatives(args);
    }
}
