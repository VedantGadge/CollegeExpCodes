import java.util.*;
public class Exp2_b 
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int Roll_no,Sub1,Sub2,Sub3,max=0,topper=0;
        int[][] student= new int[5][5];
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter the Roll no. of student "+(i+1)+" : ");
            student[i][0]=sc.nextInt();
            System.out.println("Enter the marks obtained in the 3 subjects out of 100 :");
            student[i][1]=sc.nextInt();
            student[i][2]=sc.nextInt();
            student[i][3]=sc.nextInt();
            student[i][4]=student[i][1]+student[i][2]+student[i][3];
            if(max<student[i][4])
            {
            max=student[i][4];
            topper=student[i][0];
            }
            else
            continue;
        }
        System.out.println("RollNumber\tSubject1\tSubject2\tSubject3\tTotal");
        for(int i=0;i<5;i++)
        {
        System.out.println(student[i][0]+"\t\t"+student[i][1]+"\t\t"+student[i][2]+"\t\t"+student[i][3]+"\t\t"+student[i][4]);
        }
        System.out.println("The student with the highest total marks is roll no. "+topper+" with a total of "+max+" marks.");

    }
}