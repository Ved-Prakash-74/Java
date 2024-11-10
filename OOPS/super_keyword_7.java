class vehicle
{
    int maxspeed = 120;
}

class car extends vehicle
{
    int maxspeed = 180;

    void display()
    {
        System.out.println("\nMax speed is " + super.maxspeed);
    }

}

public class super_keyword_7 {
    public static void main(String[] args)
    {
        car ob = new car();
        System.out.println(ob.maxspeed);
        ob.display();
    }
}
