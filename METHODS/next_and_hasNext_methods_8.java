// hasNext() method is used to check whether there is any element remaining in the List. This method 
// is a boolean type method, it returns true if the list contains next element from the current Position
// else it will return false.

// next() method is used to display the elements in the list at which is pointing.


import java.util.*;
// Example of hasNext()
public class next_and_hasNext_methods_8 {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");

        Iterator<String> iterator = list.iterator();

        System.out.println(iterator.hasNext()); //checks wheather list has next element or not

        System.out.println(iterator.next()); // prints the current element.

        System.out.println(iterator.hasNext());

        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());

        System.out.println(iterator.next());// it gives error as list has no element.
    }
    
}
