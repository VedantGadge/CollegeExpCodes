import java.util.*;
public class Exp1_e1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter your marks out of 100: ");
        n=sc.nextInt();
        if(n>=0&&n<=100)
        {
            n/=10;
            if(n>=0&&n<=3)
            System.out.println("Grade: F");
            else if(n==4)
            System.out.println("Grade: E");
            else if(n==5)
            System.out.println("Grade: E");
            else if(n==6)
            System.out.println("Grade: D");
            else if(n==7)
            System.out.println("Grade: C");
            else if(n==8)
            System.out.println("Grade: B");
            else if(n==9)
            System.out.println("Grade: A");
            else
            System.out.println("Grade: A");

        }
        else
        System.out.println("Enter valid marks!!");
    }
}
