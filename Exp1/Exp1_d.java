import java.util.*;
public class Exp1_d
{
    public static void main(String argsp[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,n;
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        n=sc.nextInt();
        switch(n)
        {
            case 1:
            System.out.println("The addition of the two numbers is: "+(a+b));
            break;
            case 2:
            System.out.println("The subtraction of the two number is: "+(a-b));
            break;
            case 3:
            System.out.println("The multiplication of the two numbers is: "+(a*b));
            break;
            case 4 :
            System.out.println("The division of the two numbers is: "+(a/b));
            break;
            default:
            System.out.println("Please enter a valid numebr!");
        }
    }
}