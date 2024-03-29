//Incomplete
public class Exp10_c 
{
    void status()
    {
        System.out.println("Object is alive.");
    }
    protected void finalize()
    {
        System.out.println("Object is dead.");
    }
    public static void main(String[] args) 
    {
        Exp10_c obj = new Exp10_c();
        obj.status();
        obj = null; 
        System.out.println("Executing System.gc()...");
        System.gc();
    }
}
