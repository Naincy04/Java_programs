public class pat1 
{
    public static void main(String args[])
    {
        int i,j; int p=1;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(p + " ");
                p++;
            }
            System.out.println();
        }
    }
    
}
