class first
{
int year=1999;
}
class Demo extends first
{
void display()
{
if(year%4==0)
{
System.out.println("year is leap year"+year);
}
else
{
System.out.println("year is not leap year"+year);
}
}
}
class p18_049
{
public static void main(String args[])
{
Demo d1=new Demo();
d1.display();
}
}