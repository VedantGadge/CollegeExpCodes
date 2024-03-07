import java.util.*;
public class Exp3_c2 
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter the string: ");
        s=sc.nextLine();
        StringBuffer s_buffer = new StringBuffer(s); // Creating an Stringbuffer object "s_buffer" with the input String "s"
        String s_reverse=s_buffer.reverse().toString();
        if(s.equalsIgnoreCase(s_reverse))
        System.out.println("The given string "+s+" is a palindrome.");
        else
        System.out.println("The given string "+s+" is not a palindrome.");
    }

}