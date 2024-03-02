public class Exp7_b 
{
    int area;
    public Exp7_b(int l,int b) //Parameterized constructor
    {
        this.area = l*b;
    }
    public Exp7_b(int s) //Parameterized constructor
    {
        this.area = s*s;
    }
    public Exp7_b() //Non-Parameterized constructor
    {
        this.area = 0;
    }
    public Exp7_b(Exp7_b shape) //Copy constructor
    {
        this.area = shape.area;
    }
    int Area()
    {
        return area;
    } 
    public static void main(String args[])
    {
        Exp7_b square = new Exp7_b(5);
        Exp7_b rectangle = new Exp7_b(5,10);
        Exp7_b empty = new Exp7_b();
        Exp7_b copySquare = new Exp7_b(square);
        Exp7_b copyRectangle = new Exp7_b(rectangle);
        System.out.println("The area of the square is: "+square.Area());
        System.out.println("The area of the rectangle is: "+rectangle.Area());
        System.out.println("The area of the empty shape is: "+empty.Area());
        System.out.println("The area of the copied square is: "+copySquare.Area());
        System.out.println("The area of the copied rectangle is: "+copyRectangle.Area());
    }
}
