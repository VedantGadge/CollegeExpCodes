import java.util.*;
public class Exp5_a 
{
    static String empname,designation;
    static int empid,salary;
    static void getEmployee()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Employee: ");
        empname = sc.nextLine();
        System.out.println("Enter the designation of the Employee: ");
        designation = sc.nextLine();
        System.out.println("Enter the id of the Employee: ");
        empid = sc.nextInt();
        System.out.println("Enter the salary of the Employee: ");
        salary = sc.nextInt();
    }

    static void showGrade()
    {
        if(salary<100000)
        System.out.println("Grade: C");
        else if((salary>=100000)&&(salary<=200000))
        System.out.println("Grade: B");
        else
        System.out.println("Grade: A");

    }
    static void showEmployee()
    {
        System.out.println("The name of the Employee: "+empname);
        System.out.println("The designation of the Employee: "+designation);
        System.out.println("The id of the Employee: "+empid);
        System.out.println("The salary of the Employee: "+salary);
    }
    public static void main(String args[])
    {
        getEmployee();
        showEmployee();
        showGrade();
    }
}
