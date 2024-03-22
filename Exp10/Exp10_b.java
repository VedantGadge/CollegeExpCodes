import java.util.*;
final class Exp10_b 
{
    static final float rate = 8;
    static final void SimpleInterest(float principal,float time)
    {
        float SI = (principal*rate*time)/100 ;
        System.out.println("The Simple Interest is: "+SI);
        System.out.println("The Amount after "+time+" years is: "+(principal+SI));
    }
    static final void CompoundInterest(float principal,float time,float n)
    {
        float temp=0;
        for(int i=1;i<=(time*n);i++)
        {
            temp*=1+(rate/n);
        }
        float CI = (principal*temp)-principal ;
        System.out.println("The Simple Interest is: "+CI);
        System.out.println("The Amount after "+time+" years is: "+(principal*temp));
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        float principal,time,n;
        int t;
        System.out.println("Press 1 to calculate Simple Interest");
        System.out.println("Press 2 to calculate Compound Interest");
        t=sc.nextInt();
        if(t==1)
        {
            System.out.println("Enter principal value: ");
            principal = sc.nextFloat();
            System.out.println("Enter time in years:");
            time = sc.nextFloat();
            SimpleInterest(principal,time);
        }
        else if(t==2)
        {
            System.out.println("Enter principal value: ");
            principal = sc.nextFloat();
            System.out.println("Enter time in years:");
            time = sc.nextFloat();
            System.out.println("Enter the number of times the interest is compounded annually: ");
            n = sc.nextFloat();
            CompoundInterest(principal,time,n);
        }
        else
            System.out.println("Please enter a valid input!!!");
        
    }

}
