import java.util.*;
public class Exp2_a 
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,a,sum=0;
        System.out.print("Enter the length of the array: ");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
        arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum+=arr[j];
            }
            sum-=arr[i];
            System.out.print(sum+" ");
            sum=0;
        }
    }
}
