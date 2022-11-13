class Pattern24
{
static int fact(int n)
{
int result=1;
for(int i=2;i<=n;i++)
{
result=result*i;
}
return result;
}
static int combination(int n,int r)
{
int comb=fact(n)/(fact(r)*fact(n-r));
return comb;
}
static void Pattern()
{
int n=5;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
System.out.print(" ");
for(int k=1;k<=i;k++)
{
int result=combination(i-1,k-1);
System.out.print(result+" ");
}
System.out.println("");
}
}
public static void main(String[] args)
{
Pattern();
}
}