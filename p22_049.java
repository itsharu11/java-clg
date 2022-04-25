abstract class shape
{
abstract void area();
}
class Triangle extends shape
{
float b=4,h=5;
void area()
{
float a;
a=(h*b)/2;
System.out.println(a);
}
}
class rec extends shape
{
double l=5,b=4,h=2;
void area()
{
double c;
c=(l*b*h);
System.out.println(c);
}
}
class circle extends shape
{
public static final double PI=3.14;
double r=5;
void area()
{
double d;
d=PI*r*r;
System.out.println(d);
}
}
class p22_049
{
public static void main(String args[])
{
Triangle t1=new Triangle();
rec r1=new rec();
circle c1=new circle();
t1.area();
r1.area();
c1.area();
}
}