class p3_049
{
public static void main(String args[])
{
int sum=0;
int n=5;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
sum++;
}
}
if(sum==2)
{
System.out.println("number is prime number");
}
else
{
System.out.println("number is not a prime number");
}
}
}