import java.io.*;
public class prime 
{
    public static void main(String args[])throws IOException
    {
        int n,i;
        int c=0;
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        System.out.println("enter a number");
        n= Integer.parseInt(in.readLine());
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Not a prime number");
        }
    }
}
