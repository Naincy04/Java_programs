class pat6
{
    public static void main(String args[])
    {
        int i,j,p=15;
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(p + " ");
                p--;
            }
            System.out.println();
        }
    }
}
