import java.util.*;
abstract class Area
{
abstract float calcArea();
}

class Circle extends Area
{
float r;
Circle(float r)
{
this.r=r;
}
public float calcArea()
{
float area_circle=3.142f*r*r;
return area_circle;
}
}

class Triangle extends Area
{
float b,h;
Triangle(float b,float h)
{
this.b=b;
this.h=h;
}
public float calcArea()
{
float area_tri=0.5f*b*h;
return area_tri;
}
}


class Rectangle extends Area
{
float a,b;
Rectangle(float a,float b)
{
this.a=a;
this.b=b;
}
public float calcArea()
{
float area_rect=a*b;
return area_rect;
}
}

public class Exp11_a 
{
    public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
float area;
System.out.println("Enter radius of circle: ");
float r = sc.nextFloat();
Circle c = new Circle(r);
area = c.calcArea();
System.out.println("Area of circle: "+area);

System.out.println("Enter base of triangle: ");
float b = sc.nextFloat();
System.out.println("Enter hieght of triangle: ");
float h = sc.nextFloat();
Triangle t = new Triangle(b,h);
area = t.calcArea();
System.out.println("Area of triangle: "+area);

System.out.println("Enter length of rectangle: ");
float l = sc.nextFloat();
System.out.println("Enter breadth of rectangle: ");
float br = sc.nextFloat();
Rectangle rect = new Rectangle(l,br);
area = rect.calcArea();
System.out.println("Area of rectangle: "+area);
}
}

