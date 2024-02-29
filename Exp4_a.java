import java.util.*;
public class Exp4_a 
{
    public static void main(String args[])
    {
        int n = args.length;
        Vector<String> name = new Vector<String>(n);
        for(int i=0;i<n;i++)
        {
            name.addElement(args[i]);
        }
        System.out.println(name);
    }
}
