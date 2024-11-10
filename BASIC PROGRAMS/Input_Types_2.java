 
// Java program to demonstrate BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Input_Types_2 {
    public static void main(String [] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println(name);
    }
}

// Java program to demonstrate working of Scanner in Java
// import java.util.Scanner;
// class Input_Types_2 {
//     public static void main(String args[])
//     {
//         // Using Scanner for Getting Input from User
//         Scanner in = new Scanner(System.in);
 
//         String s = in.nextLine();
//         System.out.println("You entered string " + s);
 
//         int a = in.nextInt();
//         System.out.println("You entered integer " + a);
 
//         float b = in.nextFloat();
//         System.out.println("You entered float " + b);
//     }
// }


// Java program to demonstrate working of System.console()
// Note that this program does not work on IDEs as
// System.console() may require console
// public class Input_Types_2 {
//     public static void main(String[] args)
//     {
//         // Using Console to input data from user
//         String name = System.console().readLine();
 
//         System.out.println("You entered string " + name);
//     }
// }



// Program to check for command line arguments
// class Input_Types_2 {
//     public static void main(String[] args)
//     {
//         // check if length of args array is
//         // greater than 0
//         if (args.length > 0) {
//             System.out.println(
//                 "The command line arguments are:");
 
//             // iterating the args array and printing
//             // the command line arguments
//             for (String val : args)
//                 System.out.println(val);
//         }
//         else
//             System.out.println("No command line "
//                                + "arguments found.");
//     }
// }