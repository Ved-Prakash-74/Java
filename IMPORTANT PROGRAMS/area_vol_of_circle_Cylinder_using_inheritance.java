import java.util.Scanner;

class circle 
{
    double area1;

    double get_circle_area(double r)
    {
        area1 = 3.14 * r * r;
        return area1;
        
    }

    double get_radius(double r) 
    {
        return r;
    }

    void set_radius(double rad) 
    {
        get_radius(rad);
        get_circle_area(rad);
    }
}

class cylinder extends circle 
{
    double height,area2,vol;

    double get_height(double ht)
    {
        return ht; 
    }

    void set_height(double r, double ht)
    {
       
        get_height(ht);
        get_cylinder_area(r,ht);
        get_cylinder_volume(r,ht);
    }
    double get_cylinder_area(double r,double h)
    {
        area2 = (2*3.14*r*h)+(2*3.14*r*r);
        return area2;
    }

    double get_cylinder_volume(double r,double h)
    {
        vol = 3.14*r*r*h;
        return vol;
    }     
}
public class area_vol_of_circle_Cylinder_using_inheritance
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter radius: ");
        double rad = sc.nextDouble();
        circle cr = new circle();
        cr.set_radius(rad);
        System.out.print("\nRadius of circle is: " + rad);
        System.out.print("\nArea of circle is: " + cr.area1);

        System.out.print("\nEnter height: ");
        double ht = sc.nextDouble();
        cylinder cy = new cylinder();
        cy.set_height(rad,ht);
        System.out.print("\nRadius of cylinder is: " + rad);
        System.out.print("\nHeight of cylinder is: " + ht);
        System.out.print("\nArea of cylinder is: " + cy.area2);
        System.out.print("\nVolume of cylinder is: " + cy.vol);
    }
}
