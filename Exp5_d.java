public class Exp5_d 
{
    static int count=0;
    static void Counter()
    {
        count++;
    }
    public static void main(String args[])
    {
        Exp5_d obj1 = new Exp5_d();
        Exp5_d obj2 = new Exp5_d();
        Exp5_d obj3 = new Exp5_d();
        Exp5_d obj4 = new Exp5_d();
        Exp5_d obj5 = new Exp5_d();
        obj1.Counter();
        obj2.Counter();
        obj3.Counter();
        obj4.Counter();
        obj5.Counter();
        System.out.println("The number of objects are: "+count);
    }
}
