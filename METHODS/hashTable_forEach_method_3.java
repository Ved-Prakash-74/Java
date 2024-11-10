// The forEach(BiConsumer) method of Hashtable class perform the BiConsumer operation on each entry of 
// hashtable

import java.util.*;;

public class hashTable_forEach_method_3
{
    public static void main(String[] args)
    {
        Map<String , Integer> table = new Hashtable<>();
        table.put("pen" , 10);
        table.put("book" , 500);
        table.put("clothes" , 400);
        table.put("mobile" , 5000);
        table.put("booklet" , 2500);

        table.forEach((k , v) -> {
            v = v + 100;
            table.replace(k , v);
        });

        table.forEach((k , v) ->
        System.out.println("key : " + k + " , value : " + v)
        );

    }
}