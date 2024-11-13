public class stack_operations
{
    public static void main(String args[])
    {
        stack st = new stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
		st.display();
        st.pop();
        st.pop();
        st.display();
    }
}
class stack
{
    int arr[];
    int top;
    int capacity;
    public stack(int size)
    {
        arr = new int[size];
        capacity  = size;
        top = -1;
    }
    
    public boolean isEmpty()
    {
        return top == -1;
    }
    
    public boolean isFull()
    {
        return top == capacity-1;
    }
    
    public void push(int num)
    {
        System.out.println("\nPush operation ......");
        if(isFull())
        {
            System.out.println("\nStack is Full");
            System.exit(1);
        }
        System.out.println("\nPushing - "+num);
        arr[++top] = num;
    }
    
    public int pop()
    {
        System.out.println("\nPop operation...");
       if(isEmpty())
       {
           System.out.println("\nStack is Underflow ");
           System.exit(-1);
       }
       System.out.println("\nPopping - "+arr[top]);
       return arr[top--];
    }
       
    public void display()
    {
        if(top == -1)
            System.out.println("\nStack is Empty...");
        System.out.println("\nStack elements are : ");
        for(int i=0; i<=top; i++)
            System.out.print(arr[i] +" ");
        System.out.println();
    }
}