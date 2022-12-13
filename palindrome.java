import java.io.*;
public class palindrome {
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
            b=b*10+a;
            n=n/10;
        }
        if(d==b)
        {
            System.out.println("It is a palindrome number");
        }
        else
        {
            System.out.println("Its is not a palindrome number");
        }
    }
}
