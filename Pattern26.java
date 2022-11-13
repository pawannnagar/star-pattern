class Pattern26
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int ele=1;
            for(int j=1;j<=2*i-1;j++)
            {
                if(j==1 || j==2*i-1)
                {
                    System.out.print("* ");
                    continue;
                }
                else if(i==j)
                {   
                    for(int k=1;k<=i-1;k++)
                    {
                        System.out.print(ele+" ");
                        ele++;
                    }
                    ele--;
                    ele--;
                    for(int g=i-2;g>=1;g--)
                    {
                        if(ele>0)
                        {
                          System.out.print(ele+" ");
                        }
                        ele--;
                    }
                }
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            int ele=1;
            for(int j=1;j<=2*i-1;j++)
            {
                if(j==1 || j==2*i-1)
                {
                    System.out.print("* ");
                    continue;
                }
                else if(i==j)
                {   
                    for(int k=1;k<=i-1;k++)
                    {
                        System.out.print(ele+" ");
                        ele++;
                    }
                    ele--;
                    ele--;
                    for(int g=i-2;g>=1;g--)
                    {
                        if(ele>0)
                        {
                          System.out.print(ele+" ");
                        }
                        ele--;
                    }
                }
            }
            System.out.println();
        }
    }
}