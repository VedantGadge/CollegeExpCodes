class Vehicle
{
    int speed;
    Vehicle()
    {
        speed = 150;
    }
    void display()
    {
        System.out.println("The displaying the intial value of the variable from super class is: "+speed);
    }
}
class Bike extends Vehicle
{
    int speed = 200;
    Bike()
    {
        super(); //Contructor call must always be the first statement in a constructor.
        super.display();
        System.out.println("The value of variable in super class is "+super.speed);
        System.out.println("The value of variable in child class is "+speed);
    }
}

public class Exp8_b 
{
    public static void main(String[] args) 
    {
        Bike obj = new Bike();
    }
}
