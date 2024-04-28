public class Exp10_c 
{
    void status()
    {
        System.out.println("Object is created.");
    }
    protected void finalize()
    {
        System.out.println("Object has been deleted.");
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
