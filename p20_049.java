interface A
{
void display();
}
interface B extends A
{
void Hello();
}
class C implements B
{
public void display()
{
System.out.println("HIIIII");
}
public void Hello()
{
System.out.println("hellllooo");
}
}
class p20_049
{
public static void main(String args[])

{
C c1=new C();
c1.display();
c1.Hello();
}
}