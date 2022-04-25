class p25_049
{
int rollno;
String name;
p25_049(int rollno,String name)
{
this.rollno=rollno;
this.name=name;
}
void display()
{
System.out.println(rollno + name);
}
}
class Mainclass
{
public static void main(String args[])
{
p25_049 p1=new p25_049("Harsh");
p25_049 p2=new p25_049("Upadhyay");
p1.display();
p2.display();
}
}