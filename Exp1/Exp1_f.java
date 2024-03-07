import java.util.*;
public class Exp1_f 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        double sum=0;
        System.out.println("Enter the no. of terms in the series: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum+=1.0/(i*i);   //Put 1.0 istead of 1 else the value stored in sum will always be an integer
        }                     //as both the expresions are integer, which will truncate the decimal values.
        System.out.println("The sum of the series is: "+sum);
    }
}
