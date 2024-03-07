import java.util.*;
public class Exp1_e2
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
            switch(n)
            {
                case 0:
                System.out.println("Grade: F");
                break;
                case 1:
                System.out.println("Grade: F");
                break;
                case 2:
                System.out.println("Grade: F");
                break;
                case 3:
                System.out.println("Grade: F");
                break;
                case 4:
                System.out.println("Grade: E");
                break;
                case 5:
                System.out.println("Grade: E");
                break;
                case 6:
                System.out.println("Grade: D");
                break;
                case 7:
                System.out.println("Grade: C");
                break;
                case 8:
                System.out.println("Grade: B");
                break;
                case 9:
                System.out.println("Grade: A");
                break;
                case 10:
                System.out.println("Grade: A");
                break;
                default:
                System.out.println("Enter valid marks!!");

            }
        }
        else
        {
            System.out.println("Enter valid marks!!");
        }
    }
}