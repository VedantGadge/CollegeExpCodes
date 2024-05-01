 
import java.util.*; 
class Input extends Thread 
{ 
 int n; 
 int arr[]; 
 public Input(int n) 
 { 
  this.n=n; 
 } 
 public void run() 
 { 
  int[] arr=new int[n]; 
  arr[0]=0; 
  arr[1]=1; 
  for(int i=0;i<n-2;i++) 
  { 
   arr[i+2]=arr[i]+arr[i+1]; 
  } 
  this.arr=arr; 
 } 
 public void display() 
 { 
  for(int i=0;i<n;i++) 
  { 
   System.out.print(arr[i]+ "\t"); 
  } 
 } 
} 
class Exp13_d
{ 
 public static void main(String[] args) 
 { 
  Scanner sc=new Scanner(System.in); 
  System.out.println("Enter the number of elements: "); 
  int n=sc.nextInt(); 
  Input obj=new Input(n); 
  System.out.println("The Fibonacci Series is: "); 
  obj.start(); 
  try 
  { 
   obj.join(); 
  } 
  catch(Exception e) 
  { 
  } 
  obj.display(); 
 } 
}