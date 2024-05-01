class Display1 extends Thread 
{ 
 int n; 
 public Display1(int n) 
 { 
  this.n=n; 
 } 
 public void run() 
 { 
  for(int i=0;i<n;i++) 
  { 
   System.out.print("/"); 
   try 
   { 
    Thread.sleep(100); 
   } 
   catch(Exception e) 
   { 
   } 
  } 
 } 
} 
class Display2 extends Thread 
{ 
 int n; 
 public Display2(int n) 
 { 
  this.n=n; 
 } 
 public void run() 
 { 
  for(int i=0;i<n;i++) 
  { 
   System.out.print("*"); 
   try 
   { 
    Thread.sleep(100); 
   } 
   catch(Exception e) 
   { 
   } 
  } 
 } 
} 
class Exp13_b 
{ 
 public static void main(String[] args) 
 { 
  Display1 obj1=new Display1(5); 
  Display2 obj2=new Display2(5); 
  obj1.start(); 
  obj2.start(); 
 } 
}