public class pat2 
{
    public static void main(String args[])
    {
        int p=7;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=p;j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
            p=p-2;
        }
    }
    
}
