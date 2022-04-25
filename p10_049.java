class p10_049
{
public static void main(String args[])
{
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];
int d[][]=new int[3][3];
a[0][0]=1;
a[0][1]=2;
a[0][2]=3;
a[1][0]=1;
a[1][1]=2;
a[1][2]=3;
a[2][0]=1;
a[2][1]=2;
a[2][2]=3;
b[0][0]=1;
b[0][1]=2;
b[0][2]=3;
b[1][0]=1;
b[1][1]=2;
b[1][2]=3;
b[2][0]=1;
b[2][1]=2;
b[2][2]=3;
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
c[i][j]=a[i][j];
}
}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
d[i][j]=0;
for(int k=0;k<3;k++)      
{      
d[i][j]=a[i][k]*b[k][j];      
}
System.out.println();
System.out.print(d[i][j]+" ");
}
}
}
}
