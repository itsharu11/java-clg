class p15_049
{
public static void main(String...s)
{
String str="Hello World";
char ch[]=new char[4];
str.getChars(1,5,ch,0);
System.out.println(ch);
} 
}