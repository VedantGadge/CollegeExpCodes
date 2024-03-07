import java.util.*;
public class Exp3_a 
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int UL=0,LL=0,d=0,sp=0,spc=0;
        char temp;
        System.out.print("Enter the string: ");
        s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            temp=s.charAt(i);
            if((temp>='A')&&(temp<='Z'))
            UL++;
            else if((temp>='a')&&(temp<='z'))
            LL++;
            else if((temp>='0')&&(temp<='9'))
            d++;
            else if(temp==' ')
            sp++;
            else
            spc++;
        }
        System.out.println("The number of Uppercase letters is: "+UL);
        System.out.println("The number of Lowercase letters is: "+LL);
        System.out.println("The number of  digits is: "+d);
        System.out.println("The number of  spaces is: "+sp);
        System.out.println("The number of special characters is: "+spc);
    }
}
