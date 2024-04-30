import java.io.*; 
 
class Exp12_a 
{ 
 public static void main(String[] args) 
 { 
  try     
  { 
   Class.forName("ClassNotFound"); 
  } 
  catch(Exception e) 
  { 
   System.out.println(e); 
  } 
  try 
  { 
    StringReader sr=new StringReader("hello"); 
   sr.close(); 
   int data=sr.read(); 
  } 
  catch(Exception e) 
  { 
   System.out.println(e); 
  } 
  try 
  { 
   int n=Integer.parseInt("VedantG"); 
  } 
  catch(Exception e) 
  { 
   System.out.println(e); 
  } 
  try 
  { 
   int a=0,b=3; 
   int c=b/a; 
  } 
  catch(Exception e) 
  { 
   System.out.println(e); 
  } 
  try 
  { 
   int arr[]={3,4,5}; 
   int n1=arr[4]; 
  } 
  catch(Exception e) 
  { 
   System.out.println(e); 
  } 
  try 
  { 
   String str1=null; 
   int n2=str1.length(); 
  } 
  catch(Exception e) 
  { 
   System.out.println(e); 
  } 
 } 
}