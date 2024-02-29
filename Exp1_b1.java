import java.util.*;
public class Exp1_b1
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 1st number: ");
        a=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b=sc.nextInt();
        System.out.println("Enter 3rd number: ");
        c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
            System.out.println("The largest number is: "+a);
            else
            System.out.println("The largest number is: "+c);
        }
        else
        {
            if(b>c)
            System.out.println("The largest number is: "+b);
            else
            System.out.println("The largest number is: "+c);
        }
    }
}