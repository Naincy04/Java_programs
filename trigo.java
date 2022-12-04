import java.io.*;
public class trigo {
    public static void main(String args[])throws IOException
    {
        int a,b;
        double m,n,p=0;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        System.out.println("Enter the first and second angle");
        a= Integer.parseInt(in.readLine());
        b= Integer.parseInt(in.readLine());
        m= (22.0/(7.0*180))*a;
        n= (22.0/(7.0*180))*b;
        p= (Math.tan(m)-Math.tan(n)/(1+(Math.tan(m)*Math.tan(n))));
        System.out.println("The value of the expression"+p);
    }
}
