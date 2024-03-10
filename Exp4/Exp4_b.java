import java.util.*;
public class Exp4_b 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);        
        int n;
        String s;
        Vector<String> str = new Vector<String>(); 
        System.out.print("Enter the no. of strings: ");
        n=sc.nextInt();
        System.out.println("Enter the strings");
        for (int i = 0; i <n+1; i++) 
        {
            str.add(sc.nextLine());
        }
        System.out.print("Enter the string to be checked: ");
        s=sc.next();
        if(str.contains(s))
        {
        str.remove(str.indexOf(s));
        }
        else
        str.addElement(s);
        System.out.println(str);
        System.out.println("Added/Removed: \""+s+"\"");
    }
}
