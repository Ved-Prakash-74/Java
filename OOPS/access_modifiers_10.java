// Access modifiers help to restrict the scope of a class, constructor, variable, method, or data 
// member. It provides security, accessibility, etc

// Types
// i) Default – No keyword required
// ii) Private
// iii) Protected
// iv) Public


// Example of Default 
// 1st java file
// package p1; 

// Class Geek is having Default access modifier 
// class Geek 
// { 
// 	void display() 
// 	{ 
// 		System.out.println("Hello World!"); 
// 	} 
// } 


// 2nd java file
// package p2; 
// import p1.*; 

// This class is having default access modifier 
// class GeekNew 
// { 
// 	public static void main(String args[]) 
// 	{ 
// 		// Accessing class Geek from package p1 
// 		Geek obj = new Geek(); 

// 		obj.display(); 
// 	} 
// } 


// Example of Private access modifier
// class A {
// 	private void display()
// 	{
// 		System.out.println("GeeksforGeeks");
// 	}
// }

// class B {
// 	public static void main(String args[])
// 	{
// 		A obj = new A();
		
// 		obj.display();
// 	}
// }



// Example of Protected access modifier
// public class A {
//     protected void display()
//     {
//         System.out.println("GeeksforGeeks");
//     }
// }
// class B extends A {
//     public static void main(String args[])
//     {
//         B obj = new B();
//         obj.display();
//     }
// }



// Example of Public access modifier
// public class A 
// { 
// public void display() 
//     { 
//         System.out.println("GeeksforGeeks"); 
//     } 
// }
// class B {
//     public static void main(String args[])
//     {
//         A obj = new A();
//         obj.display();
//     }
// }