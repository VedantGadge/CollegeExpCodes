class Display extends Thread 
{ 
 String name; 
 public Display(String name) 
 { 
  super(name); 
 } 
 public void run() 
 { 
  System.out.println("Thread " +getName()+ " has been started."); 
  for(int i=0;i<5;i++) 
  { 
   System.out.println(getName()+ " : " +i); 
   try 
   { 
    Thread.sleep(1000); 
   } 
   catch(Exception e) 
   { 
   } 
  } 
 } 
} 
class Exp13_c 
{ 
public static void main(String[] args) 
{ 
Display t1=new Display("Thread1"); 
Display t2=new Display("Thread2"); 
System.out.println("First Thread: " +t1.getName()); 
System.out.println("Second Thread: " +t2.getName()); 
t1.setName("Thread3"); 
t2.setName("Thread4"); 
System.out.println("New first Thread: " +t1.getName()); 
System.out.println("New second Thread: " +t2.getName()); 
t1.setPriority(5); 
t2.setPriority(4); 
System.out.println("New first Thread Priority: " +t1.getPriority()); 
System.out.println("New second Thread Priority: " +t2.getPriority()); 
t1.start(); 
t2.start(); 
} 
}