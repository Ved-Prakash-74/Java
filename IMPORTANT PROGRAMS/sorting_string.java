// sort string in alphabetical order
import java.util.*; 
public class sorting_string
{
    public static void main(String args[])
    {
        char temp;
        char str3[]=new char[100];
        String str, word2=" ",word3="";
        int i, len,ind=0,l1,j,k,t;
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter string: ");
        str=sc.nextLine();
        String str2[]=str.split(" ");
        len=str2.length;
        for(i=0;i<len;i++)
        {
            str3=str2[i].toCharArray();
            l1=str2[i].length();
            for(j=0;j<l1;j++)
            {
                for(k=0;k<l1-j-1;k++)
                {
                    if(str3[k]>str3[k+1])
                    {
                        temp=str3[k];
                        str3[k]=str3[k+1];
                        str3[k+1]=temp;
                    }
                }
            }
            word2="";
            for(t=0;t<l1;t++)
            {
                word2=word2+str3[t];
            }
            word2=word2+" ";
            word3=word3+word2;
        }
        System.out.print("\nAfter sorting string is: " + word3);
    }
}    

