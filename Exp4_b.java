import java.util.*;
public class Exp4_b 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);        
        int n,l;
        String s;
        System.out.print("Enter the no. of strings: ");
        n=sc.nextInt();
        Vector<String> str = new Vector<String>(n); 
        System.out.println("Enter the strings");
        for (int i = 0; i <=n; i++) 
        {
            str.add(sc.nextLine());
        }
        System.out.print("Enter the string to be checked: ");
        s=sc.nextLine();
        if(str.contains(s))
        {
        l=str.indexOf(s);
        str.removeElementAt(l);
        }
        else
        str.addElement(s);
        System.out.println(str);
        System.out.println("\""+str.elementAt(0)+"\"");
    }
}
