final class stud
{
private int enroll;
private String name;
private String dept;
private int fees;
stud(int enroll,String name, String dept, int fees)
{
this.enroll=enroll;
this.name=name;
this.dept=dept;
this.fees=fees;
}
void print()
{
System.out.println("Enrollment no = "+enroll+" Name = "+name+" Department = "+dept+" fees = "+fees);
}
}
class p21_049
{
public static void main(String args[])
{
stud a1=new stud(101,"xyz","CSE",5000);
stud a2=new stud(102,"abc","CIVIL",7000);
a1.print();
a2.print();
}
}