import java.io.*;
public class triangle 
{
    public static void main(String args[])throws IOException
    {
        int p,b;
        double h,pm;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.print("Enter the value of perpendicular and base of triangle");
        p= Integer.parseInt(in.readLine());
        b= Integer.parseInt(in.readLine());
        h= Math.sqrt(p*p + b*b);
        pm= p+b+h;
        System.out.println("Hypoteneous is"+h);
        System.out.println("Area of triangle is"+ar);
        System.out.print("Perimeter of triangle is"+pm);
    }   
}
