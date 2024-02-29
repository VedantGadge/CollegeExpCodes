import java.util.*;
public class Exp5_b 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter 1 to calculate area of a square");
        System.out.println("Enter 2 to calculate area of a rectangle");
        n=sc.nextInt();
        if(n==1)
        {
            float a;
            System.out.print("Enter side of the square: ");
            a=sc.nextFloat();
            calArea(a);
        }
        else if(n==2)
        {
            float l,b;
            System.out.print("Enter length of the square: ");
            l=sc.nextFloat();
            System.out.print("Enter breadth of the square: ");
            b=sc.nextFloat();
            calArea(l,b);
        }
        else
        System.out.println("Enter a valid option!!");
    }
    static void calArea(float a)
    {
        float area = a*a;
        System.out.println("The area of the square is: "+area);
    }
    static void calArea(float l,float b)
    {
        float area = l*b;
        System.out.println("The area of the rectangle is: "+area);
    }
}
