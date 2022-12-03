import java.io.*;
public class sum {
    public static void main(String args[])throws IOException
    {
        int a,b,c,d,e;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.print("Enter the value of a & b");
        a= Integer.parseInt(in.readLine());
        b= Integer.parseInt(in.readLine());
        c= a+b;
        d= a-b;
        e= a*b;
        System.out.println("Sum of two numbers are"+c);
        System.out.println("Difference between two numbers are"+d);
        System.out.print("Product of two numbers are"+e);
    }
}
