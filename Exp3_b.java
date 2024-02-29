import java.util.*;
public class Exp3_b 
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        char c;
        int ctr=0;
        System.out.print("Enter the string: ");
        s=sc.nextLine();
        System.out.print("Enter the character to check its frequency: ");
        c=sc.nextLine().charAt(0);
        for(int i=0;i<s.length();i++)
        {
            if(c==s.charAt(i))
            ctr++;
            else
            continue;
        }
        System.out.println("The frequency of the given character "+c+" is "+ctr);
    }
}
