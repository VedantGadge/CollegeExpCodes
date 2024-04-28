import java.util.*;

interface Interface1 
{
    String reversal();
}

class Exp9_a implements Interface1 
{
    String str;

    Exp9_a(String str) 
    {
        this.str = str;
    }
    public String reversal()
    {
        String rev="";
        char temp;
        for(int j=str.length()-1;j>=0;j--)
        {
            temp=str.charAt(j);
            rev+=temp;
        }
        return rev;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter the string to reverse: ");
        str=sc.nextLine();
        Exp9_a obj = new Exp9_a(str); //We need to use and pass the str value through an object, else it gives static error.
        System.out.println("The reversed string is: "+obj.reversal());
    }
}
