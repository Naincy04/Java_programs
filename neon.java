import java.io.*;
public class neon {
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter a number");
        int n= Integer.parseInt(in.readLine());
        int a=0,b=0,d=0,p=0;
        d=n;
        p = n*n;
        while(p!=0)
        {
            a=p%10;
            b=b+a;
            p=p/10;
        }
        if(d==b)
        {
            System.out.println("It is a neon number");
        }
        else
        {
            System.out.println("It is not a Neon number");
        }

    }
}
