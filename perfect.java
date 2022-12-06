import java.io.*;
public class perfect 
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        int i,n;
        int s=0;
        System.out.println("Enter a number ");
        n= Integer.parseInt(in.readLine());
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(s==n)
        {
            System.out.println("Perfect number");
        }
        else
        {
            System.out.println("Not a Perfect number");
        }
    }
}
