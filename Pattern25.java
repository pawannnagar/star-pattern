class Pattern25
{
public static void main(String[] args)
{
int n=4;
for(int i=1;i<=n;i++)
{
int flag=0;
for(int j=1;j<=2*i-1;j++)
{
if(j==1||j==2*i-1)
System.out.print("*");
else
{
for(int k=1;k<i;k++)
{
System.out.print(k);
flag++;
}
j+=flag;
for(int l=i-2;l>=1;l--)
{
System.out.print(l);
flag++;
}
j+=flag;
}
}
System.out.println("");
}
for(int i=n-1;i>=1;i--)
{
int flag=0;
for(int j=1;j<=2*i-1;j++)
{
if(j==1||j==2*i-1)
System.out.print("*");
else
{
for(int k=1;k<i;k++)
{
System.out.print(k);
flag++;
}
j+=flag;
for(int l=i-2;l>=1;l--)
{
System.out.print(l);
flag++;
}
j+=flag;
}
}
System.out.println("");
}
}
}