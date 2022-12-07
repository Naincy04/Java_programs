public class fibonacci {
    public static void main(String args[])
    {
        int a=0,b=1;
        int i,c=0;
        System.out.print(a + " ,");
        System.out.print(b + " ,");
        for(i=1;i<=8;i++)
        {
            c=a+b;
            System.out.print(c + " ,");
            a=b;
            b=c;
        }
    }
}
