// Difference between Static and Non - static methods.

// Static method 
// i) A static method is a method that belongs to a class, but it does not belong to an instance of that class
// ii) In the static method, the method can only access only static data members and static methods of 
//     another class or same class.
// iii) The static method uses compile-time or early binding.
// iv) The static method cannot be overridden because of early binding.
// V) In the static method, less memory is used for execution because memory allocation happens only once.


// Non-static method
// i)Every method in Java defaults to a non-static method without a static keyword preceding it.
// ii) In the non-static method, the method can access static data members and static methods as well as 
//     non-static members and methods of another class or the same class.
// iii) The non-static method uses runtime or dynamic binding.
// iv) The non-static method can be overridden because of runtime binding.
// V) In the non-static method, much memory is used for execution because here memory allocation happens 
// when the method is invoked


// Example of accessing data members and methods.
class test 
{
    int sum(int a , int b)
    {
        return a + b;
    }
}

public class static_and_non_static_method_2 {
    public static void main(String[] args)
    {
        test ob = new test();
        int result = ob.sum(4, 5);
        System.out.println(result);
    }
    
}


// Override of static method
// class Parent {

// 	// static method
// 	static void show()
// 	{
// 		System.out.println("Parent");
// 	}
// }

// // Parent inherit in Child class
// class Child extends Parent {

// 	// override show() of Parent
// 	void show()
// 	{
// 		System.out.println("Child");
// 	}
// }

// class GFG {
// 	public static void main(String[] args)
// 	{
// 		Parent p = new Parent();
// 		// calling Parent's show()
// 		p.show();
// 		// cannot override Parent's show()
        // To override it we need to remove the static keyword from parent class.
// 	}
// }
