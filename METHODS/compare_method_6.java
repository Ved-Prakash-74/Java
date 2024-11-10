// The compare() method in Java compares two objects given as parameters. 

// It returns the value: 
// 0: if (x==y)
// -1: if (x < y)
// 1: if (x > y)

public class compare_method_6 {
    public static void main(String[] args)
    {
        int a = 20;
        int b = 20;

        System.out.println(Integer.compare(a, b));

        int x = 20;
        int y = 30;

        System.out.println(Integer.compare(x, y));

        int p = 30;
        int q = 20;
        System.out.println(Integer.compare(p, q));
    }
}
