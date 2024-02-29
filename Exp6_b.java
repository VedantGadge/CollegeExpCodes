//Exp6_b
import java.util.*;
public class Exp6_b 
{
    int img,real;
    void getData() // We cant make thios method static cuz then the real and img values will be overwritten n previous values of the previous obj will be erased.
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the real part of the  complex number: ");
        real=sc.nextInt();
        System.out.print("Enter the imaginary part of the complex number: ");
        img=sc.nextInt();
    }
    static void addComplex(Exp6_b n1,Exp6_b n2)
    {
        Exp6_b n3 = new Exp6_b();
        n3.real=n1.real+n2.real;
        n3.img=n1.img+n2.img;
        System.out.println("The first complex numeber is: "+n1.real+" + "+n1.img+"i");
        System.out.println("The second complex numeber is: "+n2.real+" + "+n2.img+"i");
        System.out.println("The addition of the two complex numebers is: "+n3.real+" + "+n3.img+"i");
    }
    public static void main(String args[])
    {
        Exp6_b n1 = new Exp6_b();
        Exp6_b n2 = new Exp6_b();
        n1.getData();
        n2.getData();
        addComplex(n1,n2);
    }
}
