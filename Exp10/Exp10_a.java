interface MyInterface
{
public void method1();
}
class Exp10_a implements MyInterface
{
public void method1()
{
System.out.println("implementation of method1");
}
public static void main(String args[])
{
MyInterface obj = new Exp10_a(); //Dynamic method dispatch(Reference Method)
obj.method1();
}
}