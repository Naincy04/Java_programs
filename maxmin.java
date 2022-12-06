import java.io.*;
public class maxmin 
{
    public static void main(String args[])throws IOException
    {
        int n,max,min,m,i;
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        System.out.println("Enter your first number");
        n= Integer.parseInt(in.readLine());
        max =n; min=n;
        for(i=2;i<=10;i++)
        {
            System.out.println("Enter remaining nine numbers");
            m= Integer.parseInt(in.readLine());
            if(max<m)
            {
                max=m;
            }
            if(min>m)
            {
                min=m;
            }
        }
        System.out.println("Minimum of 10 numbers "+min);
        System.out.println("Maximum of 10 numbers "+max);
    }
}
