import java.util.*;
class Staff
{
    String code;
    String name;
}
class Teacher extends Staff
{   
    String sub;
    float exp;
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("TEACHER");
        System.out.print("Enter the code: ");
        code = sc.nextLine();
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter the subject: ");
        sub = sc.nextLine();
        System.out.print("Enter the no. of experience in years: ");
        exp = sc.nextFloat();
        System.out.println();
    }
    void display()
    {
        System.out.println("Code: "+code);
        System.out.println("Name: "+name);
        System.out.println("Teaching Subject: "+sub);
        System.out.println("Yrs. of Experience: "+exp);
        System.out.println();
    }
}
class Typist extends Staff
{   
    float speed;
    float exp;
}
class Officer extends Staff
{   
    String dept;
    char grade;
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("OFFICER");
        System.out.print("Enter the code: ");
        code = sc.nextLine();
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter the department name: ");
        dept = sc.nextLine();
        System.out.print("Enter the grade: ");
        grade = sc.next().charAt(0);
        System.out.println();
    }
    void display()
    {
        System.out.println("Code: "+code);
        System.out.println("Name: "+name);
        System.out.println("Department name: "+dept);
        System.out.println("Grade of the officer: "+grade);
        System.out.println();
    }
}
class Regular extends Typist
{   
    int sal;
    void read()
    {
        System.out.println("REGULAR TYPIST");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the code: ");
        code = sc.nextLine();
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter the salary: ");
        sal = sc.nextInt();
        System.out.print("Enter the typing speed in wpm: ");
        speed = sc.nextFloat();
        System.out.print("Enter the experience in years: ");
        exp = sc.nextFloat();
        System.out.println();
    }
    void display()
    {
        System.out.println("Code: "+code);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+sal);
        System.out.println("The typing speed: "+speed+ " wpm");
        System.out.println("Yrs. of experience: "+exp);
        System.out.println();
    }
}
class Casual extends Typist
{   
    int daily_wages;
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("CASUAL TYPIST");
        System.out.print("Enter the code: ");
        code = sc.nextLine();
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter the daily wages: ");
        daily_wages = sc.nextInt();
        System.out.print("Enter the typing speed in wpm: ");
        speed = sc.nextFloat();
        System.out.print("Enter the experience in years: ");
        exp = sc.nextFloat();
        System.out.println();
    }
    void display()
    {
        System.out.println("Code: "+code);
        System.out.println("Name: "+name);
        System.out.println("Daily wages of: "+daily_wages);
        System.out.println("The typing speed: "+speed+ " wpm");
        System.out.println("Yrs. of experience: "+exp);
        System.out.println();
    }
}

class Exp8_c
{
    public static void main(String[] args) 
    {
        Teacher teacher = new Teacher();
        teacher.read();
        teacher.display();
        Officer officer = new Officer();
        officer.read();
        officer.display();
        Regular regular_typist = new Regular();
        regular_typist.read();
        regular_typist.display();
        Casual casual_typist = new Casual();
        casual_typist.read();
        casual_typist.display();
    }
}
