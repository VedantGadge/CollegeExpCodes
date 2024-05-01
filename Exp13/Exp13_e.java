class Movie extends Thread 
{ 
 int v=1,r; 
 Movie(int x) 
 { 
  r=x; 
 } 
 public synchronized void run() 
 { 
  if(v>=r) 
  { 
   System.out.println(r+ " Ticket(s) booked for " +Thread.currentThread().getName()); 
   try 
   { 
    Thread.sleep(1000); 
   } 
   catch(Exception e) 
   { 
   } 
   v--; 
  } 
  else 
  { 
   System.out.println("Sorry, House Full " +Thread.currentThread().getName());
  
  } 
 } 
} 
class Exp13_e
{ 
 public static void main(String[] args) 
 { 
  Movie obj=new Movie(1); 
  Thread t1=new Thread(obj); 
  Thread t2=new Thread(obj); 
  t1.setName("Walter"); 
  t2.setName("Jesse"); 
  t1.start(); 
  t2.start(); 
 } 
}