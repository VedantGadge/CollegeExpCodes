import java.util.*;

class Student
{
    int rollno;
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your roll no.: ");
        rollno = sc.nextInt();
    }
}

class Test extends Student
{
    int sem1_marks,sem2_marks;
    void read()
    {
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Sem 1 marks: ");
        sem1_marks=sc.nextInt();
        System.out.print("Enter your Sem 2 marks: ");
        sem2_marks=sc.nextInt();
    }
}

interface Sports
{
    void score();
}
class Result extends Test implements Sports 
{   
    int total;
    public void score()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Sports score: ");
        int score=sc.nextInt();
        total = score+sem1_marks+sem2_marks;
    }
}



public class Exp9_b extends Result
{   
    public static void main(String[] args) 
    {
        Result obj = new Result();
        obj.read();
        obj.score();
        System.out.println("The total marks of student with roll no. "+obj.rollno+" is: "+obj.total);
    }
    
}
