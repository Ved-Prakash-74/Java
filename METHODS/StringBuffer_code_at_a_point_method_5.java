// The codePointAt() method of StringBuffer class returns a character Unicode point at that index
// or it returns the ascii value of the charecter.

public class StringBuffer_code_at_a_point_method_5 {
    public static void main(String[] args) 
    { 
        StringBuffer str = new StringBuffer(); 
        str.append("Geeksforgeeks"); 

        int unicode = str.codePointAt(10); 
  
        System.out.println("Unicode of Character "
                           + "at Position 10 "
                           + "in StringBuffer = "
                           + unicode); 
    }
}
