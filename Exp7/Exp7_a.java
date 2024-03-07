public class Exp7_a 
{
    static int count=0; //here writing static is neccessary else, everytime we create a new object the value of count will be reset to 0,and give us final output as 1
    Exp7_a()
    {
        count++;
    }
    public static void main(String[] args) 
    {
        Exp7_a ob1 = new Exp7_a();
        Exp7_a ob2 = new Exp7_a();
        Exp7_a ob3 = new Exp7_a();
        System.out.println("The number of objects: "+count);
    }
}
