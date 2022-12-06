import java.io.*;
public class natural {
    public static void main(String args[])throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        int i,n,s=0;
        for(i=1;i<=10;i++)
        {
            System.out.println("Enter your numbers to add");
            n= Integer.parseInt(in.readLine());
            s=s+n;
        }
        System.out.println("The sum of 10 natural numbers are"+s);
    }
}
