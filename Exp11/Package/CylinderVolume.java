import vol.Cylinder;
import java.util.*;
public class CylinderVolume 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Cylinder c = new Cylinder();
        System.out.println("Enter the radius of the cylinder: ");
        float r = sc.nextFloat();
        System.out.println("Enter the hieght of the cylinder: ");
        float h = sc.nextFloat();
        float vol;
        vol = c.VolumeCylinder(r,h);
        System.out.println("The volume of the cylinde is: "+vol);
    }
}
