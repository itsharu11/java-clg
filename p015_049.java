class p15_049  
{
public static void main(String args[]) 
{
int add=0;
int sum=0;
for (int i = 0; i <=args.length; i++) 
{
sum=add+=i;
}
System.out.println("The addition of five numbers is" + sum);
}
}