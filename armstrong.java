import java.io.*;
public class armstrong {
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter a number");
        int n= Integer.parseInt(in.readLine());
        int d=0,a=0,b=0;
        d=n;
        while(n!=0)
        {
            a=n%10;
            b=b+a*a*a;
            n=n/10;
        }
        if(d==b)
        {
            System.out.println("It is armstrong number");
        }
        else
        {
            System.out.println("It is not armstrong number");
        }
    }
}
