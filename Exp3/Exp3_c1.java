import java.util.*;
public class Exp3_c1
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1,s2="";
        System.out.print("Enter the string: ");
        s1=sc.nextLine();
        for(int i=0;i<s1.length();i++)
        {
            s2+=s1.charAt(s1.length()-i-1);
        }
        if(s1.equalsIgnoreCase(s2))
        System.out.println("The given string "+s1+" is a palindrome.");
        else
        System.out.println("The given string "+s1+" is not a palindrome.");
    }

}
