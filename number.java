import java.io.*;
public class number
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        System.out.println("Enter 1 to check whether a number is Perfect number");
        System.out.println("Enter 2 to check whether a number is Palindrome number");
        int a = Integer.parseInt(in.readLine());
        switch(a)
        {
            case 1: 
                System.out.println("Enter a number");
                int n=Integer.parseInt(in.readLine());
                int c=0;
                for(int i=1;i<n;i++)
                {
                    if(n%i==0)
                    {
                        c=c+i;
                    }
                }
                if(c==n)
                {
                    System.out.println("It is a Perfect number");
                }
                else
                {
                    System.out.println("It is not a perfect number");
                }
                break;

            case 2:
                System.out.println("Enter a number");
                n=Integer.parseInt(in.readLine());
                int p=n;
                int s,b=0;
                while(n!=0)
                {
                    s=n%10;
                    b=b*10 + s;
                    n=n/10;
                }
                if(b==p)
                {
                    System.out.println("It is a Palindrome Number");
                }
                else 
                {
                    System.out.println("It is not Palindrome number");
                }
                break;

            default: System.out.println("Inavalid choice");
        }
    }
}
    

