import java.util.Scanner;

public class matrix_making
{
    public static void main(String[] args)
    {
        int c=0;
        System.out.println("please enter the row value");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[][]=new int[a][];
        for(int i=0;i<a;i++){
            System.out.println("how much value you want to insert in column:-"+(i+1));
            c=sc.nextInt();
            b[i]=new int[c];
            for(int j=0;j<c;j++){
                System.out.println("Enter data of:-"+(i+1));
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a;i++){
            int f=b[i].length;
            for(int j=0;j<f;j++){
                System.out.print(" "+b[i][j]);
            }
            System.out.println("");
        }
    }
}
