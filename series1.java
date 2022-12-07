import java.io.*;
public class series1 
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        double s=0.0;
        System.out.println("Enter the value upto which u want series");
        int n=Integer.parseInt(in.readLine());
        for(int i=0;i<n;i++)
        {
            s=s+Math.pow(10,i);
            System.out.print((int)s + " ,");
        }
    }   
}
