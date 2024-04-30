class printTable extends Thread
{
    int n;
    printTable(int n)
    {
        this.n=n;
    }
    public void run()
    {
        for(int i=1;i<=10;i++)
    {
        System.out.println(n+"\tx\t"+i+"\t=\t"+(n*i));
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e){}
    }
    }
}


public class Exp13_a 
{
    public static void main(String[] args) 
    {
        printTable obj1 = new printTable(5);
        obj1.start();
        printTable obj2 = new printTable(7);
        obj2.start();
        printTable obj3 = new printTable(13);
        obj3.start();
    }
}
