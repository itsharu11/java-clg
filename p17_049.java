class A
{
int a=10;
int b=5;
public void show()
{
int c=0;
c=a+b;
System.out.println("add="+c);
}
}
class first extends A
{
public void show1()
{
int d=0;
d=a-b;
System.out.println("sub="+d);
}
}
class second extends first
{
public void show2()

{
int e=0;
e=a*b;
System.out.println("mul="+e);
}
}
class d extends A
{
public void show3()
{
int f=0;
f=a/b;
System.out.println("div="+f);
}
}
class p17_049
{
public static void main(String args[])
{
d d1=new d();
second s1=new second();
first f1=new first();
f1.show();
f1.show1();
System.out.println("single level"+"\n");
s1.show();
s1.show1();
s1.show2();
System.out.println("multi level"+"\n");
d1.show3();
System.out.println("hierarchical"+"\n");
}
}