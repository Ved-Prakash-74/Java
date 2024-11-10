public class merge_two_array_6 {
    public static void main(String[] args)
    {
        int a[] = { 30, 25, 40 }; 
        int b[] = { 45, 50, 55, 60, 65 }; 

        System.out.println("\nThe first array is ");
        for(int i = 0 ; i < a.length ; i++)
        {
            System.out.print(" " + a[i] + " ");
        }

        System.out.println("\nThe second array is ");
        for(int i = 0 ; i < b.length ; i++)
        {
            System.out.print(" " + b[i] + " ");
        }
        
        int a1 = a.length;
        int b1 = b.length;
        int c1 = a1 + b1;
        int[] c = new int[c1];

        for(int i = 0 ; i < a1 ; i++)
        {
            c[i] = a[i];
        }

        for(int i = 0 ; i < b1 ; i++)
        {
            c[a1 + i] = b[i];
        }

        System.out.println("\nThe merged array");

        for(int i = 0 ; i < c.length ; i++)
        {
            System.out.print(" " + c[i] + " ");
        }


    }
}
