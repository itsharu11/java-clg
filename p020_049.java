class p020_049
{  
int rollno;  
String name;  
p020_049(int rollno,String name)
{  
this.rollno=rollno;  
this.name=name;    
}  
void display()
{
System.out.println(rollno + " " + name);
}  
public static void main(String aargs[])
{  
p020_049 p1=new p020_049(7049,"Harsh");  
p020_049 p2=new p020_049(7049,"Upadhyay");  
p1.display();  
p2.display();  
}
}