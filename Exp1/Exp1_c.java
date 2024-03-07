public class Exp1_c 
{
    public static void main(String[] args) 
    {
        int a,len=0;
        a=Integer.parseInt(args[0]);
        if (a>0) 
        {
            while(a!=0)
            {
                a/=10;
                len++;
            }
            System.out.println("The length of the given positive integer is: "+len);
        }
        else
        System.out.println("Enter a negative number");
    }
}
