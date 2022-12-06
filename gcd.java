import java.io.*;
public class gcd {
    public static void main(String args[])throws IOException
    {
        int m,n,p,i;
        int h=0;
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        System.out.println("Enter two numbers");
        m= Integer.parseInt(in.readLine());
        n= Integer.parseInt(in.readLine());
        p=m*n;
        for(i=1;i<=p;i++)
        {
            if(m%i==0&&n%i==0)
            {
                h=i;
            } 
        }
        System.out.println("The GCD of two numbers are"+h);
    }
}
