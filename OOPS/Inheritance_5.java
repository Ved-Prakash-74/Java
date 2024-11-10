class bicycle 
{
    public int gear;
    public int speed;

    public bicycle(int gear , int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    public void apply_break(int decrement)
    {
        speed -= decrement;
    }

    public void speed_up(int increment)
    {
        speed += increment;
    }

    public String printInfo()
    {
        return ("\nNo of gears are: " + gear + "\nSpeed of bicycle is: " + speed);
    }
}

class Mountain_Bike extends bicycle
{
    int seat_height;

    public Mountain_Bike(int gear , int speed , int seat_height)
    {
        super(gear , speed);
        this.seat_height = seat_height;
    }

    @Override public String printInfo()
    {
        return (super.printInfo() + "\nSeat Height is: " + seat_height);
    }
}

public class Inheritance_5{
    public static void main(String[] args)
    {
        Mountain_Bike ob = new Mountain_Bike(3 , 100 , 25);
        System.out.println(ob.printInfo());
    }
    
}
