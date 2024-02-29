//Exp6_a
import java.util.*;
public class Exp6_a 
{
    int id;
    String name;
    float  p,c,m,total;
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        name=sc.nextLine();
        System.out.print("Enter the id of the student: ");
        id=sc.nextInt();
        System.out.print("Enter the physics marks of the student: ");
        p=sc.nextFloat();
        System.out.print("Enter the chemistry marks of the student: ");
        c=sc.nextFloat();
        System.out.print("Enter the mathematics marks of the student: ");
        m=sc.nextFloat();
        total=p+c+m;
        System.out.println("Total marks: "+total);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the no. of students: ");
        n=sc.nextInt();
        Exp6_a[] s = new Exp6_a[n];
        Exp6_a temp = new Exp6_a();
        for(int i=0;i<s.length;i++)
        {
            s[i] = new Exp6_a();
            s[i].getData();
        }
        for(int i=0;i<s.length;i++)
        {
            for(int j=i+1;j<s.length;j++)
            {
                if(s[i].total<s[j].total)
                {
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        System.out.println("Total marks of students in descendiong order is as follows: ");
        System.out.println("Name\tID\tPhysics\tChem\tMaths\tTotal");
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i].name+"\t"+s[i].id+"\t"+s[i].p+"\t"+s[i].c+"\t"+s[i].m+"\t"+s[i].total);
        }
    }
}
