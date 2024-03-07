import java.util.*;
public class Exp1_b2 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int a,b,c,max=0;
        System.out.println("Enter 1st number: ");
        a=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b=sc.nextInt();
        System.out.println("Enter 3rd number: ");
        c=sc.nextInt();
        max = (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("The largest number is: "+max);
    }
}
