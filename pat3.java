public class pat3
{
    public static void main(String args[])
    {
        int p=2;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i + " ");
            }
            for(int k=p;k<=5;k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
            p++;
        }
    }    
}
