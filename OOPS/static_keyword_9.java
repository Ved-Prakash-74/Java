// Static keyword - The static keyword in Java is mainly used for memory management. The static keyword 
//in Java is used to share the same variable or method of a given class

class static_keyword_9
{
	// static variable
	static int a = m1();
	
	// static block
	static 
    {
		System.out.println("Inside static block");
	}
	
	// static method
	static int m1() {
		System.out.println("from m1");
		return 20;
	}
	
	// static method(main !!)
	public static void main(String[] args)
	{
	System.out.println("Value of a : "+a);
	System.out.println("from main");
	}
}

