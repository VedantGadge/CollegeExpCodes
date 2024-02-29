import java.util.*;
public class Exp5_c 
{
      static int Pow(int x,int n)
      { 
        if(n==0)
        return 1;
        else if(n<0)
        return 1/Pow(x,-n);
        else
        return x*Pow(x,n-1);
      } 
      public static void main(String[] args) 
      {
        Scanner sc = new Scanner(System.in);
        int n,x,y;
        System.out.println("Given equation: y = x^n");
        System.out.print("Enter the value of x: ");
        x=sc.nextInt();
        System.out.print("Enter the value of n: ");
        n=sc.nextInt();
        y=Pow(x,n);
        System.out.println("The value of y: "+y);
      }
}
