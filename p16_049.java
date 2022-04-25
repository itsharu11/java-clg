class p16_049
{
public static void main(String args[])
{
p16_049 a=new p16_049 ();
a.getchars();
a.charat();
a.substring();
}
void getchars()
{
String s1="Hello World";
char[] c1=new char[5];
s1.getChars(5,8,c1,0);
System.out.println(c1);
}
void charat()
{
String s1="Java Programming";
System.out.println(s1.charAt(3));
}
void substring()
{
String s1="Java Programming";
System.out.println(s1.substring(2,7));
System.out.println(s1.substring(2));
}
}