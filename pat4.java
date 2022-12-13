import java.io.*;
public class pat4 
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int p=1,c=2;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(p + " ");
                p=p-2;
                
            }
            System.out.println();
            p=p+(2*c);
            c++;
        }
        
    }
}
